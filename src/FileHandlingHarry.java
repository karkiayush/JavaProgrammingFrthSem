import java.io.*;
import java.util.Scanner;

public class FileHandlingHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        /*
         * CREATING A FILE
         * File class is used to create file object where we need to pass the path
         */
        File myFile = new File("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai.txt");

        try {
            // createNewFile method needs to be invoked
            myFile.createNewFile();

            // WRITING TO A FILE
            FileWriter fw = new FileWriter("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai.txt");
            System.out.println("Enter content to be written in file\n");
            userInput = sc.nextLine();
            fw.write(userInput);

            fw.close();

            // READING FROM A FILE
            FileReader fr = new FileReader("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai.txt");
            BufferedReader br = new BufferedReader(fr);
            String readContent;

            FileWriter fw1 = new FileWriter("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai1.txt");

            while ((readContent = br.readLine()) != null) {
                fw1.write(readContent);
            }
            fw1.close();
            br.close();

            File filedeleter = new File("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai1.txt");
            File filedeleter1 = new File("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\harryVai.txt");

            if (filedeleter.exists() & filedeleter1.exists()) {
                filedeleter.delete();
                filedeleter1.delete();
                System.out.println("File is deleted successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
