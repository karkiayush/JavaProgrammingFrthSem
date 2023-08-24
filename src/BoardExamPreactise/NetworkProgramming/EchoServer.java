package BoardExamPreactise.NetworkProgramming;

import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server is waiting.........");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection is established");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}