package Java31_03.java31_03_pomeriggio.Hotel.javaDB.src;

import java.util.ArrayList;
import java.util.Scanner;

class Camera {
    private int numero;
    private float prezzo;

    // costruttore
    public Camera(int numero, float prezzo) {
        this.numero = numero;
        this.prezzo = prezzo;
    }

    // getter
    public int getNumero() {
        return numero;
    }

    public float getPrezzo() {
        return prezzo;
    }

    // setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    // dettagli senza parametri - stampa tutto
    public void dettagli() {
        System.out.println("Numero: " + numero + " | Prezzo: " + prezzo);
    }

    // dettagli con parametro - stampa prezzo solo se true
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo) {
            System.out.println("Numero: " + numero + " | Prezzo: " + prezzo);
        } else {
            System.out.println("Numero: " + numero);
        }
    }
}

class Suite extends Camera {
    private String serviziExtra;

    // costruttore
    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo); // chiama il costruttore di Camera
        this.serviziExtra = serviziExtra;
    }

    // getter
    public String getServiziExtra() {
        return serviziExtra;
    }

    // setter
    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    // override di dettagli() - aggiunge i servizi extra
    @Override
    public void dettagli() {
        super.dettagli(); // stampa numero e prezzo
        System.out.println("Servizi extra: " + serviziExtra);
    }
}

public class Hotel {
    private String nome;
    private static ArrayList<Camera> camere = new ArrayList<>();

    public Hotel(String nome) {
        this.nome = nome;
    }

    public static void aggiungiCamera(Camera camera) {
        camere.add(camera);
    }

    public static int contaSuite(ArrayList<Camera> lista) {
        int count = 0;
        for (Camera c : lista) {
            if (c instanceof Suite) {
                count++;
            }
        }
        return count;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Inserisci il nome dell'hotel: ");
        String nomeHotel = scanner.nextLine();
        Hotel hotel = new Hotel(nomeHotel);

        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Aggiungi camera");
            System.out.println("2 - Stampa dettagli camere");
            System.out.println("3 - Conta suite");
            System.out.println("4 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline

            switch (scelta) {
                case 1:
                    aggiungiCamera(creaCamera());
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("4 - Esci");
                    break;
                case 4:
                    System.out.println("4 - Esci");
                    break;
                case 5:
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    static Camera creaCamera() {
        System.out.print("Numero camera: ");
        int n = scanner.nextInt();
        System.out.print("Prezzo: ");
        float p = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Camera o Suite? (c/s): ");
        String tipoDiCamera = scanner.nextLine();

        if (tipoDiCamera.equalsIgnoreCase("c")) {
            Camera camera = new Camera(n, p);
            System.out.println("Camera Creata!");
            return camera;
        } else if (tipoDiCamera.equalsIgnoreCase("s")) {
            Suite suite = new Suite(n, p, "Servizi extra inclusi");
            System.out.println("Ispettore creato!");
            return suite;
        } else {
            System.out.println("Ruolo non valido.");
            return null;
        }
    }

}
