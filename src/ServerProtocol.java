
import javafx.stage.Stage;

import java.net.*;
import java.io.*;

public class ServerProtocol {
    private static final int WAITING = 0;

    private int state = WAITING;

    public String processInput(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "Would you like to register? (y/n)";
            if(theInput == "y")
            {
                new ClientInputUI();
            }
            else{
                theOutput = "Exiting application!";
                System.exit(1);
            }
        }
        return theOutput;
    }
}
