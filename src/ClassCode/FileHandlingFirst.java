package ClassCode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileHandlingFirst {
    public static void main(String[] args) {

        /*
         * CODE TO CREATE A NEW FILE
         * File class is used where we've obj named "myFile" and passed the path which
         * is received by constructor to make the file
         */

        try {
            // ? CREATING A NEW .TXT FILE
            File myFile = new File("./src/ClassCode/FileHandler.txt");
            myFile.createNewFile();

            // ? WRITING TO A FILE.
            /*
             * Here the filewriter can write in a existing file and if
             * file doesn't exists, it creates a new file and write on that file.
             */
            FileWriter fileWriter = new FileWriter("./src/ClassCode/FileHandler.txt");
            fileWriter.write(
                    "This is the demo of writing in a file using FileWriter class\nWriting to a file is one of the key aspects of any programming language");
            fileWriter.close(); // need to close as the resource can be leaked

            // ? READING A FILE
            File myFileReader = new File("./src/ClassCode/FileHandler.txt");
            Scanner sc = new Scanner(myFileReader);// file reader object has to be assigned as argument
            /*
             * hasNextLine() checks if there is nextLine or not, if nextline exists then
             * content stores the content of 1st line at first iteration and second line at
             * second iteration.
             */
            int counter = 0;
            while (sc.hasNextLine()) {
                counter++;
                String content = sc.nextLine();
                System.out.print(counter + ": ");
                System.out.println(content);
            }
            sc.close();// to avoid resrc leakage

            // ? DELETING A FILE
            File fileDelter = new File("./src/ClassCode/FileHandler.txt");
            fileDelter.delete();
            if (!fileDelter.exists()) {
                System.out.println("File is deleted successfully");
            } else {
                System.out.println("File is not deleted successfully");
            }
        } catch (IOException e) {
            System.out.println("Sorry!! Failed to create file");
            e.printStackTrace();
        }
    }
}