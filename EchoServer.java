import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            // Create a server socket, bind it to port 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            
            System.out.println("Server started. Waiting for clients...");

            // Accept client connections
            Socket clientSocket = serverSocket.accept();
            
            System.out.println("Client connected.");

            // Create input/output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read input from the client and echo it back
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Client: " + inputLine);
                out.println("Server: " + inputLine);
            }

            // Close connections
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
