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
            System.out.println("--- Menu\' ---");
            System.out.println("1 - Aggiungi prodotto");
            System.out.println("2 - Visualizza produzione");
            System.out.println("3 - Cerca prodotto");
            System.out.println("4 - Modifica quantità");
            System.out.println("5 - Rimuovi prodotto");
            System.out.println("6 - Calcola totale pezzi prodotti");
            System.out.println("7 - Esci");

            // inserire la scelta per il menu'
            scelta = scannerInt.nextInt();
            scannerInt.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiProdotto(nomiProdotti, quantitaProdotti, scannerStr, scannerInt);
                    break;
                case 2:
                    visualizzaProdotto(nomiProdotti, quantitaProdotti);
                    break;
                case 3:
                    cercaProdotto(nomiProdotti, quantitaProdotti, scannerStr);
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

    // funzioni per lo switch
    // funzione case1
    public static void aggiungiProdotto(ArrayList<String> nomiProdotti, ArrayList<Integer> quantitaProdotti,
            Scanner scannerStr, Scanner scannerInt) {

        // inserimento del nome del prodotto con controllo
        String insertSingleProduct;
        // se input e' vuoto, riscrive la domanda. Altrimenti passa avanti
        do {
            System.out.println("Inserisci il nome del prodotto");
            insertSingleProduct = scannerStr.nextLine();
            if (insertSingleProduct.isEmpty()) {
                System.out.println("Errore: Il nome e' vuoto. Riprova");
            }
        } while (insertSingleProduct.isEmpty());

        // se quantita e' minore o uguale a 0. riscrive la domanda
        int insertQuantity;
        do {
            System.out.println("Inserisci la quantita'");
            insertQuantity = scannerInt.nextInt();
            scannerInt.nextLine();
            if (insertQuantity <= 0) {
                System.out.println("Errore: la quantita' deve essere maggiore di 0. Riprova.");
            }
        } while (insertQuantity <= 0);
        // inserisce i dati raccolti nelle array.
        nomiProdotti.add(insertSingleProduct);
        quantitaProdotti.add(insertQuantity);

        // controllo eseguito con successo
        System.out.println("Prodotto aggiunto con successo!");
    }

    // funzione case2
    public static void visualizzaProdotto(ArrayList<String> nomiProdotti, ArrayList<Integer> quantitaProdotti) {
        // visualizza prodotti
        // se la lista e' vuota, stampa che i prodotti non ci sono nell'array
        if (nomiProdotti.isEmpty()) {
            System.out.println("Non ci sono prodotti");
            System.out.println("----------------");
        } else {
            // se lista contiene almeno 1 elmento , inserisce il nomeProdotto e
            // quantitaProdotti.
            System.out.println("Visualizza prodotti: ");
            for (int i = 0; i < nomiProdotti.size(); i++) {
                System.out.println((i + 1) + " - " + nomiProdotti.get(i) + " | Quantità: " + quantitaProdotti.get(i));
            }
            System.out.println("---------------- Fine Visualizzazione prodotti ----------------");
        }
    }

    public static void cercaProdotto(ArrayList<String> nomiProdotti, ArrayList<Integer> quantitaProdotti,
            Scanner scannerStr) {
        System.out.println("Cerca prodotto: ");
        String searchProduct = scannerStr.nextLine();
        for (int i = 0; i < nomiProdotti.size(); i++) {
            if (nomiProdotti.get(i).equals(searchProduct)) {
                System.out.println(
                        "Prodotto trovato: " + nomiProdotti.get(i) + " | Quantità: " + quantitaProdotti.get(i));
                return;
            }
        }
        System.out.println("Prodotto non trovato");
    }
    // todo:non uscire da qua per le funzioni!
}
