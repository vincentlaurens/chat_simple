package com.vincentlaurens.insa;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.*;

public class ServeurUDP {

    private byte[] dataReception;


    public ServeurUDP(int port) throws IOException {
        byte[] buffer = new byte[100];
        dataReception = new byte[100];

        DatagramSocket datagramSocket = new DatagramSocket(port);
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 100);
        datagramSocket.receive(datagramPacket);
        System.out.println(datagramPacket.getAddress() + " a envoyé :");


        this.dataReception = datagramPacket.getData();
        String test = new String(dataReception);

        System.out.println(test);
    }
}
