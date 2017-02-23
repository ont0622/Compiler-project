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
          ArrayList<String> inputList = new ArrayList<String>();
          Scanner in = new Scanner(System.in);
          inputList.add(" ");
          while(!inputList.get(inputList.size()-1).contains(";")){
            inputList.add(in.next());
          }
          for (int i = 1; i < inputList.size(); i++){
              userInput += inputList.get(i) + " ";
          }
          if (userInput.contains("exit")){
              in.close();
              System.exit(1);
          }
          if (userInput.contains("@")){
            String fileName;
            fileName = userInput.replace("@", "");
            fileName = fileName.replace(";", "");
            fileName = fileName.replace(" ", "");
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
