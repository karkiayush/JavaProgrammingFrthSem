package BoardExamPreactise.NetworkProgramming;

/**
 * SingleServerChatSystem
 */
import java.net.*;
import java.io.*;

public class SingleClientChatSystem {

    public static void main(String[] args) {

        try {
            String clientInput = "start";
            System.out.println("Client started.....");
            Socket soc = new Socket("localhost", 9500);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            BufferedReader brs = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            while (clientInput != "exit") {
                // Reading client input
                System.out.print("Client Chat: ");
                clientInput = br.readLine();
                // sending the input to the server
                out.print(clientInput);
                // receiving server input
                String serverInput = brs.readLine();
                System.out.print("server chat: " + serverInput);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}