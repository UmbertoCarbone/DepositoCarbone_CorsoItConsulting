package es_01;

import java.util.Scanner;

public class Simulatore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double creditoTotale = 10.00;

        int sceltaNumero;
        do {
            System.out.println("Scegli le seguenti opzioni: ");
            System.out.println("1) Caffe - 1.50$");
            System.out.println("2) Cappuccino - 2.00$");
            System.out.println("3) Te' - 1.00$");
            System.out.println("4) Acqua - 0.50$");
            System.out.println("5) Uscire");
            System.out.print("Inserisci la tua scelta: ");

            sceltaNumero = scanner.nextInt();

            double prezzo = 0;

            switch (sceltaNumero) {
                case 1:
                    prezzo = 1.50;
                    break;
                case 2:
                    prezzo = 2.00;
                    break;
                case 3:
                    prezzo = 1.00;
                    break;
                case 4:
                    prezzo = 0.50;
                    break;
                case 5:
                    System.out.println("Uscito dal menu, totale credito: " + creditoTotale);
                    break;
                default:
                    System.out.println("Scelta non valida.");

            }

            if (sceltaNumero >= 1 && sceltaNumero <= 4) {
                if (creditoTotale >= prezzo) {
                    creditoTotale -= prezzo;
                    System.out.println("Credito residuo: " + creditoTotale);
                } else {
                    System.out.println("Credito insufficiente!");
                }
            }

        } while (creditoTotale > 0 && sceltaNumero != 5);

        scanner.close();
    }
}