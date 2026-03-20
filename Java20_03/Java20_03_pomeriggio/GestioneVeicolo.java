package Java20_03.Java20_03_pomeriggio;

import java.util.Scanner;

class Veicolo {
    String marca;
    String modello;
    int anno;
    double prezzo;
}

public class GestioneVeicolo {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        int scelta = 0;

        while (scelta != 5) {

            System.out.println("----- Menu -----");
            System.out.println("1 - Inserisci dati veicolo");
            System.out.println("2 - Visualizza veicolo");
            System.out.println("3 - Modifica prezzo");
            System.out.println("4 - Verifica età veicolo");
            System.out.println("5 - Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scannerInt.nextInt();
            scannerInt.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("prova");
                    break;
                case 2:
                    System.out.println("prova");
                    break;
                case 3:
                    System.out.println("prova");
                    break;
                case 4:
                    System.out.println("prova");
                    /* break */;
                case 5:
                    System.out.println("Esci");
                    break;

                default:
                    System.out.println("Riprova");
                    break;
            }
        }
    }
}
