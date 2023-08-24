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

            // for reading the client input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // for transmitting the client input to server
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            // for reading the server input
            BufferedReader brs = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            while (clientInput != "exit") {
                // Reading client input
                System.out.print("\nClient Chat: ");
                clientInput = br.readLine();
                // sending the input to the server
                out.println(clientInput);
                // receiving server input
                String serverInput = brs.readLine();
                System.out.print("server chat: " + serverInput);
                System.out.println();
            }
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}