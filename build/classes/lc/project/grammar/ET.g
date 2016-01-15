
grammar ET;

options {
  language = Java;
}

@header {  
  package lc.project.grammar;
  import java.util.Vector;
  import lc.project.src.Exam;
  import java.util.ArrayList;
  import java.util.LinkedList;
}

@lexer::header {
  package lc.project.grammar;  
  import lc.project.src.Exam;
  import java.util.Vector;
  import java.util.LinkedList;
}

 @parser::members {

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

 }
 
 @lexer::members{
 
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
 
 }
 
exam
  : 'add' IDENT 'on' GGMMAA 'at' HHMM opt*    
        {				 
            exams.add(new Exam($IDENT.text,$GGMMAA.text,$HHMM.text, $opt.color));				 
	}									  
  ;
  
opt returns [String color]
  : 'color' IDENT {$color = $IDENT.text;}
  ;

IDENT: ('a'..'z' | 'A'..'Z' | '0'..'9')+ ;
fragment DIGITX1 : ('0'..'3')('0'..'9');
fragment DIGITX2 : ('0'..'1')('0'..'9');
fragment DIGITX3 : ('0'..'9')('0'..'9');
GGMMAA: DIGITX1 '/' DIGITX2 '/' DIGITX3; 
fragment DIGITX4 : ('0'..'2')('0'..'9');
fragment DIGITX5 : ('0'..'5')('0'..'9');
HHMM: DIGITX4 '.' DIGITX5;
WS : ( ' ' | '\t' | '\r' | '\n' )+ { $channel = HIDDEN; } ;
