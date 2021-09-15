import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        //using the port 4444
        int portNumber = 4444;

        try(
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ){
            String inputLine, outputLine;
            ///initiate conversation with the client
            ServerProtocol serverProtocol = new ServerProtocol();
            outputLine = serverProtocol.processInput(null);
            out.println(outputLine);

            while((inputLine = in.readLine()) != null){
                outputLine = serverProtocol.processInput(inputLine);
                out.println(outputLine);
                if(outputLine.equals("Bye: ")) break;
            }
        }

        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
