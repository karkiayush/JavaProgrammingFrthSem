/*Connection is setup using the TCP Connection
 * 
 * THis is code of the client
*/

package networkProg;

import java.io.*;
import java.net.*;

public class DemoSocketProgrammingClient {
    public static void main(String[] args) {

        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 9806);// localhost can also be replaced by 127.0.0.1

            // reading data from keyboard
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            /*
             * .in is the input stream object and capable of reading one byte instruction at
             * a time.
             * 
             * InputStreamReader takes the byte stream and converts to the character stream.
             * 
             * BufferedReader is capable of reading entire obj at a time
             * 
             */

            System.out.print("Enter a string: ");
            String str = userInput.readLine();

            /*
             * sending string to the server.
             * Here the printwriter is capable of holding the data providede to it. So we
             * need to flush the printwriter. Hence true enables the auto flush after
             * operation
             */
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);

            // server respondding after checkig the palindrome
            BufferedReader serverRes = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(serverRes.readLine());

            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
*/