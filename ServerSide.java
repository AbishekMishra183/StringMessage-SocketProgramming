import java.net.*;
import java.io.*;
import java.util.*;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        try {
            // Create a server socket on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080...");

            // Wait for a client connection
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client connected.");

            // Get the input stream from the client socket
            //  Scanner ins = new Scanner(clientSocket.getInputStream());

            // Read the message sent by the client
            //  String message = ins.nextLine();
            //  System.out.println("Message received from client: " + message);

            DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
            String msg = dis.readUTF();

            System.out.println(msg);
            // Close the streams and sockets
            //.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
