package testPratici.TestPrimaSettimana;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimoTest {
    public static void main(String[] args) {
        // import scanner
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        // array nomiProdotti e quantitaProdotti
        ArrayList<String> nomiProdotti = new ArrayList<>();
        ArrayList<Integer> quantitaProdotti = new ArrayList<>();

        // numero da inserire per la scelta del menu'
        int scelta = 0;
        // ciclo while con switch
        while (scelta != 7) {

            // Menu'
            System.out.println("Menu\'");
            System.out.println("1 - Aggiungi prodotto");
            System.out.println("2 - Visualizza produzione");
            System.out.println("3 - Cerca prodotto");
            System.out.println("4 - Modifica quantità");
            System.out.println("5 - Rimuovi prodotto");
            System.out.println("6 - Calcola totale pezzi prodotti");
            System.out.println("7 - Esci");

            // inserire la scelta
            scelta = scannerInt.nextInt();
            scannerInt.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 2:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 3:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 4:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 5:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 6:
                    System.out.println("1 - Aggiungi prodotto");
                    break;
                case 7:
                    System.out.println("Fine");
                    break;
                default:
                    System.out.println("Scelta non valida! Riprova.");
            }
        }
    }
}
