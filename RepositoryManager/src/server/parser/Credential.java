package server.parser;

import java.util.*;
import org.antlr.runtime.tree.*;

public class Credential {
	String clientPublicKey;
	ArrayList<Certificate> certificateList = new ArrayList();
	String fileName;
	CommonTree tree;

	public Credential(String FileName, CommonTree tree) {
		this.tree = tree;
		this.fileName = FileName;
	}

	public String getClientPublicKey() {
		parseClientPublicKey();
		return this.clientPublicKey;
	}

	public List<Certificate> getCertificate() {
		parseCertificate();
		return this.certificateList;
	}

	private void parseClientPublicKey() {
		List l = tree.getChildren();
		clientPublicKey="";
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).toString().equals("-----BEGIN PUBLIC KEY-----"))
			{
				i++;
				while(!l.get(i).toString().equals("-----END PUBLIC KEY-----"))
				{
					clientPublicKey = clientPublicKey+l.get(i).toString()+'\n';
					i++;
				}
				
				break;
			}
		}
	}

	public void parseCertificate() {
		List l = tree.getChildren();
		for (int i = 0; i < l.size(); i++) {
			String publicKey = "";
			String notBefore = "";
			String notAfter = "";
			String signature = "";
			ArrayList<String> clauseList = new ArrayList();
			String clause = "";
			if (l.get(i).toString().equals("-----BEGIN MPKI CERTIFICATE-----")) {
				i++;
				while (true) {
					if (l.get(i).toString().equals(
							"-----END MPKI CERTIFICATE-----")) {
						Certificate certificate = new Certificate(clauseList,
								notBefore, notAfter, publicKey, signature);
						certificateList.add(certificate);
						break;
					} else if (l.get(i).toString().equals(
							"-----BEGIN PUBLIC KEY-----")) {
						i++;
						while(!l.get(i).toString().equals("-----END PUBLIC KEY-----"))
						{
							publicKey = publicKey+l.get(i).toString()+'\n';
							i++;
						}
						i++;
					} else if (l.get(i).toString().equals("Not before:")) {
						i++;
						while (!l.get(i).toString().equals("Not after:")) {
							notBefore = notBefore + l.get(i).toString();
							i++;
						}
						i++;
						while (!l.get(i).toString().equals(
								"-----END VALIDITY-----")) {
							notAfter = notAfter + l.get(i).toString();
							i++;
						}
					} else if (l.get(i).toString().equals(
							"-----BEGIN SIGNATURE-----")) {
						i++;
						while(!l.get(i).toString().equals("-----END SIGNATURE-----"))
						{
							signature = signature+l.get(i).toString()+'\n';
							i++;
						}
						i++;
					} else if (l.get(i).toString().equals(".")) {
						clause = clause + l.get(i).toString();
						clauseList.add(clause);
						clause = "";
						i++;
					}
					else
					{
					clause = clause + l.get(i).toString();
					i++;
					}

				}
			}
		}
	}

}
