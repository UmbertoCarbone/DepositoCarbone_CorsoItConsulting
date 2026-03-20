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

        Veicolo veicolo = new Veicolo();

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
                    inserisciDatiVeicolo(scannerStr, scannerInt, veicolo);
                    break;
                case 2:
                    datiVeicolo(veicolo);
                    break;
                case 3:
                    modificaPrezzoVeicolo(scannerInt, veicolo);
                    break;
                case 4:
                    verificaEta(scannerInt, veicolo);
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

    public static void inserisciDatiVeicolo(Scanner scannerStr, Scanner scannerInt, Veicolo veicolo) {
        System.out.print("Marca: ");
        veicolo.marca = scannerStr.nextLine();

        System.out.print("Modello: ");
        veicolo.modello = scannerStr.nextLine();

        System.out.print("Anno: ");
        veicolo.anno = scannerInt.nextInt();

        System.out.print("Prezzo: ");
        veicolo.prezzo = scannerInt.nextDouble();

        // Controlli base
        if (veicolo.prezzo <= 0) {
            System.out.println("Prezzo non valido");
        }

        if (veicolo.anno <= 1900) {
            System.out.println("Anno non valido");
        }

    }

    public static void datiVeicolo(Veicolo veicolo) {
        System.out.println("--- VEICOLO ---");
        System.out.println("Marca: " + veicolo.marca);
        System.out.println("Modello: " + veicolo.modello);
        System.out.println("Anno: " + veicolo.anno);
        System.out.println("Prezzo: " + veicolo.prezzo);
    }

    public static void modificaPrezzoVeicolo(Scanner scannerInt, Veicolo veicolo) {
        System.out.println("Modifica il prezzo del veicolo");
        double newPrice = scannerInt.nextDouble();
        if (newPrice > 0) {
            veicolo.prezzo = newPrice;
            System.out.println("Prezzo nuovo inserito! ");
        } else {
            System.out.println("Riprova! hai inserito 0 ");
        }
    }

    public static void verificaEta(Scanner scannerInt, Veicolo veicolo) {

        int annoCorrente = 2026;
        int eta = annoCorrente - veicolo.anno;

        if (eta < 5) {
            System.out.println("eta del veicolo e anno: " + veicolo.anno + " Nuovo (meno di 5 anni)");
        } else if (eta <= 15) {
            System.out.println("eta del veicolo e anno: " + veicolo.anno + " Usato (tra 5 e 15 anni)");
        } else {
            System.out.println("eta del veicolo e anno: " + veicolo.anno + " Vecchio (più di 15 anni)");
        }
    }
}
