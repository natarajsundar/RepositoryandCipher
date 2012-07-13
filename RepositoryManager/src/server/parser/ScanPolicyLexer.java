// $ANTLR 3.1 C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g 2008-11-17 18:44:07
 
package server.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ScanPolicyLexer extends Lexer {
    public static final int REPLYHEADER=26;
    public static final int SIGNATUREEND=11;
    public static final int RESPONSEHEADER=22;
    public static final int PUBLICKEYEND=9;
    public static final int ID=8;
    public static final int NOTBEFORE=13;
    public static final int EOF=-1;
    public static final int CREDENTIALEND=5;
    public static final int NUM=16;
    public static final int VALIDITYHEADER=12;
    public static final int NOTAFTER=14;
    public static final int SIGNATUREHEADER=10;
    public static final int CERTEND=18;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=29;
    public static final int CREDENTIALHEADER=4;
    public static final int T__34=34;
    public static final int REPLYEND=27;
    public static final int T__35=35;
    public static final int RESPONSEEND=23;
    public static final int NEWLINE=28;
    public static final int VALIDITYEND=15;
    public static final int CERTHEADER=17;
    public static final int CHALLENGEHEADER=19;
    public static final int PUBLICKEYHEADER=6;
    public static final int CHALLENGEBLOCK=20;
    public static final int REQUESTHEADER=24;
    public static final int CHALLENGEEND=21;
    public static final int REQUESTEND=25;
    public static final int BASE64BLOCK=7;

    // delegates
    // delegators

    public ScanPolicyLexer() {;} 
    public ScanPolicyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScanPolicyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:7:7: ( 'datime' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:7:9: 'datime'
            {
            match("datime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:8:7: ( '(' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:9:7: ( ',' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:10:7: ( ')' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:11:7: ( '.' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:12:7: ( ':-' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:12:9: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "CREDENTIALHEADER"
    public final void mCREDENTIALHEADER() throws RecognitionException {
        try {
            int _type = CREDENTIALHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:110:2: ( '-----BEGIN MPKI CREDENTIAL-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:110:4: '-----BEGIN MPKI CREDENTIAL-----'
            {
            match("-----BEGIN MPKI CREDENTIAL-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREDENTIALHEADER"

    // $ANTLR start "CREDENTIALEND"
    public final void mCREDENTIALEND() throws RecognitionException {
        try {
            int _type = CREDENTIALEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:113:2: ( '-----END MPKI CREDENTIAL-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:113:4: '-----END MPKI CREDENTIAL-----'
            {
            match("-----END MPKI CREDENTIAL-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREDENTIALEND"

    // $ANTLR start "PUBLICKEYHEADER"
    public final void mPUBLICKEYHEADER() throws RecognitionException {
        try {
            int _type = PUBLICKEYHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:116:2: ( '-----BEGIN PUBLIC KEY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:116:4: '-----BEGIN PUBLIC KEY-----'
            {
            match("-----BEGIN PUBLIC KEY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLICKEYHEADER"

    // $ANTLR start "PUBLICKEYEND"
    public final void mPUBLICKEYEND() throws RecognitionException {
        try {
            int _type = PUBLICKEYEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:119:2: ( '-----END PUBLIC KEY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:119:4: '-----END PUBLIC KEY-----'
            {
            match("-----END PUBLIC KEY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLICKEYEND"

    // $ANTLR start "SIGNATUREHEADER"
    public final void mSIGNATUREHEADER() throws RecognitionException {
        try {
            int _type = SIGNATUREHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:122:2: ( '-----BEGIN SIGNATURE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:122:4: '-----BEGIN SIGNATURE-----'
            {
            match("-----BEGIN SIGNATURE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGNATUREHEADER"

    // $ANTLR start "SIGNATUREEND"
    public final void mSIGNATUREEND() throws RecognitionException {
        try {
            int _type = SIGNATUREEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:125:2: ( '-----END SIGNATURE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:125:4: '-----END SIGNATURE-----'
            {
            match("-----END SIGNATURE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGNATUREEND"

    // $ANTLR start "VALIDITYHEADER"
    public final void mVALIDITYHEADER() throws RecognitionException {
        try {
            int _type = VALIDITYHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:128:2: ( '-----BEGIN VALIDITY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:128:4: '-----BEGIN VALIDITY-----'
            {
            match("-----BEGIN VALIDITY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDITYHEADER"

    // $ANTLR start "VALIDITYEND"
    public final void mVALIDITYEND() throws RecognitionException {
        try {
            int _type = VALIDITYEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:131:2: ( '-----END VALIDITY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:131:4: '-----END VALIDITY-----'
            {
            match("-----END VALIDITY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDITYEND"

    // $ANTLR start "CERTHEADER"
    public final void mCERTHEADER() throws RecognitionException {
        try {
            int _type = CERTHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:134:2: ( '-----BEGIN MPKI CERTIFICATE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:134:4: '-----BEGIN MPKI CERTIFICATE-----'
            {
            match("-----BEGIN MPKI CERTIFICATE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CERTHEADER"

    // $ANTLR start "CERTEND"
    public final void mCERTEND() throws RecognitionException {
        try {
            int _type = CERTEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:137:2: ( '-----END MPKI CERTIFICATE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:137:4: '-----END MPKI CERTIFICATE-----'
            {
            match("-----END MPKI CERTIFICATE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CERTEND"

    // $ANTLR start "CHALLENGEHEADER"
    public final void mCHALLENGEHEADER() throws RecognitionException {
        try {
            int _type = CHALLENGEHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:140:2: ( '-----BEGIN MPKI CHALLENGE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:140:4: '-----BEGIN MPKI CHALLENGE-----'
            {
            match("-----BEGIN MPKI CHALLENGE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHALLENGEHEADER"

    // $ANTLR start "CHALLENGEEND"
    public final void mCHALLENGEEND() throws RecognitionException {
        try {
            int _type = CHALLENGEEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:143:2: ( '-----END MPKI CHALLENGE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:143:4: '-----END MPKI CHALLENGE-----'
            {
            match("-----END MPKI CHALLENGE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHALLENGEEND"

    // $ANTLR start "RESPONSEHEADER"
    public final void mRESPONSEHEADER() throws RecognitionException {
        try {
            int _type = RESPONSEHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:146:2: ( '-----BEGIN MPKI CHALLENGE RESPONSE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:146:4: '-----BEGIN MPKI CHALLENGE RESPONSE-----'
            {
            match("-----BEGIN MPKI CHALLENGE RESPONSE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESPONSEHEADER"

    // $ANTLR start "RESPONSEEND"
    public final void mRESPONSEEND() throws RecognitionException {
        try {
            int _type = RESPONSEEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:149:2: ( '-----END MPKI CHALLENGE RESPONSE-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:149:4: '-----END MPKI CHALLENGE RESPONSE-----'
            {
            match("-----END MPKI CHALLENGE RESPONSE-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESPONSEEND"

    // $ANTLR start "REQUESTHEADER"
    public final void mREQUESTHEADER() throws RecognitionException {
        try {
            int _type = REQUESTHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:152:2: ( '-----BEGIN REPOSITORY CLIENT REQUEST-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:152:4: '-----BEGIN REPOSITORY CLIENT REQUEST-----'
            {
            match("-----BEGIN REPOSITORY CLIENT REQUEST-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUESTHEADER"

    // $ANTLR start "REQUESTEND"
    public final void mREQUESTEND() throws RecognitionException {
        try {
            int _type = REQUESTEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:155:2: ( '-----END REPOSITORY CLIENT REQUEST-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:155:4: '-----END REPOSITORY CLIENT REQUEST-----'
            {
            match("-----END REPOSITORY CLIENT REQUEST-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUESTEND"

    // $ANTLR start "REPLYHEADER"
    public final void mREPLYHEADER() throws RecognitionException {
        try {
            int _type = REPLYHEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:158:2: ( '-----BEGIN REPOSITORY SERVER REPLY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:158:4: '-----BEGIN REPOSITORY SERVER REPLY-----'
            {
            match("-----BEGIN REPOSITORY SERVER REPLY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLYHEADER"

    // $ANTLR start "REPLYEND"
    public final void mREPLYEND() throws RecognitionException {
        try {
            int _type = REPLYEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:161:2: ( '-----END REPOSITORY SERVER REPLY-----' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:161:4: '-----END REPOSITORY SERVER REPLY-----'
            {
            match("-----END REPOSITORY SERVER REPLY-----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLYEND"

    // $ANTLR start "NOTBEFORE"
    public final void mNOTBEFORE() throws RecognitionException {
        try {
            int _type = NOTBEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:164:2: ( 'Not before:' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:164:4: 'Not before:'
            {
            match("Not before:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTBEFORE"

    // $ANTLR start "NOTAFTER"
    public final void mNOTAFTER() throws RecognitionException {
        try {
            int _type = NOTAFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:167:2: ( 'Not after:' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:167:4: 'Not after:'
            {
            match("Not after:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTAFTER"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:2: ( ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* ) )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            {
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:6: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:12: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:12: ( '1' .. '9' )
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:13: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:23: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:170:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:173:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:173:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:173:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='$'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "BASE64BLOCK"
    public final void mBASE64BLOCK() throws RecognitionException {
        try {
            int _type = BASE64BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:176:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' )* )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:176:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' )*
            {
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:176:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='+'||(LA4_0>='/' && LA4_0<='9')||LA4_0=='='||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:
            	    {
            	    if ( input.LA(1)=='+'||(input.LA(1)>='/' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BASE64BLOCK"

    // $ANTLR start "CHALLENGEBLOCK"
    public final void mCHALLENGEBLOCK() throws RecognitionException {
        try {
            int _type = CHALLENGEBLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:179:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )* )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:179:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )*
            {
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:179:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<=':')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHALLENGEBLOCK"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:183:2: ( ( '\\r' )? '\\n' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:183:3: ( '\\r' )? '\\n'
            {
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:183:3: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:183:3: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:186:2: ( ( ' ' | '\\t' ) )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:186:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | CREDENTIALHEADER | CREDENTIALEND | PUBLICKEYHEADER | PUBLICKEYEND | SIGNATUREHEADER | SIGNATUREEND | VALIDITYHEADER | VALIDITYEND | CERTHEADER | CERTEND | CHALLENGEHEADER | CHALLENGEEND | RESPONSEHEADER | RESPONSEEND | REQUESTHEADER | REQUESTEND | REPLYHEADER | REPLYEND | NOTBEFORE | NOTAFTER | NUM | ID | BASE64BLOCK | CHALLENGEBLOCK | NEWLINE | WS )
        int alt7=32;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:46: CREDENTIALHEADER
                {
                mCREDENTIALHEADER(); 

                }
                break;
            case 8 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:63: CREDENTIALEND
                {
                mCREDENTIALEND(); 

                }
                break;
            case 9 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:77: PUBLICKEYHEADER
                {
                mPUBLICKEYHEADER(); 

                }
                break;
            case 10 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:93: PUBLICKEYEND
                {
                mPUBLICKEYEND(); 

                }
                break;
            case 11 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:106: SIGNATUREHEADER
                {
                mSIGNATUREHEADER(); 

                }
                break;
            case 12 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:122: SIGNATUREEND
                {
                mSIGNATUREEND(); 

                }
                break;
            case 13 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:135: VALIDITYHEADER
                {
                mVALIDITYHEADER(); 

                }
                break;
            case 14 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:150: VALIDITYEND
                {
                mVALIDITYEND(); 

                }
                break;
            case 15 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:162: CERTHEADER
                {
                mCERTHEADER(); 

                }
                break;
            case 16 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:173: CERTEND
                {
                mCERTEND(); 

                }
                break;
            case 17 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:181: CHALLENGEHEADER
                {
                mCHALLENGEHEADER(); 

                }
                break;
            case 18 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:197: CHALLENGEEND
                {
                mCHALLENGEEND(); 

                }
                break;
            case 19 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:210: RESPONSEHEADER
                {
                mRESPONSEHEADER(); 

                }
                break;
            case 20 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:225: RESPONSEEND
                {
                mRESPONSEEND(); 

                }
                break;
            case 21 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:237: REQUESTHEADER
                {
                mREQUESTHEADER(); 

                }
                break;
            case 22 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:251: REQUESTEND
                {
                mREQUESTEND(); 

                }
                break;
            case 23 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:262: REPLYHEADER
                {
                mREPLYHEADER(); 

                }
                break;
            case 24 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:274: REPLYEND
                {
                mREPLYEND(); 

                }
                break;
            case 25 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:283: NOTBEFORE
                {
                mNOTBEFORE(); 

                }
                break;
            case 26 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:293: NOTAFTER
                {
                mNOTAFTER(); 

                }
                break;
            case 27 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:302: NUM
                {
                mNUM(); 

                }
                break;
            case 28 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:306: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:309: BASE64BLOCK
                {
                mBASE64BLOCK(); 

                }
                break;
            case 30 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:321: CHALLENGEBLOCK
                {
                mCHALLENGEBLOCK(); 

                }
                break;
            case 31 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:336: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 32 :
                // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:1:344: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\15\1\14\4\uffff\1\22\1\uffff\1\14\2\26\1\14\4\uffff\2\14\3\uffff"+
        "\1\14\1\uffff\1\15\1\26\1\14\1\uffff\2\14\2\uffff\1\14\3\uffff\1"+
        "\46\117\uffff";
    static final String DFA7_eofS =
        "\163\uffff";
    static final String DFA7_minS =
        "\1\11\1\53\4\uffff\2\55\4\53\4\uffff\2\53\2\uffff\1\55\1\53\1\uffff"+
        "\1\60\2\53\1\55\1\40\1\53\1\55\1\141\1\53\1\102\2\uffff\1\44\1\105"+
        "\1\116\1\uffff\1\107\1\104\1\111\1\40\1\116\1\115\1\40\1\120\3\uffff"+
        "\1\105\1\115\1\113\2\120\3\uffff\1\105\1\111\1\117\1\113\1\120\1"+
        "\40\1\123\1\111\1\117\1\103\1\111\1\40\1\123\1\105\1\124\1\103\1"+
        "\111\2\uffff\1\101\1\117\1\105\1\124\1\114\1\122\2\uffff\1\101\1"+
        "\117\1\114\1\131\1\114\1\122\1\105\1\40\1\114\1\131\1\116\1\103"+
        "\1\105\1\40\1\107\2\uffff\1\116\1\103\1\105\1\107\2\uffff\1\40\1"+
        "\105\2\uffff\1\40\2\uffff";
    static final String DFA7_maxS =
        "\2\172\4\uffff\2\55\4\172\4\uffff\2\172\2\uffff\1\55\1\172\1\uffff"+
        "\3\172\1\55\2\172\1\55\1\142\1\172\1\105\2\uffff\1\172\1\105\1\116"+
        "\1\uffff\1\107\1\104\1\111\1\40\1\116\1\126\1\40\1\120\3\uffff\1"+
        "\105\1\126\1\113\2\120\3\uffff\1\105\1\111\1\117\1\113\1\120\1\40"+
        "\1\123\1\111\1\117\1\103\1\111\1\40\1\123\1\122\1\124\1\103\1\111"+
        "\2\uffff\1\101\1\117\1\122\1\124\1\114\1\122\2\uffff\1\101\1\117"+
        "\1\114\1\131\1\114\1\122\1\105\1\40\1\114\1\131\1\116\1\123\1\105"+
        "\1\40\1\107\2\uffff\1\116\1\123\1\105\1\107\2\uffff\1\55\1\105\2"+
        "\uffff\1\55\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\6\uffff\1\34\1\35\1\37\1\40\2\uffff\1"+
        "\36\1\6\2\uffff\1\33\12\uffff\1\31\1\32\3\uffff\1\1\10\uffff\1\12"+
        "\1\14\1\16\5\uffff\1\11\1\13\1\15\21\uffff\1\10\1\20\6\uffff\1\7"+
        "\1\17\17\uffff\1\26\1\30\4\uffff\1\25\1\27\2\uffff\1\22\1\24\1\uffff"+
        "\1\21\1\23";
    static final String DFA7_specialS =
        "\163\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\17\1\16\2\uffff\1\16\22\uffff\1\17\7\uffff\1\2\1\4\2\uffff"+
            "\1\3\1\7\1\5\1\uffff\1\11\11\12\1\6\6\uffff\15\13\1\10\14\13"+
            "\4\uffff\1\14\1\uffff\3\13\1\1\26\13",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\1\20\31\21",
            "",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\16\21\1\25\13\21",
            "\1\15\3\uffff\1\15\12\27\1\22\2\uffff\1\15\3\uffff\32\27\6"+
            "\uffff\32\27",
            "\1\15\3\uffff\1\15\12\30\1\22\2\uffff\1\15\3\uffff\32\27\6"+
            "\uffff\32\27",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\32\21",
            "",
            "",
            "",
            "",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\23\21\1\31\6\21",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\32\21",
            "",
            "",
            "\1\32",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\23\21\1\33\6\21",
            "",
            "\12\27\1\22\6\uffff\32\27\6\uffff\32\27",
            "\1\15\3\uffff\1\15\12\30\1\22\2\uffff\1\15\3\uffff\32\27\6"+
            "\uffff\32\27",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\10\21\1\34\21\21",
            "\1\35",
            "\1\36\12\uffff\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3"+
            "\uffff\32\21\6\uffff\32\21",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\14\21\1\37\15\21",
            "\1\40",
            "\1\42\1\41",
            "\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3\uffff\32\21\6"+
            "\uffff\4\21\1\43\25\21",
            "\1\44\2\uffff\1\45",
            "",
            "",
            "\1\14\6\uffff\1\15\3\uffff\1\15\12\21\1\22\2\uffff\1\15\3"+
            "\uffff\32\21\4\uffff\1\14\1\uffff\32\21",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\2\uffff\1\57\1\uffff\1\62\1\60\2\uffff\1\61",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66\2\uffff\1\67\1\uffff\1\72\1\70\2\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\2\uffff\1\115\11\uffff\1\113",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\124\2\uffff\1\125\11\uffff\1\123",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\17\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\1\152\17\uffff\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\157\14\uffff\1\156",
            "\1\160",
            "",
            "",
            "\1\162\14\uffff\1\161",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | CREDENTIALHEADER | CREDENTIALEND | PUBLICKEYHEADER | PUBLICKEYEND | SIGNATUREHEADER | SIGNATUREEND | VALIDITYHEADER | VALIDITYEND | CERTHEADER | CERTEND | CHALLENGEHEADER | CHALLENGEEND | RESPONSEHEADER | RESPONSEEND | REQUESTHEADER | REQUESTEND | REPLYHEADER | REPLYEND | NOTBEFORE | NOTAFTER | NUM | ID | BASE64BLOCK | CHALLENGEBLOCK | NEWLINE | WS );";
        }
    }
 

}