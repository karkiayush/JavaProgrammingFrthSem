/*Connection is setup using the TCP Connection*/

package networkProg;

import java.io.*;
import java.net.*;

public class DemoSocketProgrammingClient {
    public static void main(String[] args) {
        // // port number above 1000 is recommended to use.
        // Socket s = new Socket("localhost", 8567);

        // PrintWriter prw = new PrintWriter(s.getOutputStream());
        // prw.println("Demo of socket programming, where we have connection client with
        // server");
        // prw.flush();

        // InputStreamReader insr = new InputStreamReader(s.getInputStream());
        // BufferedReader btf = new BufferedReader(insr);

        // s.close();

        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 9806);// localhost can also be replaced by 127.0.0.1

            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
*/