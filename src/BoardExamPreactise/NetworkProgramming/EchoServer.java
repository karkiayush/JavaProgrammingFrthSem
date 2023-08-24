package BoardExamPreactise.NetworkProgramming;

import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server is waiting.........");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection is established");

            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            String userInput = br.readLine();
            int range = Integer.parseInt(userInput);
            int fn = 0;
            int sn = 1;
            int tn;
            int[] fiboSeries = new int[range];
            fiboSeries[0] = fn;
            fiboSeries[1] = sn;

            for (int i = 2; i <= range; i++) {
                tn = fn + sn;
                fiboSeries[i] = tn;
                fn = sn;
                sn = tn;
            }

            // sending the array of fibonacci series to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(fiboSeries);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}