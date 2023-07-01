package termtestI.termtestI;

import java.io.File;
import java.io.IOException;

/**
 * FileHanling
 */
public class FileHanling {
    public static void main(String[] args) {

        File newfile = new File("Filehandling1.txt");
        try {
            newfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}