package perimeter;
import java.io.*;
import java.util.Scanner;

public class my_per {
    public void readFile() {
        try {
            FileReader file = new FileReader("./datatest1.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("The process errored");
        }
    }

    public static void main(String[] args){
        my_per pr = new my_per();
        pr.readFile();
    }
}