package BoardExamPreactise.CH3.FileHandling;

import java.io.*;
import java.util.Scanner;

public class DemoFileHandling {
    public static void main(String[] args) {

        // code to create new file
        /*
         * File myFile = new File("demofile.txt");
         * 
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * System.out.println("unable to create the file");
         * e.printStackTrace();
         * }
         */

        // code to write to a file
        // try {
        // FileWriter fw = new FileWriter("demofile.txt");
        // fw.write("Using FileWriter class to write to a file");
        // fw.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // code to read from a file
        // try {
        // File read = new File("demofile.txt");
        // Scanner sc = new Scanner(read);

        // while (sc.hasNextLine()) {
        // String fileContent = sc.nextLine();
        // System.out.println();
        // System.out.println(fileContent);
        // }

        // sc.close();
        // // read.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // deleting a file
        // try {
        // File textfile = new File("demofile.txt");
        // if (textfile.exists()) {
        // textfile.delete();
        // } else {
        // System.out.println("File doesn't exist");
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // Reading a content from a file and pasting it in the another file
        try {
            // creating file 1
            File filecreate = new File("Hello.txt");
            filecreate.createNewFile();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence ");
            String userInput = sc.nextLine();

            // writing to file 1
            FileWriter fw = new FileWriter("Hello.txt");
            fw.write(userInput);
            fw.close();

            // creating file 2
            File filecreate1 = new File("paster.txt");
            filecreate1.createNewFile();

            // reading content of file1 and pasting in file2
            File freader = new File("Hello.txt");
            FileWriter pasting = new FileWriter("paster.txt");
            Scanner fileScan = new Scanner(freader);
            while (fileScan.hasNextLine()) {
                String readContent = fileScan.nextLine();
                pasting.write(readContent);
            }

            pasting.close();
            fileScan.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
