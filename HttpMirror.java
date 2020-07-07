import java.io.*;
import java.net.*;

public class HttpMirror {
    public static void main(String args[]) {
        int i;
        try {
            i = 0;
            // Get the port to listen to
            int port = Integer.parseInt(args[0]);
            // Create a server socket to listen on that port.
            ServerSocket ss = new ServerSocket(port);
            // Now enter an infinite loop, waiting for connections and handling them.
            for (;;) {
                // wait for a client to connect. The method wll block, and when it 
                // returns, the socket will be already connected to the client
                Socket client = ss.accept();
                // Get input and output streams to talk to the client from the socket
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

                // start sending your reply, using the HTTP 1.0 protocol
                out.println("HTTP/1.0" + (i++) + " "); // version and status code
                out.println("Content-Type: text/plain"); //  The type of data we send
                out.println(); // End of response headers
                out.flush();

                // Now read the HTTP request from the client, and send it right
                // back to the client as part of the body of our response.
                // The client does not disconnect. so we never get an EOF.
                // It does sends an empty line at the end of the headers, though.
                // So when we see the empty line, we stop reading. This means we
                // don't mirror the contents of POST requests. for example.
                String line;
                while ((line = in.readLine()) != null) {
                    if (line.length() == 0)
                        break;
                    out.println("i = " + i);
                    out.flush();

                    // Close the streams and socket, breaking the connection to the client
                    out.close();
                    in.close();
                    client.close();
                } // Loop again, waiting for the next connection
            }
        }
        // If anything goes wrong, print an error message 
        catch (Exception e) {
            System.err.println(e);
            System.err.println(" Usage: java HttpMirror <port>");
        }
    }
}
