A server program listening on a TCP port. A client establishes a connection with the server, then
passes to the server its credentials, followed by one or more requests. 
The credential contains zero or more certicates that are basically signed Binder statements. 
The server also defines its policy in Binder and upon receiving the client’s credentials, 
perform Datalog evaluation to determine if the client can access the requested resources. Suppose the client holds public-private key pair (PK, SK), the protocol between the
server and client is described below.
(1) Client to Server : Credential, where Credential = PK cert1 . . . certn.
(2) Server to Client : challenge
(3) Client to Server : response
(4) Client to Server : Request
(5) Server to Client : Reply