package com.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Scanner;

public class HelloController {

    int portNumber = 1777;
    String command = "";
    // to enter from command prompt
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = null;

    public HelloController () throws IOException {


        Socket socket1 = new Socket(InetAddress.getLocalHost(), portNumber);
        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
        pw = new PrintWriter(socket1.getOutputStream(), true);



    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

      //  welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("Enter command");
        command = scanner.nextLine();

        System.out.println(command + " sent to printer!");
        // writes a string to server
        pw.println(command);
    }

  /**

        while (true) {



            if (command.equals("Close"))
                break;
        }

        br.close();
        pw.close();
        socket1.close();
    }  **/


}