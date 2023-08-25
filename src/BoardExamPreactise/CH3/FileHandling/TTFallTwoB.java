package BoardExamPreactise.CH3.FileHandling;


import java.io.*;

public class TTFallTwoB {
    public static void main(String[] args) {
        // Write bytes to the file
        try (FileOutputStream fos = new FileOutputStream("javaExam.jsp")) {
            String data = "This is a sample content written to the file.";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Read bytes from the file
        try (FileInputStream fis = new FileInputStream("javaExam.jsp")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}
