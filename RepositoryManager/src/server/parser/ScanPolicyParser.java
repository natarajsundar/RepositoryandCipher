// $ANTLR 3.1 C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g 2008-11-17 18:44:06

package server.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ScanPolicyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREDENTIALHEADER", "CREDENTIALEND", "PUBLICKEYHEADER", "BASE64BLOCK", "ID", "PUBLICKEYEND", "SIGNATUREHEADER", "SIGNATUREEND", "VALIDITYHEADER", "NOTBEFORE", "NOTAFTER", "VALIDITYEND", "NUM", "CERTHEADER", "CERTEND", "CHALLENGEHEADER", "CHALLENGEBLOCK", "CHALLENGEEND", "RESPONSEHEADER", "RESPONSEEND", "REQUESTHEADER", "REQUESTEND", "REPLYHEADER", "REPLYEND", "NEWLINE", "WS", "'datime'", "'('", "','", "')'", "'.'", "':-'"
    };
    public static final int REPLYHEADER=26;
    public static final int RESPONSEHEADER=22;
    public static final int SIGNATUREEND=11;
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
    public static final int WS=29;
    public static final int T__33=33;
    public static final int REPLYEND=27;
    public static final int T__34=34;
    public static final int CREDENTIALHEADER=4;
    public static final int NEWLINE=28;
    public static final int RESPONSEEND=23;
    public static final int T__35=35;
    public static final int VALIDITYEND=15;
    public static final int CERTHEADER=17;
    public static final int CHALLENGEHEADER=19;
    public static final int CHALLENGEBLOCK=20;
    public static final int PUBLICKEYHEADER=6;
    public static final int REQUESTHEADER=24;
    public static final int CHALLENGEEND=21;
    public static final int REQUESTEND=25;
    public static final int BASE64BLOCK=7;

    // delegates
    // delegators


        public ScanPolicyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ScanPolicyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[30+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ScanPolicyParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g"; }


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


    public static class messageType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageType"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:38:1: messageType : ( credential | request | response | reply );
    public final ScanPolicyParser.messageType_return messageType() throws RecognitionException {
        ScanPolicyParser.messageType_return retval = new ScanPolicyParser.messageType_return();
        retval.start = input.LT(1);
        int messageType_StartIndex = input.index();
        Object root_0 = null;

        ScanPolicyParser.credential_return credential1 = null;

        ScanPolicyParser.request_return request2 = null;

        ScanPolicyParser.response_return response3 = null;

        ScanPolicyParser.reply_return reply4 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:39:2: ( credential | request | response | reply )
            int alt1=4;
            switch ( input.LA(1) ) {
            case CREDENTIALHEADER:
                {
                alt1=1;
                }
                break;
            case REQUESTHEADER:
                {
                alt1=2;
                }
                break;
            case RESPONSEHEADER:
                {
                alt1=3;
                }
                break;
            case REPLYHEADER:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:39:4: credential
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_credential_in_messageType56);
                    credential1=credential();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, credential1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:40:4: request
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_request_in_messageType61);
                    request2=request();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, request2.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:41:4: response
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_response_in_messageType66);
                    response3=response();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, response3.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:42:4: reply
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reply_in_messageType71);
                    reply4=reply();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reply4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, messageType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "messageType"

    public static class credential_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "credential"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:45:1: credential : CREDENTIALHEADER publicKey ( certificate )* CREDENTIALEND ;
    public final ScanPolicyParser.credential_return credential() throws RecognitionException {
        ScanPolicyParser.credential_return retval = new ScanPolicyParser.credential_return();
        retval.start = input.LT(1);
        int credential_StartIndex = input.index();
        Object root_0 = null;

        Token CREDENTIALHEADER5=null;
        Token CREDENTIALEND8=null;
        ScanPolicyParser.publicKey_return publicKey6 = null;

        ScanPolicyParser.certificate_return certificate7 = null;


        Object CREDENTIALHEADER5_tree=null;
        Object CREDENTIALEND8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:46:2: ( CREDENTIALHEADER publicKey ( certificate )* CREDENTIALEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:46:4: CREDENTIALHEADER publicKey ( certificate )* CREDENTIALEND
            {
            root_0 = (Object)adaptor.nil();

            CREDENTIALHEADER5=(Token)match(input,CREDENTIALHEADER,FOLLOW_CREDENTIALHEADER_in_credential84); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREDENTIALHEADER5_tree = (Object)adaptor.create(CREDENTIALHEADER5);
            adaptor.addChild(root_0, CREDENTIALHEADER5_tree);
            }
            pushFollow(FOLLOW_publicKey_in_credential86);
            publicKey6=publicKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, publicKey6.getTree());
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:46:31: ( certificate )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CERTHEADER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:0:0: certificate
            	    {
            	    pushFollow(FOLLOW_certificate_in_credential88);
            	    certificate7=certificate();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, certificate7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            CREDENTIALEND8=(Token)match(input,CREDENTIALEND,FOLLOW_CREDENTIALEND_in_credential91); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREDENTIALEND8_tree = (Object)adaptor.create(CREDENTIALEND8);
            adaptor.addChild(root_0, CREDENTIALEND8_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, credential_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "credential"

    public static class publicKey_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "publicKey"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:48:1: publicKey : PUBLICKEYHEADER ( BASE64BLOCK | id1= ID {...}?)* PUBLICKEYEND ;
    public final ScanPolicyParser.publicKey_return publicKey() throws RecognitionException {
        ScanPolicyParser.publicKey_return retval = new ScanPolicyParser.publicKey_return();
        retval.start = input.LT(1);
        int publicKey_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token PUBLICKEYHEADER9=null;
        Token BASE64BLOCK10=null;
        Token PUBLICKEYEND11=null;

        Object id1_tree=null;
        Object PUBLICKEYHEADER9_tree=null;
        Object BASE64BLOCK10_tree=null;
        Object PUBLICKEYEND11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:49:2: ( PUBLICKEYHEADER ( BASE64BLOCK | id1= ID {...}?)* PUBLICKEYEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:49:4: PUBLICKEYHEADER ( BASE64BLOCK | id1= ID {...}?)* PUBLICKEYEND
            {
            root_0 = (Object)adaptor.nil();

            PUBLICKEYHEADER9=(Token)match(input,PUBLICKEYHEADER,FOLLOW_PUBLICKEYHEADER_in_publicKey102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLICKEYHEADER9_tree = (Object)adaptor.create(PUBLICKEYHEADER9);
            adaptor.addChild(root_0, PUBLICKEYHEADER9_tree);
            }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:49:20: ( BASE64BLOCK | id1= ID {...}?)*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BASE64BLOCK) ) {
                    alt3=1;
                }
                else if ( (LA3_0==ID) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:49:21: BASE64BLOCK
            	    {
            	    BASE64BLOCK10=(Token)match(input,BASE64BLOCK,FOLLOW_BASE64BLOCK_in_publicKey105); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BASE64BLOCK10_tree = (Object)adaptor.create(BASE64BLOCK10);
            	    adaptor.addChild(root_0, BASE64BLOCK10_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:49:33: id1= ID {...}?
            	    {
            	    id1=(Token)match(input,ID,FOLLOW_ID_in_publicKey109); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    id1_tree = (Object)adaptor.create(id1);
            	    adaptor.addChild(root_0, id1_tree);
            	    }
            	    if ( !(( !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_"))) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "publicKey", " !((String)id1.getText()).contains(\"-\") || !((String)id1.getText()).contains(\"_\")");
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            PUBLICKEYEND11=(Token)match(input,PUBLICKEYEND,FOLLOW_PUBLICKEYEND_in_publicKey115); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLICKEYEND11_tree = (Object)adaptor.create(PUBLICKEYEND11);
            adaptor.addChild(root_0, PUBLICKEYEND11_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, publicKey_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "publicKey"

    public static class signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signature"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:51:1: signature : SIGNATUREHEADER ( BASE64BLOCK | id1= ID {...}?)* SIGNATUREEND ;
    public final ScanPolicyParser.signature_return signature() throws RecognitionException {
        ScanPolicyParser.signature_return retval = new ScanPolicyParser.signature_return();
        retval.start = input.LT(1);
        int signature_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token SIGNATUREHEADER12=null;
        Token BASE64BLOCK13=null;
        Token SIGNATUREEND14=null;

        Object id1_tree=null;
        Object SIGNATUREHEADER12_tree=null;
        Object BASE64BLOCK13_tree=null;
        Object SIGNATUREEND14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:52:2: ( SIGNATUREHEADER ( BASE64BLOCK | id1= ID {...}?)* SIGNATUREEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:52:4: SIGNATUREHEADER ( BASE64BLOCK | id1= ID {...}?)* SIGNATUREEND
            {
            root_0 = (Object)adaptor.nil();

            SIGNATUREHEADER12=(Token)match(input,SIGNATUREHEADER,FOLLOW_SIGNATUREHEADER_in_signature126); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SIGNATUREHEADER12_tree = (Object)adaptor.create(SIGNATUREHEADER12);
            adaptor.addChild(root_0, SIGNATUREHEADER12_tree);
            }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:52:20: ( BASE64BLOCK | id1= ID {...}?)*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BASE64BLOCK) ) {
                    alt4=1;
                }
                else if ( (LA4_0==ID) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:52:21: BASE64BLOCK
            	    {
            	    BASE64BLOCK13=(Token)match(input,BASE64BLOCK,FOLLOW_BASE64BLOCK_in_signature129); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BASE64BLOCK13_tree = (Object)adaptor.create(BASE64BLOCK13);
            	    adaptor.addChild(root_0, BASE64BLOCK13_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:52:33: id1= ID {...}?
            	    {
            	    id1=(Token)match(input,ID,FOLLOW_ID_in_signature133); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    id1_tree = (Object)adaptor.create(id1);
            	    adaptor.addChild(root_0, id1_tree);
            	    }
            	    if ( !(( !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_"))) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "signature", " !((String)id1.getText()).contains(\"-\") || !((String)id1.getText()).contains(\"_\")");
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            SIGNATUREEND14=(Token)match(input,SIGNATUREEND,FOLLOW_SIGNATUREEND_in_signature139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SIGNATUREEND14_tree = (Object)adaptor.create(SIGNATUREEND14);
            adaptor.addChild(root_0, SIGNATUREEND14_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, signature_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "signature"

    public static class validity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validity"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:54:1: validity : VALIDITYHEADER NOTBEFORE timeTuple NOTAFTER timeTuple VALIDITYEND ;
    public final ScanPolicyParser.validity_return validity() throws RecognitionException {
        ScanPolicyParser.validity_return retval = new ScanPolicyParser.validity_return();
        retval.start = input.LT(1);
        int validity_StartIndex = input.index();
        Object root_0 = null;

        Token VALIDITYHEADER15=null;
        Token NOTBEFORE16=null;
        Token NOTAFTER18=null;
        Token VALIDITYEND20=null;
        ScanPolicyParser.timeTuple_return timeTuple17 = null;

        ScanPolicyParser.timeTuple_return timeTuple19 = null;


        Object VALIDITYHEADER15_tree=null;
        Object NOTBEFORE16_tree=null;
        Object NOTAFTER18_tree=null;
        Object VALIDITYEND20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:55:2: ( VALIDITYHEADER NOTBEFORE timeTuple NOTAFTER timeTuple VALIDITYEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:55:4: VALIDITYHEADER NOTBEFORE timeTuple NOTAFTER timeTuple VALIDITYEND
            {
            root_0 = (Object)adaptor.nil();

            VALIDITYHEADER15=(Token)match(input,VALIDITYHEADER,FOLLOW_VALIDITYHEADER_in_validity150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VALIDITYHEADER15_tree = (Object)adaptor.create(VALIDITYHEADER15);
            adaptor.addChild(root_0, VALIDITYHEADER15_tree);
            }
            NOTBEFORE16=(Token)match(input,NOTBEFORE,FOLLOW_NOTBEFORE_in_validity155); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NOTBEFORE16_tree = (Object)adaptor.create(NOTBEFORE16);
            adaptor.addChild(root_0, NOTBEFORE16_tree);
            }
            pushFollow(FOLLOW_timeTuple_in_validity157);
            timeTuple17=timeTuple();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timeTuple17.getTree());
            NOTAFTER18=(Token)match(input,NOTAFTER,FOLLOW_NOTAFTER_in_validity159); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NOTAFTER18_tree = (Object)adaptor.create(NOTAFTER18);
            adaptor.addChild(root_0, NOTAFTER18_tree);
            }
            pushFollow(FOLLOW_timeTuple_in_validity161);
            timeTuple19=timeTuple();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timeTuple19.getTree());
            VALIDITYEND20=(Token)match(input,VALIDITYEND,FOLLOW_VALIDITYEND_in_validity166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VALIDITYEND20_tree = (Object)adaptor.create(VALIDITYEND20);
            adaptor.addChild(root_0, VALIDITYEND20_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, validity_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "validity"

    public static class timeTuple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeTuple"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:59:1: timeTuple : 'datime' '(' NUM ',' NUM ',' NUM ',' NUM ',' NUM ',' NUM ')' '.' ;
    public final ScanPolicyParser.timeTuple_return timeTuple() throws RecognitionException {
        ScanPolicyParser.timeTuple_return retval = new ScanPolicyParser.timeTuple_return();
        retval.start = input.LT(1);
        int timeTuple_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal21=null;
        Token char_literal22=null;
        Token NUM23=null;
        Token char_literal24=null;
        Token NUM25=null;
        Token char_literal26=null;
        Token NUM27=null;
        Token char_literal28=null;
        Token NUM29=null;
        Token char_literal30=null;
        Token NUM31=null;
        Token char_literal32=null;
        Token NUM33=null;
        Token char_literal34=null;
        Token char_literal35=null;

        Object string_literal21_tree=null;
        Object char_literal22_tree=null;
        Object NUM23_tree=null;
        Object char_literal24_tree=null;
        Object NUM25_tree=null;
        Object char_literal26_tree=null;
        Object NUM27_tree=null;
        Object char_literal28_tree=null;
        Object NUM29_tree=null;
        Object char_literal30_tree=null;
        Object NUM31_tree=null;
        Object char_literal32_tree=null;
        Object NUM33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:60:2: ( 'datime' '(' NUM ',' NUM ',' NUM ',' NUM ',' NUM ',' NUM ')' '.' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:60:4: 'datime' '(' NUM ',' NUM ',' NUM ',' NUM ',' NUM ',' NUM ')' '.'
            {
            root_0 = (Object)adaptor.nil();

            string_literal21=(Token)match(input,30,FOLLOW_30_in_timeTuple176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal21_tree = (Object)adaptor.create(string_literal21);
            adaptor.addChild(root_0, string_literal21_tree);
            }
            char_literal22=(Token)match(input,31,FOLLOW_31_in_timeTuple178); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);
            }
            NUM23=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM23_tree = (Object)adaptor.create(NUM23);
            adaptor.addChild(root_0, NUM23_tree);
            }
            char_literal24=(Token)match(input,32,FOLLOW_32_in_timeTuple185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);
            }
            NUM25=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple187); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM25_tree = (Object)adaptor.create(NUM25);
            adaptor.addChild(root_0, NUM25_tree);
            }
            char_literal26=(Token)match(input,32,FOLLOW_32_in_timeTuple189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);
            }
            NUM27=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM27_tree = (Object)adaptor.create(NUM27);
            adaptor.addChild(root_0, NUM27_tree);
            }
            char_literal28=(Token)match(input,32,FOLLOW_32_in_timeTuple193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            NUM29=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM29_tree = (Object)adaptor.create(NUM29);
            adaptor.addChild(root_0, NUM29_tree);
            }
            char_literal30=(Token)match(input,32,FOLLOW_32_in_timeTuple197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);
            }
            NUM31=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM31_tree = (Object)adaptor.create(NUM31);
            adaptor.addChild(root_0, NUM31_tree);
            }
            char_literal32=(Token)match(input,32,FOLLOW_32_in_timeTuple201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);
            }
            NUM33=(Token)match(input,NUM,FOLLOW_NUM_in_timeTuple203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUM33_tree = (Object)adaptor.create(NUM33);
            adaptor.addChild(root_0, NUM33_tree);
            }
            char_literal34=(Token)match(input,33,FOLLOW_33_in_timeTuple208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = (Object)adaptor.create(char_literal34);
            adaptor.addChild(root_0, char_literal34_tree);
            }
            char_literal35=(Token)match(input,34,FOLLOW_34_in_timeTuple210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, timeTuple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "timeTuple"

    public static class certificate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "certificate"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:64:1: certificate : CERTHEADER ( clause )+ ( validity )? publicKey signature CERTEND ;
    public final ScanPolicyParser.certificate_return certificate() throws RecognitionException {
        ScanPolicyParser.certificate_return retval = new ScanPolicyParser.certificate_return();
        retval.start = input.LT(1);
        int certificate_StartIndex = input.index();
        Object root_0 = null;

        Token CERTHEADER36=null;
        Token CERTEND41=null;
        ScanPolicyParser.clause_return clause37 = null;

        ScanPolicyParser.validity_return validity38 = null;

        ScanPolicyParser.publicKey_return publicKey39 = null;

        ScanPolicyParser.signature_return signature40 = null;


        Object CERTHEADER36_tree=null;
        Object CERTEND41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:65:2: ( CERTHEADER ( clause )+ ( validity )? publicKey signature CERTEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:65:4: CERTHEADER ( clause )+ ( validity )? publicKey signature CERTEND
            {
            root_0 = (Object)adaptor.nil();

            CERTHEADER36=(Token)match(input,CERTHEADER,FOLLOW_CERTHEADER_in_certificate221); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CERTHEADER36_tree = (Object)adaptor.create(CERTHEADER36);
            adaptor.addChild(root_0, CERTHEADER36_tree);
            }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:65:15: ( clause )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:0:0: clause
            	    {
            	    pushFollow(FOLLOW_clause_in_certificate223);
            	    clause37=clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, clause37.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:65:24: ( validity )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VALIDITYHEADER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:65:25: validity
                    {
                    pushFollow(FOLLOW_validity_in_certificate228);
                    validity38=validity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, validity38.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_publicKey_in_certificate232);
            publicKey39=publicKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, publicKey39.getTree());
            pushFollow(FOLLOW_signature_in_certificate234);
            signature40=signature();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, signature40.getTree());
            CERTEND41=(Token)match(input,CERTEND,FOLLOW_CERTEND_in_certificate236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CERTEND41_tree = (Object)adaptor.create(CERTEND41);
            adaptor.addChild(root_0, CERTEND41_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, certificate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "certificate"

    public static class clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clause"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:67:1: clause : (l= literal '.' | literal ':-' literal ( ',' literal )* '.' );
    public final ScanPolicyParser.clause_return clause() throws RecognitionException {
        ScanPolicyParser.clause_return retval = new ScanPolicyParser.clause_return();
        retval.start = input.LT(1);
        int clause_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal42=null;
        Token string_literal44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        ScanPolicyParser.literal_return l = null;

        ScanPolicyParser.literal_return literal43 = null;

        ScanPolicyParser.literal_return literal45 = null;

        ScanPolicyParser.literal_return literal47 = null;


        Object char_literal42_tree=null;
        Object string_literal44_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:68:2: (l= literal '.' | literal ':-' literal ( ',' literal )* '.' )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:68:4: l= literal '.'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_clause248);
                    l=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());
                    char_literal42=(Token)match(input,34,FOLLOW_34_in_clause250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:69:4: literal ':-' literal ( ',' literal )* '.'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_clause255);
                    literal43=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal43.getTree());
                    string_literal44=(Token)match(input,35,FOLLOW_35_in_clause257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal44_tree = (Object)adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);
                    }
                    pushFollow(FOLLOW_literal_in_clause259);
                    literal45=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal45.getTree());
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:69:25: ( ',' literal )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==32) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:69:26: ',' literal
                    	    {
                    	    char_literal46=(Token)match(input,32,FOLLOW_32_in_clause262); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal46_tree = (Object)adaptor.create(char_literal46);
                    	    adaptor.addChild(root_0, char_literal46_tree);
                    	    }
                    	    pushFollow(FOLLOW_literal_in_clause264);
                    	    literal47=literal();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal47.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal48=(Token)match(input,34,FOLLOW_34_in_clause268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, clause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "clause"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:72:1: literal : ( predicate | id1= ID {...}? '(' ID ',' predicate ')' );
    public final ScanPolicyParser.literal_return literal() throws RecognitionException {
        ScanPolicyParser.literal_return retval = new ScanPolicyParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token char_literal50=null;
        Token ID51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        ScanPolicyParser.predicate_return predicate49 = null;

        ScanPolicyParser.predicate_return predicate53 = null;


        Object id1_tree=null;
        Object char_literal50_tree=null;
        Object ID51_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:73:2: ( predicate | id1= ID {...}? '(' ID ',' predicate ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==31) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==ID) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==32) ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4==ID) ) {
                                int LA9_6 = input.LA(6);

                                if ( (LA9_6==31) ) {
                                    alt9=2;
                                }
                                else if ( ((LA9_6>=32 && LA9_6<=33)) ) {
                                    alt9=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA9_3==33) ) {
                            alt9=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:73:4: predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_predicate_in_literal281);
                    predicate49=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate49.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:74:4: id1= ID {...}? '(' ID ',' predicate ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    id1=(Token)match(input,ID,FOLLOW_ID_in_literal289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    id1_tree = (Object)adaptor.create(id1);
                    adaptor.addChild(root_0, id1_tree);
                    }
                    if ( !(( "says".equals(id1.getText()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "literal", " \"says\".equals(id1.getText())");
                    }
                    char_literal50=(Token)match(input,31,FOLLOW_31_in_literal295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal50_tree = (Object)adaptor.create(char_literal50);
                    adaptor.addChild(root_0, char_literal50_tree);
                    }
                    ID51=(Token)match(input,ID,FOLLOW_ID_in_literal301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID51_tree = (Object)adaptor.create(ID51);
                    adaptor.addChild(root_0, ID51_tree);
                    }
                    char_literal52=(Token)match(input,32,FOLLOW_32_in_literal308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal52_tree = (Object)adaptor.create(char_literal52);
                    adaptor.addChild(root_0, char_literal52_tree);
                    }
                    pushFollow(FOLLOW_predicate_in_literal315);
                    predicate53=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate53.getTree());
                    char_literal54=(Token)match(input,33,FOLLOW_33_in_literal322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:81:1: predicate : ID '(' ID ( ',' ID )* ')' ;
    public final ScanPolicyParser.predicate_return predicate() throws RecognitionException {
        ScanPolicyParser.predicate_return retval = new ScanPolicyParser.predicate_return();
        retval.start = input.LT(1);
        int predicate_StartIndex = input.index();
        Object root_0 = null;

        Token ID55=null;
        Token char_literal56=null;
        Token ID57=null;
        Token char_literal58=null;
        Token ID59=null;
        Token char_literal60=null;

        Object ID55_tree=null;
        Object char_literal56_tree=null;
        Object ID57_tree=null;
        Object char_literal58_tree=null;
        Object ID59_tree=null;
        Object char_literal60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:82:2: ( ID '(' ID ( ',' ID )* ')' )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:82:4: ID '(' ID ( ',' ID )* ')'
            {
            root_0 = (Object)adaptor.nil();

            ID55=(Token)match(input,ID,FOLLOW_ID_in_predicate334); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID55_tree = (Object)adaptor.create(ID55);
            adaptor.addChild(root_0, ID55_tree);
            }
            char_literal56=(Token)match(input,31,FOLLOW_31_in_predicate336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
            }
            ID57=(Token)match(input,ID,FOLLOW_ID_in_predicate339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID57_tree = (Object)adaptor.create(ID57);
            adaptor.addChild(root_0, ID57_tree);
            }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:83:5: ( ',' ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:83:6: ',' ID
            	    {
            	    char_literal58=(Token)match(input,32,FOLLOW_32_in_predicate342); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal58_tree = (Object)adaptor.create(char_literal58);
            	    adaptor.addChild(root_0, char_literal58_tree);
            	    }
            	    ID59=(Token)match(input,ID,FOLLOW_ID_in_predicate344); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID59_tree = (Object)adaptor.create(ID59);
            	    adaptor.addChild(root_0, ID59_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            char_literal60=(Token)match(input,33,FOLLOW_33_in_predicate350); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal60_tree = (Object)adaptor.create(char_literal60);
            adaptor.addChild(root_0, char_literal60_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, predicate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicate"

    public static class challenge_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "challenge"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:86:1: challenge : CHALLENGEHEADER CHALLENGEBLOCK CHALLENGEEND ;
    public final ScanPolicyParser.challenge_return challenge() throws RecognitionException {
        ScanPolicyParser.challenge_return retval = new ScanPolicyParser.challenge_return();
        retval.start = input.LT(1);
        int challenge_StartIndex = input.index();
        Object root_0 = null;

        Token CHALLENGEHEADER61=null;
        Token CHALLENGEBLOCK62=null;
        Token CHALLENGEEND63=null;

        Object CHALLENGEHEADER61_tree=null;
        Object CHALLENGEBLOCK62_tree=null;
        Object CHALLENGEEND63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:87:2: ( CHALLENGEHEADER CHALLENGEBLOCK CHALLENGEEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:87:4: CHALLENGEHEADER CHALLENGEBLOCK CHALLENGEEND
            {
            root_0 = (Object)adaptor.nil();

            CHALLENGEHEADER61=(Token)match(input,CHALLENGEHEADER,FOLLOW_CHALLENGEHEADER_in_challenge361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHALLENGEHEADER61_tree = (Object)adaptor.create(CHALLENGEHEADER61);
            adaptor.addChild(root_0, CHALLENGEHEADER61_tree);
            }
            CHALLENGEBLOCK62=(Token)match(input,CHALLENGEBLOCK,FOLLOW_CHALLENGEBLOCK_in_challenge363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHALLENGEBLOCK62_tree = (Object)adaptor.create(CHALLENGEBLOCK62);
            adaptor.addChild(root_0, CHALLENGEBLOCK62_tree);
            }
            CHALLENGEEND63=(Token)match(input,CHALLENGEEND,FOLLOW_CHALLENGEEND_in_challenge365); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHALLENGEEND63_tree = (Object)adaptor.create(CHALLENGEEND63);
            adaptor.addChild(root_0, CHALLENGEEND63_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, challenge_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "challenge"

    public static class response_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "response"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:89:1: response : RESPONSEHEADER ( BASE64BLOCK | id1= ID {...}?)* RESPONSEEND ;
    public final ScanPolicyParser.response_return response() throws RecognitionException {
        ScanPolicyParser.response_return retval = new ScanPolicyParser.response_return();
        retval.start = input.LT(1);
        int response_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token RESPONSEHEADER64=null;
        Token BASE64BLOCK65=null;
        Token RESPONSEEND66=null;

        Object id1_tree=null;
        Object RESPONSEHEADER64_tree=null;
        Object BASE64BLOCK65_tree=null;
        Object RESPONSEEND66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:90:2: ( RESPONSEHEADER ( BASE64BLOCK | id1= ID {...}?)* RESPONSEEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:90:4: RESPONSEHEADER ( BASE64BLOCK | id1= ID {...}?)* RESPONSEEND
            {
            root_0 = (Object)adaptor.nil();

            RESPONSEHEADER64=(Token)match(input,RESPONSEHEADER,FOLLOW_RESPONSEHEADER_in_response376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RESPONSEHEADER64_tree = (Object)adaptor.create(RESPONSEHEADER64);
            adaptor.addChild(root_0, RESPONSEHEADER64_tree);
            }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:90:19: ( BASE64BLOCK | id1= ID {...}?)*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BASE64BLOCK) ) {
                    alt11=1;
                }
                else if ( (LA11_0==ID) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:90:20: BASE64BLOCK
            	    {
            	    BASE64BLOCK65=(Token)match(input,BASE64BLOCK,FOLLOW_BASE64BLOCK_in_response379); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BASE64BLOCK65_tree = (Object)adaptor.create(BASE64BLOCK65);
            	    adaptor.addChild(root_0, BASE64BLOCK65_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:90:32: id1= ID {...}?
            	    {
            	    id1=(Token)match(input,ID,FOLLOW_ID_in_response383); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    id1_tree = (Object)adaptor.create(id1);
            	    adaptor.addChild(root_0, id1_tree);
            	    }
            	    if ( !(( !((String)id1.getText()).contains("-") || !((String)id1.getText()).contains("_"))) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "response", " !((String)id1.getText()).contains(\"-\") || !((String)id1.getText()).contains(\"_\")");
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            RESPONSEEND66=(Token)match(input,RESPONSEEND,FOLLOW_RESPONSEEND_in_response389); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RESPONSEEND66_tree = (Object)adaptor.create(RESPONSEEND66);
            adaptor.addChild(root_0, RESPONSEEND66_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, response_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "response"

    public static class request_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "request"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:92:1: request : REQUESTHEADER id1= ID {...}? '(' id2= ID {...}? ',' ID ')' '.' REQUESTEND ;
    public final ScanPolicyParser.request_return request() throws RecognitionException {
        ScanPolicyParser.request_return retval = new ScanPolicyParser.request_return();
        retval.start = input.LT(1);
        int request_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token REQUESTHEADER67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token ID70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token REQUESTEND73=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object REQUESTHEADER67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object ID70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        Object REQUESTEND73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:93:2: ( REQUESTHEADER id1= ID {...}? '(' id2= ID {...}? ',' ID ')' '.' REQUESTEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:93:4: REQUESTHEADER id1= ID {...}? '(' id2= ID {...}? ',' ID ')' '.' REQUESTEND
            {
            root_0 = (Object)adaptor.nil();

            REQUESTHEADER67=(Token)match(input,REQUESTHEADER,FOLLOW_REQUESTHEADER_in_request400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REQUESTHEADER67_tree = (Object)adaptor.create(REQUESTHEADER67);
            adaptor.addChild(root_0, REQUESTHEADER67_tree);
            }
            id1=(Token)match(input,ID,FOLLOW_ID_in_request406); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id1_tree = (Object)adaptor.create(id1);
            adaptor.addChild(root_0, id1_tree);
            }
            if ( !(( "request".equals(id1.getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "request", " \"request\".equals(id1.getText()) ");
            }
            char_literal68=(Token)match(input,31,FOLLOW_31_in_request412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal68_tree = (Object)adaptor.create(char_literal68);
            adaptor.addChild(root_0, char_literal68_tree);
            }
            id2=(Token)match(input,ID,FOLLOW_ID_in_request418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id2_tree = (Object)adaptor.create(id2);
            adaptor.addChild(root_0, id2_tree);
            }
            if ( !(( "read".equals(id2.getText()) || "write".equals(id2.getText()) || "commit".equals(id2.getText()))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "request", " \"read\".equals(id2.getText()) || \"write\".equals(id2.getText()) || \"commit\".equals(id2.getText())");
            }
            char_literal69=(Token)match(input,32,FOLLOW_32_in_request425); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal69_tree = (Object)adaptor.create(char_literal69);
            adaptor.addChild(root_0, char_literal69_tree);
            }
            ID70=(Token)match(input,ID,FOLLOW_ID_in_request427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID70_tree = (Object)adaptor.create(ID70);
            adaptor.addChild(root_0, ID70_tree);
            }
            char_literal71=(Token)match(input,33,FOLLOW_33_in_request429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal71_tree = (Object)adaptor.create(char_literal71);
            adaptor.addChild(root_0, char_literal71_tree);
            }
            char_literal72=(Token)match(input,34,FOLLOW_34_in_request431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal72_tree = (Object)adaptor.create(char_literal72);
            adaptor.addChild(root_0, char_literal72_tree);
            }
            REQUESTEND73=(Token)match(input,REQUESTEND,FOLLOW_REQUESTEND_in_request434); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REQUESTEND73_tree = (Object)adaptor.create(REQUESTEND73);
            adaptor.addChild(root_0, REQUESTEND73_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, request_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "request"

    public static class reply_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reply"
    // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:102:1: reply : REPLYHEADER id1= ID {...}? REPLYEND ;
    public final ScanPolicyParser.reply_return reply() throws RecognitionException {
        ScanPolicyParser.reply_return retval = new ScanPolicyParser.reply_return();
        retval.start = input.LT(1);
        int reply_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token REPLYHEADER74=null;
        Token REPLYEND75=null;

        Object id1_tree=null;
        Object REPLYHEADER74_tree=null;
        Object REPLYEND75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:103:2: ( REPLYHEADER id1= ID {...}? REPLYEND )
            // C:\\Preetam\\Work\\workspace\\RepositoryManager\\src\\server\\parser\\ScanPolicy.g:103:4: REPLYHEADER id1= ID {...}? REPLYEND
            {
            root_0 = (Object)adaptor.nil();

            REPLYHEADER74=(Token)match(input,REPLYHEADER,FOLLOW_REPLYHEADER_in_reply445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REPLYHEADER74_tree = (Object)adaptor.create(REPLYHEADER74);
            adaptor.addChild(root_0, REPLYHEADER74_tree);
            }
            id1=(Token)match(input,ID,FOLLOW_ID_in_reply451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id1_tree = (Object)adaptor.create(id1);
            adaptor.addChild(root_0, id1_tree);
            }
            if ( !(( "granted".equals(id1.getText()) || "denied".equals(id1.getText()))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "reply", " \"granted\".equals(id1.getText()) || \"denied\".equals(id1.getText())");
            }
            REPLYEND75=(Token)match(input,REPLYEND,FOLLOW_REPLYEND_in_reply458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REPLYEND75_tree = (Object)adaptor.create(REPLYEND75);
            adaptor.addChild(root_0, REPLYEND75_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, reply_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "reply"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\10\1\37\1\10\1\40\1\10\1\42\1\37\2\uffff\2\10\2\40\1\10\1\41"+
        "\1\40\1\42";
    static final String DFA8_maxS =
        "\1\10\1\37\1\10\1\41\1\10\1\43\1\41\2\uffff\2\10\2\41\1\10\2\41"+
        "\1\43";
    static final String DFA8_acceptS =
        "\7\uffff\1\1\1\2\10\uffff";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\11\1\12\1\5",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15\1\16",
            "\1\12\1\5",
            "\1\17",
            "\1\20",
            "\1\15\1\16",
            "\1\7\1\10"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "67:1: clause : (l= literal '.' | literal ':-' literal ( ',' literal )* '.' );";
        }
    }
 

    public static final BitSet FOLLOW_credential_in_messageType56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_request_in_messageType61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_response_in_messageType66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reply_in_messageType71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREDENTIALHEADER_in_credential84 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_publicKey_in_credential86 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_certificate_in_credential88 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_CREDENTIALEND_in_credential91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLICKEYHEADER_in_publicKey102 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_BASE64BLOCK_in_publicKey105 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ID_in_publicKey109 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_PUBLICKEYEND_in_publicKey115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNATUREHEADER_in_signature126 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_BASE64BLOCK_in_signature129 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_ID_in_signature133 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_SIGNATUREEND_in_signature139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDITYHEADER_in_validity150 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NOTBEFORE_in_validity155 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_timeTuple_in_validity157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NOTAFTER_in_validity159 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_timeTuple_in_validity161 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_VALIDITYEND_in_validity166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_timeTuple176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_timeTuple178 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple183 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_timeTuple185 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple187 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_timeTuple189 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple191 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_timeTuple193 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple195 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_timeTuple197 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple199 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_timeTuple201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUM_in_timeTuple203 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_timeTuple208 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_timeTuple210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CERTHEADER_in_certificate221 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_clause_in_certificate223 = new BitSet(new long[]{0x0000000000001140L});
    public static final BitSet FOLLOW_validity_in_certificate228 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_publicKey_in_certificate232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_signature_in_certificate234 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CERTEND_in_certificate236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_clause248 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_clause250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_clause255 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_clause257 = new BitSet(new long[]{0x0000000000001140L});
    public static final BitSet FOLLOW_literal_in_clause259 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_clause262 = new BitSet(new long[]{0x0000000000001140L});
    public static final BitSet FOLLOW_literal_in_clause264 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_clause268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_literal281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_literal289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_literal295 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_literal301 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_literal308 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_predicate_in_literal315 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_literal322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_predicate334 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_predicate336 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_predicate339 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_predicate342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_predicate344 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_predicate350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHALLENGEHEADER_in_challenge361 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHALLENGEBLOCK_in_challenge363 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHALLENGEEND_in_challenge365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESPONSEHEADER_in_response376 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_BASE64BLOCK_in_response379 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_ID_in_response383 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_RESPONSEEND_in_response389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUESTHEADER_in_request400 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_request406 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_request412 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_request418 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_request425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_request427 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_request429 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_request431 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_REQUESTEND_in_request434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPLYHEADER_in_reply445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_reply451 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_REPLYEND_in_reply458 = new BitSet(new long[]{0x0000000000000002L});

}