package BoardExamPreactise.CH3.FileHandling;

import java.io.*;

public class TTFallTwoB {
    public static void main(String[] args) {
        // Write bytes to the file
        try {
            FileOutputStream fos = new FileOutputStream("javaExam.jsp");
            String data = "This is a sample content written to the file.";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to the file.");
            fos.close();
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Read bytes from the file
        // try (FileInputStream fis = new FileInputStream("javaExam.jsp")) {
        // int byteRead;
        // while ((byteRead = fis.read()) != -1) {
        // System.out.print((char) byteRead);
        // }
        // } catch (IOException e) {
        // System.out.println("Error reading from the file: " + e.getMessage());
        // }

        // writing the content of one file to another file
        try {
            FileOutputStream fos1 = new FileOutputStream("javaBoardExam.jsp");

            FileInputStream fis = new FileInputStream("javaExam.jsp");
            int byteRead;
            String copiedContent;
            byte[] byteFormat;

            while ((byteRead = fis.read()) != -1) {
                copiedContent = Integer.toString(byteRead);
                byteFormat = copiedContent.getBytes();
                fos1.write(byteFormat);
            }
            fis.close();
            fos1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
