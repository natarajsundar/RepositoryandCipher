package server.parser;

import java.util.*;

public class Certificate {
	List clause;
	String beforeTime;
	String afterTime;
	String publicKey;
	String signature;

	
	public Certificate(List clause, String beforeTime, String afterTime, String publicKey, String signature)
	{
		this.clause= clause;
		this.beforeTime=beforeTime;
		this.afterTime=afterTime;
		this.publicKey=publicKey;
		this.signature=signature;
	}
}
