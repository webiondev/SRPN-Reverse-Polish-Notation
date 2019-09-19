/**
 * The SRPN program implements an reverse polish notation
 *
 * @author  
 * @version 1.0
 * @since 2019-09-30
 */
package bathassg1;

import java.util.*;
import java.io.*;

class Main {

    /**
     * main method reads in input from the command line and passes this input to
     * the processCommand method in SRPN
     *
     * @param args
     *
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) {

        // Code to take input from the command line 
        // This input is passed to the processCommand
        // method in SRPN.java 
        SRPN sprn = new SRPN();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Keep on accepting input from the command-line
            //boolean flagNumber=true;
            while (true) {
                // try{
                String command = reader.readLine();
                //Close on an End-of-file (EOF) (Ctrl-D on the terminal)
                if (command == null) {
                    //Exit code 0 for a graceful exit
                    System.exit(0);
                }

                //Otherwise, (attempt to) process the character
                sprn.processCommand(command);
                // }

                //  catch(NumberFormatException e){
                //    System.out.println();
                //  } 
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
