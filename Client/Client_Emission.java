package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Client_Emission implements Runnable {

    private PrintWriter out;
    private String login = null, message = null;
    private Scanner sc = null;

    public Client_Emission(PrintWriter out) {
        this.out = out;

    }


    public void run() {

        sc = new Scanner(System.in);

        while(true){
            System.out.println("Votre message :");
            message = sc.nextLine();
            out.println(message);
            out.flush();
        }
    }
}
