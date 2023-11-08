package ClientPackage;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Adresse du serveur
        int port = 1234;

        try (Socket socket = new Socket(serverAddress, port)) {
            InputStream inputStream = socket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

            String serverResponse = in.readLine();
            System.out.println("Heure actuelle reçue du serveur : " + serverResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
