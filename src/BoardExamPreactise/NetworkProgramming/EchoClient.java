package BoardExamPreactise.NetworkProgramming;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client is started...");
        Scanner sc = new Scanner(System.in);
        try {
            Socket soc = new Socket("localhost", 9806);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the range of the fibonacci series to be find out: ");
            String range = br.readLine();

            // true is for auto flush functionality
            PrintWriter wr = new PrintWriter(soc.getOutputStream(), true);
            wr.println(range);

            // Reading the fibonacci series
            BufferedReader fbr = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String receiverArray = fbr.readLine();
            String[] fiboArray = receiverArray.split(", ");

            for (String elements : fiboArray) {
                int num = Integer.parseInt(elements);
                System.out.println(num);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}