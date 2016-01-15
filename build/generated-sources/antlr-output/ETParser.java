// $ANTLR 3.4 ET.g 2015-05-05 15:35:55
  
  package lc.project.grammar;
  import java.util.Vector;
  import lc.project.src.Exam;
  import java.util.ArrayList;
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ETParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGITX1", "DIGITX2", "DIGITX3", "DIGITX4", "DIGITX5", "GGMMAA", "HHMM", "IDENT", "WS", "'add'", "'at'", "'color'", "'on'"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ETParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ETParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ETParser.tokenNames; }
    public String getGrammarFileName() { return "ET.g"; }



        private Vector<Exam> exams;
        private List<String> errors = new LinkedList<String>();    
        
        public ETParser() 
        {
           super(null);
           exams = new Vector<Exam>();    
        }

        public Vector<Exam> getExams()
        {
           return exams;  
        }

        public void process(String source) throws RecognitionException {
             ANTLRStringStream in = new ANTLRStringStream(source);
             ETLexer lexer = new ETLexer(in);
             CommonTokenStream tokens = new CommonTokenStream(lexer);
             super.setTokenStream(tokens);   
             this.exam();          
        }
           
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

     


    // $ANTLR start "exam"
    // ET.g:80:1: exam : 'add' IDENT 'on' GGMMAA 'at' HHMM ( opt )* ;
    public final void exam() throws RecognitionException {
        Token IDENT1=null;
        Token GGMMAA2=null;
        Token HHMM3=null;
        String opt4 =null;


        try {
            // ET.g:81:3: ( 'add' IDENT 'on' GGMMAA 'at' HHMM ( opt )* )
            // ET.g:81:5: 'add' IDENT 'on' GGMMAA 'at' HHMM ( opt )*
            {
            match(input,13,FOLLOW_13_in_exam63); 

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_exam65); 

            match(input,16,FOLLOW_16_in_exam67); 

            GGMMAA2=(Token)match(input,GGMMAA,FOLLOW_GGMMAA_in_exam69); 

            match(input,14,FOLLOW_14_in_exam71); 

            HHMM3=(Token)match(input,HHMM,FOLLOW_HHMM_in_exam73); 

            // ET.g:81:39: ( opt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ET.g:81:39: opt
            	    {
            	    pushFollow(FOLLOW_opt_in_exam75);
            	    opt4=opt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            				 
                        exams.add(new Exam((IDENT1!=null?IDENT1.getText():null),(GGMMAA2!=null?GGMMAA2.getText():null),(HHMM3!=null?HHMM3.getText():null), opt4));				 
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exam"



    // $ANTLR start "opt"
    // ET.g:87:1: opt returns [String color] : 'color' IDENT ;
    public final String opt() throws RecognitionException {
        String color = null;


        Token IDENT5=null;

        try {
            // ET.g:88:3: ( 'color' IDENT )
            // ET.g:88:5: 'color' IDENT
            {
            match(input,15,FOLLOW_15_in_opt120); 

            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_opt122); 

            color = (IDENT5!=null?IDENT5.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return color;
    }
    // $ANTLR end "opt"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_exam63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_exam65 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_exam67 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_GGMMAA_in_exam69 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_exam71 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_HHMM_in_exam73 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_opt_in_exam75 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_opt120 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_opt122 = new BitSet(new long[]{0x0000000000000002L});

}