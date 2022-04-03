package fileManip;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;




public class fileManip {

    // reads command line for input into method
    public static String readLine(String[] args) {
        Scanner input = new Scanner(System.in);
        String cmdLine = input.nextLine();   
   
        return cmdLine;
    } 

    // converts text file lines to array
    public static void textToArray(String Filename){
        Boolean success = true;

        try {
            FileReader file = new FileReader(Filename);
            Scanner reader = new Scanner(file);
            
            String[] outArr =  {""};
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
                outArr[outArr.length - 1] = line;

            }

            

        } catch (FileNotFoundException e1) {
            System.out.println("File not Found: Please enter a valid file name");
            success = false;

        } finally {
            while (success == false){
                // ls command
                Scanner input = new Scanner(System.in);
                String cmdLine = input.nextLine();
                try {
                    FileReader file = new FileReader(Filename);
                    Scanner reader = new Scanner(file);
                    
                    String[] outArr =  {""};
                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();
                        System.out.println(line);
                        outArr[outArr.length - 1] = line;
        
                    }
        
                    success = true;
        
                } catch (FileNotFoundException e1) {
                    System.out.println("File not Found: Please enter a valid file name");
                    success = false;
                }
            }

       
       
            

        }
    }


    public static void main(String[] args){
        fileManip fm = new fileManip();
        fm.textToArray(fm.readLine(args));

    }

    
}
