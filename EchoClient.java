import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost at port 12345
            Socket socket = new Socket("localhost", 12345);
            
            // Create input/output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read input from the user and send it to the server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String userInputLine;
            while ((userInputLine = userInput.readLine()) != null) {
                out.println(userInputLine);
                System.out.println("Server: " + in.readLine());
            }

            // Close connections
            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
