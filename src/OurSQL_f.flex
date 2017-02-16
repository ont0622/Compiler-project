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

%class Lexer
%public
%type Symbol
%char

%{

%}

/*      Options and Declarations Section       */
%%
/*      Macro Declaration                      */

number = [0-9]+
ident = [A-Za-z][A-Za-z0-9]*
space = [\ \t]
newline = \r|\n|\r\n


/*      Lexical Rules Section                  */
%%




