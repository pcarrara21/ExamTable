// $ANTLR 3.4 ET.g 2015-05-05 15:35:55

  package lc.project.grammar;  
  import lc.project.src.Exam;
  import java.util.Vector;
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ETLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int DIGITX1=4;
    public static final int DIGITX2=5;
    public static final int DIGITX3=6;
    public static final int DIGITX4=7;
    public static final int DIGITX5=8;
    public static final int GGMMAA=9;
    public static final int HHMM=10;
    public static final int IDENT=11;
    public static final int WS=12;

     
        private List<String> errors = new LinkedList<String>();    
         
        
        public void displayRecognitionError(String[] tokenNames, RecognitionException e) 
        {        
            String hdr = getErrorHeader(e);        
            String msg = getErrorMessage(e, tokenNames);        
            errors.add(hdr + " " + msg);    
        }    

        public List<String> getErrors() 
        {        
            return errors;    
        }
     
     

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ETLexer() {} 
    public ETLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ETLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ET.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:32:7: ( 'add' )
            // ET.g:32:9: 'add'
            {
            match("add"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:33:7: ( 'at' )
            // ET.g:33:9: 'at'
            {
            match("at"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:34:7: ( 'color' )
            // ET.g:34:9: 'color'
            {
            match("color"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:35:7: ( 'on' )
            // ET.g:35:9: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:91:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ET.g:91:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // ET.g:91:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ET.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "DIGITX1"
    public final void mDIGITX1() throws RecognitionException {
        try {
            // ET.g:92:18: ( ( '0' .. '3' ) ( '0' .. '9' ) )
            // ET.g:92:20: ( '0' .. '3' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITX1"

    // $ANTLR start "DIGITX2"
    public final void mDIGITX2() throws RecognitionException {
        try {
            // ET.g:93:18: ( ( '0' .. '1' ) ( '0' .. '9' ) )
            // ET.g:93:20: ( '0' .. '1' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITX2"

    // $ANTLR start "DIGITX3"
    public final void mDIGITX3() throws RecognitionException {
        try {
            // ET.g:94:18: ( ( '0' .. '9' ) ( '0' .. '9' ) )
            // ET.g:94:20: ( '0' .. '9' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITX3"

    // $ANTLR start "GGMMAA"
    public final void mGGMMAA() throws RecognitionException {
        try {
            int _type = GGMMAA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:95:7: ( DIGITX1 '/' DIGITX2 '/' DIGITX3 )
            // ET.g:95:9: DIGITX1 '/' DIGITX2 '/' DIGITX3
            {
            mDIGITX1(); 


            match('/'); 

            mDIGITX2(); 


            match('/'); 

            mDIGITX3(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GGMMAA"

    // $ANTLR start "DIGITX4"
    public final void mDIGITX4() throws RecognitionException {
        try {
            // ET.g:96:18: ( ( '0' .. '2' ) ( '0' .. '9' ) )
            // ET.g:96:20: ( '0' .. '2' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITX4"

    // $ANTLR start "DIGITX5"
    public final void mDIGITX5() throws RecognitionException {
        try {
            // ET.g:97:18: ( ( '0' .. '5' ) ( '0' .. '9' ) )
            // ET.g:97:20: ( '0' .. '5' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '5') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITX5"

    // $ANTLR start "HHMM"
    public final void mHHMM() throws RecognitionException {
        try {
            int _type = HHMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:98:5: ( DIGITX4 '.' DIGITX5 )
            // ET.g:98:7: DIGITX4 '.' DIGITX5
            {
            mDIGITX4(); 


            match('.'); 

            mDIGITX5(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HHMM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ET.g:99:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ET.g:99:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ET.g:99:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ET.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ET.g:1:8: ( T__13 | T__14 | T__15 | T__16 | IDENT | GGMMAA | HHMM | WS )
        int alt3=8;
        switch ( input.LA(1) ) {
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'd':
                {
                int LA3_8 = input.LA(3);

                if ( (LA3_8=='d') ) {
                    int LA3_14 = input.LA(4);

                    if ( ((LA3_14 >= '0' && LA3_14 <= '9')||(LA3_14 >= 'A' && LA3_14 <= 'Z')||(LA3_14 >= 'a' && LA3_14 <= 'z')) ) {
                        alt3=5;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    alt3=5;
                }
                }
                break;
            case 't':
                {
                int LA3_9 = input.LA(3);

                if ( ((LA3_9 >= '0' && LA3_9 <= '9')||(LA3_9 >= 'A' && LA3_9 <= 'Z')||(LA3_9 >= 'a' && LA3_9 <= 'z')) ) {
                    alt3=5;
                }
                else {
                    alt3=2;
                }
                }
                break;
            default:
                alt3=5;
            }

            }
            break;
        case 'c':
            {
            int LA3_2 = input.LA(2);

            if ( (LA3_2=='o') ) {
                int LA3_10 = input.LA(3);

                if ( (LA3_10=='l') ) {
                    int LA3_16 = input.LA(4);

                    if ( (LA3_16=='o') ) {
                        int LA3_21 = input.LA(5);

                        if ( (LA3_21=='r') ) {
                            int LA3_22 = input.LA(6);

                            if ( ((LA3_22 >= '0' && LA3_22 <= '9')||(LA3_22 >= 'A' && LA3_22 <= 'Z')||(LA3_22 >= 'a' && LA3_22 <= 'z')) ) {
                                alt3=5;
                            }
                            else {
                                alt3=3;
                            }
                        }
                        else {
                            alt3=5;
                        }
                    }
                    else {
                        alt3=5;
                    }
                }
                else {
                    alt3=5;
                }
            }
            else {
                alt3=5;
            }
            }
            break;
        case 'o':
            {
            int LA3_3 = input.LA(2);

            if ( (LA3_3=='n') ) {
                int LA3_11 = input.LA(3);

                if ( ((LA3_11 >= '0' && LA3_11 <= '9')||(LA3_11 >= 'A' && LA3_11 <= 'Z')||(LA3_11 >= 'a' && LA3_11 <= 'z')) ) {
                    alt3=5;
                }
                else {
                    alt3=4;
                }
            }
            else {
                alt3=5;
            }
            }
            break;
        case '0':
        case '1':
        case '2':
            {
            int LA3_4 = input.LA(2);

            if ( ((LA3_4 >= '0' && LA3_4 <= '9')) ) {
                switch ( input.LA(3) ) {
                case '/':
                    {
                    alt3=6;
                    }
                    break;
                case '.':
                    {
                    alt3=7;
                    }
                    break;
                default:
                    alt3=5;
                }

            }
            else {
                alt3=5;
            }
            }
            break;
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=5;
            }
            break;
        case '3':
            {
            int LA3_6 = input.LA(2);

            if ( ((LA3_6 >= '0' && LA3_6 <= '9')) ) {
                int LA3_13 = input.LA(3);

                if ( (LA3_13=='/') ) {
                    alt3=6;
                }
                else {
                    alt3=5;
                }
            }
            else {
                alt3=5;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // ET.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // ET.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // ET.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // ET.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // ET.g:1:34: IDENT
                {
                mIDENT(); 


                }
                break;
            case 6 :
                // ET.g:1:40: GGMMAA
                {
                mGGMMAA(); 


                }
                break;
            case 7 :
                // ET.g:1:47: HHMM
                {
                mHHMM(); 


                }
                break;
            case 8 :
                // ET.g:1:52: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}