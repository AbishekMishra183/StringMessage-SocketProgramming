import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSide {
    public static void main(String[] args) throws IOException {
        try {
            // Connect to the server on localhost at port 8080
            Socket socket = new Socket("localhost", 8080);

            // Get the output stream from the socket
            DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
            ds.writeUTF("Message From Pokhara Univesity ");
            ds.flush();
            ds.close();

            // Close the streams and socket

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
