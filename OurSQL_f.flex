/*
    Daniel Oh, John Wayne Creech
    CSC4340: Introduction to Compilers
    Project Phase I
*/

/*
    This is a flex file for Project phase I
    File name: OurSQL_f.flex
*/

import java.io.*;
import java_cup.runtime.*;


%%

/*      Usercode Section    */


/* -----------------Options and Declarations Section----------------- */

/*
   The name of the class JFlex will create will be Lexer.
   Will write the code to the file Lexer.java.
*/
%class Lexer

/*
  The current line number can be accessed with the variable yyline
  and the current column number with the variable yycolumn.
*/
%line
%column

/*
   Will switch to a CUP compatibility mode to interface with a CUP
   generated parser.
*/
%cup

%{
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
/*      Macro Declaration                      */

number = [0-9]+

ident = [:jletter:] [:jletterdigit:]*

/* for the string literals, it will accept any string or number with ' ' or " " between them */
string = "'" [:jletterdigit:]* "'" | "\"" [:jletterdigit:]* "\""

space = [\ \t]

newline = \r|\n|\r\n


%%

/*      Lexical Rules Section                  */

<YYINITIAL>{

";"             { System.out.print("; "); System.out.println(); return symbol(sym.SEMI);      }
"from"          { System.out.print("FROM "); return symbol(sym.FROM);      }
"distinct"      { System.out.print("DISTINCT "); return symbol(sym.DISTINCT);  }
"select"        { System.out.print("SELECT "); return symbol(sym.SELECT);    }
"where"         { System.out.print("WHERE "); return symbol(sym.WHERE);     }
"exists"        { System.out.print("EXISTS "); return symbol(sym.EXISTS);    }
"in"            { System.out.print("IN "); return symbol(sym.IN);        }
"not"           { System.out.print("NOT "); return symbol(sym.NOT);       }
"and"           { System.out.print("AND "); return symbol(sym.AND);       }
"="             { System.out.print("COMPARISON "); return symbol(sym.COMPARISON);}
"("             { System.out.print("( "); return symbol(sym.LPAREN);    }
")"             { System.out.print(") "); return symbol(sym.RPAREN);    }
"."             { System.out.print(". "); return symbol(sym.PERIOD);    }
","             { System.out.print(", "); return symbol(sym.COMMA);     }

{number}    { System.out.print(yytext() + " "); return symbol(sym.INTNUM, new Integer(yytext())); }
{ident}     { System.out.print(yytext() + " "); return symbol(sym.NAME, new String(yytext())); }
{string}    { System.out.print(yytext() + " "); return symbol(sym.STRING, new String(yytext())); }
{space}     { /* Ignore */ }
{newline}   { System.out.println(""); }

}

/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
