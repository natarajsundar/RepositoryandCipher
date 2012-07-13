package server.conn;
import java.net.*;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.io.*;

import server.parser.MainParser;

import com.sun.org.apache.xml.internal.security.utils.Base64;


public class Server_mod {

public static void main(String[] args) {
	
	if(args.length<2)
	{
	System.out.println("Arguments: \"Server Policy\", \"Port Number\"");
	System.out.println("Exiting");
	System.exit(0);
	}
	
	int port = Integer.parseInt(args[1]); // just a random port. make sure you enter something between 1025 and 65535.

	try {
    ServerSocket ss = new ServerSocket(port); // create a server socket and bind it to the above port number.
    System.out.println("Waiting for a client...");
   
 
    Socket socket = ss.accept(); // make the server listen for a connection, and let you know when it gets one.

    System.out.println("Got a client, Starting the connection...");
    System.out.println();
 // receive file
    InputStream input = socket.getInputStream();
    String fileName="client_credential.msg";
    FileOutputStream output = new FileOutputStream(new File(fileName));
    byte[] outBuffer = new byte[socket.getReceiveBufferSize()];
    int bytesReceived = 0;
    while((bytesReceived = input.read(outBuffer)) != -1 )
        {
            output.write(outBuffer,0,bytesReceived);
            break;
        }
    output.flush();
    output.close();
       
    //complete the message file transfer  
   
    // the part where we check if the message is authentic
    MainParser mp= new MainParser();
    mp.parse(fileName);
    
    System.out.println("Sending a challenge message");
    OutputStream out = socket.getOutputStream();
    out.write("-----BEGIN MPKI CHALLENGE-----\n5ebd497f5bd68fbde838496c8f0ea86d\n-----END MPKI CHALLENGE-----".getBytes());
    out.flush();
    String file_response="chall_resp.txt";
    output = new FileOutputStream(new File(file_response));
    outBuffer = new byte[socket.getReceiveBufferSize()];
    bytesReceived = 0;
    while((bytesReceived = input.read(outBuffer)) != -1 )
        {
            output.write(outBuffer,0,bytesReceived);
            break;
        }
    output.flush();
    output.close();
   
    if(!mp.challengeResponse(file_response, "5ebd497f5bd68fbde838496c8f0ea86d"))
    {
    	System.out.println("Invalid response.");
    	System.out.println("Exiting...");
    	System.exit(0);
    }
    
    out.write("Authenticated.".getBytes());
    out.flush();
    mp.transform();
    out.write("Waiting for repository client request...".getBytes());
    out.flush();
    System.out.println();
    String response;
    BufferedReader input_file =  null;
    int count;
   
    output = new FileOutputStream(new File("chal_res.msg"));
    outBuffer = new byte[socket.getReceiveBufferSize()];
    bytesReceived = 0;
    System.out.println("Principl is autheticated"+"");
    while((bytesReceived = input.read(outBuffer)) != -1 )
        {
            output.write(outBuffer,0,bytesReceived);           
            break;
        }
    output.flush();
    output.close();
   
   // System.out.println("This is what i received as response"+ final_str);
    while(true)
    {
        out.write("Please enter a request, such as request(read, files_group0)".getBytes());
        //obtain the request and store it in a file
        output = new FileOutputStream(new File("request.msg"));
        outBuffer = new byte[socket.getReceiveBufferSize()];
        bytesReceived = 0;
        while((bytesReceived = input.read(outBuffer)) != -1 )
            {
                output.write(outBuffer,0,bytesReceived);
                break;
            }
       
        //display the contents of the request
        input_file= new BufferedReader(new FileReader("request.msg"));
        count=0;
        while (( response = input_file.readLine()) != null){
            System.out.println(response);
            if (count==3) break;
          }
        
        String request=mp.parseRequest("request.msg");
        
        System.out.println(request);
       
        output.flush();
        output.close();
        out.write("Access Granted".getBytes());
        continue;
    }

} catch(Exception e) {

e.printStackTrace();
}

}

}
