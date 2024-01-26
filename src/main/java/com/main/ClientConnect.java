package com.main;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class ClientConnect {

    public static void main(String args[]) throws Exception {

        Properties p;
        InputStream is;
        Socket socket1;
        int portNumber = 1777;
        String command = "";

        // add properties file to instance
        // add reader to get data from file
        p = new Properties();
        is = new FileInputStream("C:\\workspace\\commandSendApp\\src\\main\\resources\\inks.properties");
        // loads data into properties object
        p.load(is);

        socket1 = new Socket(InetAddress.getLocalHost(), portNumber);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));

        PrintWriter pw = new PrintWriter(socket1.getOutputStream(), true);

        // to enter from command prompt
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try{
                // waits for 10 seconds between loops
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                //do stuff
            }

            System.out.println("Enter command");

            command = scanner.nextLine();

            System.out.println(command + " sent to printer!");
            // writes a string to server
            pw.println(command);

            if (command.equals("Close"))
                break;
        }

        br.close();
        pw.close();
        socket1.close();
    }

}
