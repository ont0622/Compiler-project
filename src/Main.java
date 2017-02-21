/*
    Daniel Oh, John Wayne Creech
    CSC 4340

    This is a main file for WAE program
*/

   
import java.io.*;
import java.util.*;
   
public class Main {
  static public void main(String argv[]) throws ArrayIndexOutOfBoundsException {
    /* Start the parser */
      try {
          System.out.print("SQL> ");
          String next="";
          String userInput = "";
          Scanner in = new Scanner(System.in);
          while(!userInput.contains(";")){
            userInput += in.next();
            System.out.println("Current String: "+ userInput);
          }
          System.out.println("Final input: "+userInput);
          if (userInput.contains("@")){
            String fileName;
            fileName = userInput.replace("@", "");
            fileName = fileName.replace(";", "");
            fileName += ".txt";
            System.out.println("File name: " + fileName);
            parser p = new parser(new Lexer(new FileReader(fileName)));
            Object result = p.parse().value;
          }
          else {
            Reader reader = new StringReader(userInput);
            parser p = new parser(reader);
            Object result = p.parse().value;
          }
      } catch (Error e) {
        e.printStackTrace();
      } catch (FileNotFoundException e){
        e.printStackTrace();
      } catch (Exception e) {
        e.printStackTrace();
      }

    }
}