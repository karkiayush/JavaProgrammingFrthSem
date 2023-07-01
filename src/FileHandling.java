import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileHandling
 */
public class FileHandling {

    public static void main(String[] args) {
        try {
            // ! Writing to a file
            /* we need to pass the filewriter in the constructor of bufferedwriter */
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\output.txt"));
            bw.write("Hello its me Aayush Karki");// writes the provided string
            bw.write("\nI'm IT Engineering student involved in CCMT, PU");
            bw.close();

            // ! Reading a file and writing in another file
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\output.txt"));
            String readContent;
            FileWriter fw1 = new FileWriter("C:\\FourthSem\\JAVA\\JavaProgrammingFrthSem\\src\\temp.txt");
            BufferedWriter br1 = new BufferedWriter(
                    fw1);
            while ((readContent = br.readLine()) != null) {

                br1.write(readContent);
            }
            br1.close();

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}