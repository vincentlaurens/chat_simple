package com.vincentlaurens.insa;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Avant de commencer \n1 - Serveur TCP \n2 - Serveur UDP\n3 - Client TCP\n4 - Client UDP");
        int choixUser = sc.nextInt();

        switch (choixUser){

            case 1:
                System.out.println("Pas encore implémenté");
                break;

            case 2:
                System.out.println("Entrez le numéro de port :");
                int portLocal = sc.nextInt();
                try {
                    ServeurUDP serveurUDP = new ServeurUDP(portLocal);
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Pas encore implémenté");
                break;

            case 4:
                System.out.println("Entrez l'adresse IP de la machine distante et son port");
                String adresse = sc.next();
                int port = sc.nextInt();
                try{
                    ClientUDP clientUDP = new ClientUDP(adresse, port);
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Cas non valide");
                break;
        }

    }
}
