
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\004\000\002\002\004\000\002\003" +
    "\007\000\002\004\003\000\002\004\002\000\002\005\003" +
    "\000\002\005\005\000\002\011\003\000\002\011\005\000" +
    "\002\006\004\000\002\012\003\000\002\012\005\000\002" +
    "\013\003\000\002\013\004\000\002\014\003\000\002\015" +
    "\003\000\002\007\003\000\002\007\002\000\002\010\004" +
    "\000\002\016\003\000\002\016\005\000\002\017\003\000" +
    "\002\017\004\000\002\020\003\000\002\020\003\000\002" +
    "\020\003\000\002\021\005\000\002\022\003\000\002\022" +
    "\003\000\002\023\003\000\002\023\003\000\002\024\007" +
    "\000\002\025\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\007\006\001\002\000\004\002\067\001" +
    "\002\000\004\004\066\001\002\000\006\006\007\024\ufffd" +
    "\001\002\000\004\024\ufffe\001\002\000\004\024\012\001" +
    "\002\000\006\005\017\021\016\001\002\000\022\004\ufffa" +
    "\005\ufffa\012\ufffa\014\ufffa\015\ufffa\017\ufffa\020\014\021" +
    "\ufffa\001\002\000\006\005\ufffc\021\ufffc\001\002\000\004" +
    "\024\015\001\002\000\020\004\ufff9\005\ufff9\012\ufff9\014" +
    "\ufff9\015\ufff9\017\ufff9\021\ufff9\001\002\000\004\024\012" +
    "\001\002\000\004\024\056\001\002\000\010\004\ufff0\010" +
    "\022\017\ufff0\001\002\000\006\004\ufff1\017\ufff1\001\002" +
    "\000\014\011\030\013\035\022\036\023\027\024\012\001" +
    "\002\000\006\004\uffff\017\uffff\001\002\000\010\004\uffec" +
    "\014\uffec\017\uffec\001\002\000\014\004\uffe5\012\uffe5\014" +
    "\uffe5\015\uffe5\017\uffe5\001\002\000\010\004\uffe9\014\uffe9" +
    "\017\uffe9\001\002\000\014\004\uffe4\012\uffe4\014\uffe4\015" +
    "\uffe4\017\uffe4\001\002\000\004\016\052\001\002\000\010" +
    "\004\uffe8\014\uffe8\017\uffe8\001\002\000\006\012\044\015" +
    "\045\001\002\000\010\004\uffea\014\uffea\017\uffea\001\002" +
    "\000\014\004\uffe6\012\uffe6\014\uffe6\015\uffe6\017\uffe6\001" +
    "\002\000\012\011\030\022\036\023\027\024\012\001\002" +
    "\000\014\004\uffe3\012\uffe3\014\uffe3\015\uffe3\017\uffe3\001" +
    "\002\000\010\004\uffee\014\uffee\017\uffee\001\002\000\010" +
    "\004\uffef\014\041\017\uffef\001\002\000\014\011\030\013" +
    "\035\022\036\023\027\024\012\001\002\000\010\004\uffed" +
    "\014\uffed\017\uffed\001\002\000\010\004\uffeb\014\uffeb\017" +
    "\uffeb\001\002\000\004\016\047\001\002\000\010\022\036" +
    "\023\027\024\012\001\002\000\010\004\uffe7\014\uffe7\017" +
    "\uffe7\001\002\000\004\007\006\001\002\000\004\017\051" +
    "\001\002\000\010\004\uffe2\014\uffe2\017\uffe2\001\002\000" +
    "\004\007\006\001\002\000\004\017\054\001\002\000\010" +
    "\004\uffe1\014\uffe1\017\uffe1\001\002\000\014\004\ufff5\010" +
    "\ufff5\017\ufff5\021\ufff5\024\064\001\002\000\014\004\ufff3" +
    "\010\ufff3\017\ufff3\021\ufff3\024\ufff3\001\002\000\012\004" +
    "\ufff7\010\ufff7\017\ufff7\021\ufff7\001\002\000\012\004\ufff8" +
    "\010\ufff8\017\ufff8\021\061\001\002\000\004\024\056\001" +
    "\002\000\012\004\ufff6\010\ufff6\017\ufff6\021\ufff6\001\002" +
    "\000\012\004\ufff4\010\ufff4\017\ufff4\021\ufff4\001\002\000" +
    "\012\004\ufff2\010\ufff2\017\ufff2\021\ufff2\001\002\000\006" +
    "\005\ufffb\021\ufffb\001\002\000\004\002\001\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\007\001\001\000\002" +
    "\001\001\000\006\005\010\011\012\001\001\000\004\006" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\011\064\001\001\000" +
    "\010\012\057\013\056\014\054\001\001\000\006\007\022" +
    "\010\020\001\001\000\002\001\001\000\024\011\024\016" +
    "\037\017\036\020\023\021\032\022\031\023\033\024\025" +
    "\025\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\011\024\020\042\021\032" +
    "\022\031\023\033\024\025\025\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\022\011\024" +
    "\017\041\020\023\021\032\022\031\023\033\024\025\025" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\011\024\022\045\023\033\001\001\000" +
    "\002\001\001\000\004\003\047\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\052\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\062\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\013" +
    "\061\014\054\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    /* Change the method report_error so it will display the line and
       column of where the error occurred in the input as well as the
       reason for the error which is passed into the method in the
       String 'message'. */
    public void report_error(String message, Object info) {

        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Error");

        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {
                /* Add to the end of the StringBuffer error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)
                    /* Add to the end of the StringBuffer error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }

        /* Add to the end of the StringBuffer error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);

        /* Print the contents of the StringBuffer 'm', which contains
           an error message, out on a line. */
        System.err.println(m);
    }

    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

    public parser (java.io.Reader input) {
        super(new Lexer(input));
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {




  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // sql_start ::= select_stmt SEMI 
            {
              Object RESULT =null;
		 System.out.println("No Syntax Error"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sql_start",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= sql_start EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // select_stmt ::= SELECT opt_distinct select_list from_clause opt_where_clause 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("select_stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // opt_distinct ::= DISTINCT 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opt_distinct",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // opt_distinct ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("opt_distinct",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // select_list ::= column_ref 
            {
              Object RESULT =null;
		int colleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int colright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object col = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("select_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // select_list ::= select_list COMMA column_ref 
            {
              Object RESULT =null;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object sl = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int colleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int colright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object col = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("select_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // column_ref ::= NAME 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("column_ref",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // column_ref ::= NAME PERIOD NAME 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("column_ref",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // from_clause ::= FROM table_ref_commalist 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("from_clause",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // table_ref_commalist ::= table_ref 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("table_ref_commalist",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // table_ref_commalist ::= table_ref_commalist COMMA table_ref 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("table_ref_commalist",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // table_ref ::= table 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("table_ref",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // table_ref ::= table range_variable 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("table_ref",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // table ::= NAME 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("table",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // range_variable ::= NAME 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("range_variable",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // opt_where_clause ::= where_clause 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opt_where_clause",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // opt_where_clause ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("opt_where_clause",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // where_clause ::= WHERE search_condition 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("where_clause",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // search_condition ::= predicate 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("search_condition",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // search_condition ::= search_condition AND predicate 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("search_condition",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // predicate ::= pred 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicate",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // predicate ::= NOT pred 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicate",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // pred ::= comparison_pred 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("pred",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // pred ::= in_pred 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("pred",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // pred ::= exists_pred 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("pred",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // comparison_pred ::= scalar_exp COMPARISON scalar_exp 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comparison_pred",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // scalar_exp ::= literal 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("scalar_exp",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // scalar_exp ::= column_ref 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("scalar_exp",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // literal ::= STRING 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // literal ::= INTNUM 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // in_pred ::= scalar_exp IN LPAREN select_stmt RPAREN 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("in_pred",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // exists_pred ::= EXISTS LPAREN select_stmt RPAREN 
            {
              Object RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exists_pred",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}