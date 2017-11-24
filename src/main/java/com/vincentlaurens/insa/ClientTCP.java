package com.vincentlaurens.insa;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTCP {
    private final static int port = 5554;

    private Socket socketDistant;
    private DataInputStream userInput;
    private PrintStream theOuputStream;

    public ClientTCP(String adressHost) throws IOException{
        socketDistant = new Socket(InetAddress.getByName(adressHost), port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketDistant.getInputStream()));
        PrintStream out = new PrintStream(socketDistant.getOutputStream());
        System.out.println("Client connecté");


    }

}
