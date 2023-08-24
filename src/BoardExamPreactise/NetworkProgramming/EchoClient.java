package BoardExamPreactise.NetworkProgramming;

import java.io.IOException;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client is started...");
        try {
            Socket soc = new Socket("localhost", 9806);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}