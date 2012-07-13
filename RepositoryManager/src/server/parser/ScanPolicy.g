grammar ScanPolicy;

options { backtrack=true; memoize=true; output=AST;}
@header
{
package server.parser;
}

@lexer::header
{ 
package server.parser;
}

@rulecatch { 
} 

@members{
protected void mismatch(IntStream input, int ttype, BitSet follow) 
	throws RecognitionException
{
	throw new MismatchedTokenException(ttype, input);
}

@Override
public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
	throws RecognitionException
{
	throw e;
}

@Override
protected Object recoverFromMismatchedToken(IntStream input, int ttype,
      BitSet follow) throws RecognitionException {
	throw new RecognitionException();
}
}

messageType
	: credential
	| request
	| response
	| reply
	;	

credential 
	: CREDENTIALHEADER publicKey certificate* CREDENTIALEND
	;
publicKey 
	: PUBLICKEYHEADER (BASE64BLOCK|id1=ID { !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_")}?)* PUBLICKEYEND
	;
signature 
	: SIGNATUREHEADER (BASE64BLOCK|id1=ID { !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_")}?)* SIGNATUREEND
	;
validity 
	: VALIDITYHEADER
	  NOTBEFORE timeTuple NOTAFTER timeTuple
	  VALIDITYEND
	;
timeTuple
	: 'datime' '('
	  NUM ',' NUM ',' NUM ',' NUM ',' NUM ',' NUM
	  ')' '.'
	;
certificate 
	: CERTHEADER clause+  (validity)? publicKey signature CERTEND
	;
clause
	: l=literal '.'
	| literal ':-' literal (',' literal)* '.'
	;
	
literal 
	: predicate 
	| id1=ID
	{ "says".equals(id1.getText())}?  '('
	   ID 
	   ',' 
	   predicate 
	   ')'
 	;
predicate 
	: ID '('
	ID (',' ID)* 
	')'
	;
challenge 
	: CHALLENGEHEADER CHALLENGEBLOCK CHALLENGEEND
	;
response 
	: RESPONSEHEADER (BASE64BLOCK|id1=ID { !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_")}?)* RESPONSEEND
	;
request 
	: REQUESTHEADER 
	id1=ID
	{ "request".equals(id1.getText()) }?
	'(' 
	id2=ID
	{ "read".equals(id2.getText()) || "write".equals(id2.getText()) || "commit".equals(id2.getText())}? 
	',' ID ')' '.'
	REQUESTEND
	;
reply 
	: REPLYHEADER 
	id1=ID
	{ "granted".equals(id1.getText()) || "denied".equals(id1.getText())}? 
	REPLYEND
	;
	
CREDENTIALHEADER
	: '-----BEGIN MPKI CREDENTIAL-----'
	;
CREDENTIALEND
	: '-----END MPKI CREDENTIAL-----'
	;
PUBLICKEYHEADER
	: '-----BEGIN PUBLIC KEY-----'
	;
PUBLICKEYEND
	: '-----END PUBLIC KEY-----'
	;
SIGNATUREHEADER
	: '-----BEGIN SIGNATURE-----'
	;
SIGNATUREEND
	: '-----END SIGNATURE-----'
	;
VALIDITYHEADER
	: '-----BEGIN VALIDITY-----'
	;
VALIDITYEND
	: '-----END VALIDITY-----'
	;
CERTHEADER
	: '-----BEGIN MPKI CERTIFICATE-----'
	;
CERTEND
	: '-----END MPKI CERTIFICATE-----'
	;
CHALLENGEHEADER
	: '-----BEGIN MPKI CHALLENGE-----'
	;
CHALLENGEEND
	: '-----END MPKI CHALLENGE-----'
	;
RESPONSEHEADER 
	: '-----BEGIN MPKI CHALLENGE RESPONSE-----'
	;
RESPONSEEND 
	: '-----END MPKI CHALLENGE RESPONSE-----'
	;
REQUESTHEADER 
	: '-----BEGIN REPOSITORY CLIENT REQUEST-----'
	;
REQUESTEND
	: '-----END REPOSITORY CLIENT REQUEST-----'
	;
REPLYHEADER 
	: '-----BEGIN REPOSITORY SERVER REPLY-----'
	;
REPLYEND 
	: '-----END REPOSITORY SERVER REPLY-----'
	;
NOTBEFORE 
	: 'Not before:'
	;
NOTAFTER 
	: 'Not after:'
	;
NUM
	: ( '0' | ('1'..'9') ('0'..'9')* )
	;	
ID
	: ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
	;	
BASE64BLOCK 
	: ('a'..'z' | 'A'..'Z' | '0'..'9' | '/' | '+' | '=')*
	;
CHALLENGEBLOCK 	
	: ('a'..'z' | 'A'..'Z' | '0'..'9' | ':')*
	;

NEWLINE
	:'\r'? '\n'  { $channel=HIDDEN; }
	;
WS
	:   (' '|'\t') { $channel=HIDDEN; }
	;
	
