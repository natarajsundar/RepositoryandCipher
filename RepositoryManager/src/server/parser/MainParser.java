package server.parser;

import java.security.*;
import java.security.interfaces.*;
import java.security.spec.*;
import java.text.*;
import java.util.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class MainParser {

	public String clientClauses = "";
	Credential credential=null;
	ArrayList<Certificate> validCertificates = new ArrayList<Certificate>();

	public void parse(String fileName) throws Exception {
		ScanPolicyLexer lex = new ScanPolicyLexer(new ANTLRFileStream(fileName));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ScanPolicyParser parser = new ScanPolicyParser(tokens);
		ScanPolicyParser.messageType_return result = parser.messageType();
		CommonTree t = (CommonTree) result.getTree();
		credential = new Credential(fileName, t);
		System.out.println("Client PK: " + credential.getClientPublicKey());
		List l = credential.getCertificate();
		for (int i = 0; i < l.size(); i++) {
			Certificate certificate = (Certificate) l.get(i);
			System.out.println("Certificate " + i + " ->>>");
			List tempList = certificate.clause;
			for (int j = 0; j < tempList.size(); j++) {
				System.out.println("Clause " + j + ": " + tempList.get(j));
			}
			System.out.println("PK :" + certificate.publicKey);
			System.out.println("Signature :" + certificate.signature);
			System.out.println("Before Time: " + certificate.beforeTime);
			System.out.println("After Time: " + certificate.afterTime);

			if (isValidSignature(certificate.publicKey, certificate.signature,
					certificate.clause, certificate.beforeTime,
					certificate.afterTime)) {
				validCertificates.add(certificate);
			} else {
				System.out
						.println("Certificate " + i + " -> Invalid Signature");
			}

			// if (!certificate.beforeTime.equals("")) {
			// if (!validTime(certificate.beforeTime, certificate.afterTime)) {
			// validCertificates.remove(certificate);
			// System.out.println("Certificate " + i
			// + " -> Invalid Certificate Time");
			// }
			// }
		}
	}

	public boolean isValidSignature(String publicKey, String signature,
			List clauses, String beforeTime, String afterTime) {
		boolean verifies = false;
		try {

			byte[] pubKeyBytes = convertToDER(publicKey);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			X509EncodedKeySpec pubSpec = new X509EncodedKeySpec(pubKeyBytes);
			RSAPublicKey pubKey = (RSAPublicKey) keyFactory
					.generatePublic(pubSpec);
			Signature sig = Signature.getInstance("MD5withRSA");
			sig.initVerify(pubKey);
			String clause = "";

			for (int i = 0; i < clauses.size(); i++) {
				clause = clause + clauses.get(i).toString();
			}

			clause = clause.trim();

			clause = clause + beforeTime + afterTime;

			byte[] data = clause.getBytes();

			sig.update(data);

			verifies = sig.verify(convertToDER(signature));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return verifies;
	}

	public byte[] convertToDER(String pem) {
		byte[] der = null;
		try {
			der = Base64.decode(pem);
		} catch (Base64DecodingException e) {
			e.printStackTrace();
		}
		return der;
	}

	public String convertToPEM(byte[] der) {
		String pem = Base64.encode(der);
		return pem;
	}

	public boolean validTime(String beforeTime, String afterTime) {
		int[] det1 = new int[6];
		int[] det2 = new int[6];
		beforeTime = beforeTime.substring(beforeTime.indexOf("(") + 1,
				beforeTime.indexOf(")"));
		afterTime = afterTime.substring(afterTime.indexOf("(") + 1, afterTime
				.indexOf(")"));
		StringTokenizer st1 = new StringTokenizer(beforeTime, ",");
		int i = 0;
		while (st1.hasMoreTokens()) {
			det1[i] = Integer.parseInt((String) st1.nextElement());
			i++;
		}

		StringTokenizer st2 = new StringTokenizer(afterTime, ",");
		int j = 0;
		while (st2.hasMoreTokens()) {
			det1[j] = Integer.parseInt((String) st2.nextElement());
			i++;
		}
		int bflag = 0;
		int aflag = 0;
		try {
			DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date beforeDate = dfm.parse(det1[0] + "-" + det1[1] + "-" + det1[2]
					+ " " + det1[3] + ":" + det1[4] + ":" + det1[5]);
			Date afterDate = dfm.parse(det2[0] + "-" + det2[1] + "-" + det2[2]
					+ " " + det2[3] + ":" + det2[4] + ":" + det2[5]);
			if (beforeDate.compareTo(new Date()) < 0) {
				bflag = 1;
			}
			if (afterDate.compareTo(new Date()) > 0) {
				aflag = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (aflag == 1 && bflag == 1)
			return true;
		return false;
	}

	public void transformClause(Certificate c) {
		System.out.println("Loading credentials...");
		System.out.println("Loading certificate...");

		ArrayList<String> newList = new ArrayList<String>();
		try {
			MessageDigest messageDisgest;
			messageDisgest = MessageDigest.getInstance("MD5");
			messageDisgest.update(convertToDER(c.publicKey));
			byte[] result = messageDisgest.digest();

			Formatter formatter = new Formatter();
			for (byte b : result)
				formatter.format("%02x", b);

			String md5Sum = formatter.toString();

			String rsa_md5Sum = "rsa_" + md5Sum;

			System.out.println("Signing principal is :" + rsa_md5Sum);

			for (int i = 0; i < c.clause.size(); i++) {
				String tempString = (String) c.clause.get(i);
				tempString = "says(" + rsa_md5Sum + "," + tempString;
				tempString = tempString.replace('.', ')') + ".";
				newList.add(tempString);
			}

			for (int i = 0; i < newList.size(); i++) {
				clientClauses = clientClauses + newList.get(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean challengeResponse(String fileName, String challenge) {
		ScanPolicyLexer lex = null;
		try {
			lex = new ScanPolicyLexer(new ANTLRFileStream(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ScanPolicyParser parser = new ScanPolicyParser(tokens);
		ScanPolicyParser.messageType_return result = null;
		try {
			result = parser.messageType();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		CommonTree tree = (CommonTree) result.getTree();
		String response = "";
		List l = tree.getChildren();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).toString().equals(
					"-----BEGIN MPKI CHALLENGE RESPONSE-----")) {
				i++;
				while (!l.get(i).toString().equals(
						"-----END MPKI CHALLENGE RESPONSE-----")) {
					response = response + l.get(i).toString() + '\n';
					i++;
				}
				break;
			}
		}
		if (validResponse(convertToDER(response), challenge))
			return true;
		return false;
	}

	public boolean validResponse(byte[] response, String challenge) {
		boolean verifies = false;
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			X509EncodedKeySpec pubSpec = new X509EncodedKeySpec(convertToDER(credential.clientPublicKey));
			RSAPublicKey pubKey = (RSAPublicKey) keyFactory
					.generatePublic(pubSpec);
			Signature sig = Signature.getInstance("MD5withRSA");
			sig.initVerify(pubKey);

			byte[] data = challenge.getBytes();

			sig.update(data);

			verifies = sig.verify(response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return verifies;		
		
	}

	public String parseRequest(String fileName) {
		ScanPolicyLexer lex = null;
		try {
			lex = new ScanPolicyLexer(new ANTLRFileStream(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ScanPolicyParser parser = new ScanPolicyParser(tokens);
		ScanPolicyParser.messageType_return result = null;
		try {
			result = parser.messageType();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		CommonTree tree = (CommonTree) result.getTree();
		String request = "";
		List l = tree.getChildren();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).toString().equals(
					"-----BEGIN REPOSITORY CLIENT REQUEST-----")) {
				while(true)
				{
					if(l.get(i).toString().equals("-----BEGIN REPOSITORY CLIENT REQUEST-----"))
						break;
				i++;
				request = request+l.get(i).toString();
				}
				break;
			}
		}
		String pk=getclientPK();
		request=request.replaceFirst("request(", "allow("+pk+",");
		return request;
	}

	public String getclientPK()
	{
		String rsa_md5Sum="";
		try {
			MessageDigest messageDisgest;
			messageDisgest = MessageDigest.getInstance("MD5");
			messageDisgest.update(convertToDER(credential.clientPublicKey));
			byte[] result = messageDisgest.digest();

			Formatter formatter = new Formatter();
			for (byte b : result)
				formatter.format("%02x", b);

			String md5Sum = formatter.toString();

			rsa_md5Sum = "rsa_" + md5Sum;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rsa_md5Sum;
		
	}
	
	public void transform()
	{
		if (validCertificates.size() == 0) {
			System.out.println("No Valid Certificates");
			System.out.println("Exiting...");
			System.exit(0);
		}

		for (int i = 0; i < validCertificates.size(); i++) {
			transformClause(validCertificates.get(i));
		}
		
	}

}
