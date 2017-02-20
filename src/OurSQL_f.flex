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

/*      Usercode Section    */

%%


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

/*      Options and Declarations Section       */
%%
/*      Macro Declaration                      */

number = [0-9]+
ident = [A-Za_z_][A-Za-z_0-9]*
space = [\ \t]
newline = \r|\n|\r\n



/*      Lexical Rules Section                  */
%%
<YYINITIAL>{


"."             { return symbol(sym.PERIOD);    }
","             { return symbol(sym.COMMA);     }
"from"          { return symbol(sym.FROM);      }
"select"        { return symbol(sym.SELECT);    }
"where"         { return symbol(sym.WHERE);     }
"exists"        { return symbol(sym.EXISTS);    }
"in"            { return symbol(sym.IN);        }
"not"           { return symbol(sym.NOT);       }
"and"           { return symbol(sym.AND);       }
"("             { return symbol(sym.LPAREN);    }
")"             { return symbol(sym.RPAREN);    }


{number}    { return symbol(sym.NUMBER, new Integer(yytext())); }
{ident}     { return symbol(sym.IDENT); }
{space}     { /* Ignore */ }

}

/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
