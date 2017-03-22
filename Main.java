/*
    Daniel Oh, John Wayne Creech
    CSC 4340

    This is Main file for project phase 1
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
          /**
           * ArrayList is used to store user inputs from command argument.
           * It will later concatonate into a single string and use that string as an argument
           * for parser
           */
          ArrayList<String> inputList = new ArrayList<String>();
          Scanner in = new Scanner(System.in);
          //to prevent the nullpointerexception, inputList[0] will be an empty string
          inputList.add(" ");
          while(!inputList.get(inputList.size()-1).contains(";")){
            inputList.add(in.next());
          }

          //Turning user inputs into single string seperated by empty space
          for (int i = 1; i < inputList.size(); i++){
              userInput += inputList.get(i) + " ";
          }
          //if userInput has sequence "exit", the program will terminate
          if (userInput.contains("exit")){
              in.close();
              System.exit(1);
          }
          //if userInput is an file name, it will parse using input file name
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
          //otherwise it will parse with input string
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
