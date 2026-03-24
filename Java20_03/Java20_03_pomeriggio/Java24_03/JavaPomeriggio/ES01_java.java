package Java20_03.Java20_03_pomeriggio.Java24_03.JavaPomeriggio;

import java.util.Scanner;
//creazione oggetti fuori dal main

// classe Prodotto
class Prodotto {
    String nome;
    double prezzo;
    int quantita;

    // costruttore
    Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // richiama i dati
    void stampa() {
        System.out.println("Nome: " + nome + ", Prezzo: " + prezzo + ", Quantità: " + quantita);
    }
}

// classe negozio
class Negozio {
    String nomeNegozio;
    Prodotto prodotto;

    // costruttore
    Negozio(String nomeNegozio, Prodotto prodotto) {
        this.nomeNegozio = nomeNegozio;
        this.prodotto = prodotto;
    }

    // rihiama i dati
    void stampa() {
        System.out.print("Negozio: " + nomeNegozio + " - ");
        if (prodotto != null) {
            prodotto.stampa();
        } else {
            System.out.println("Nessun prodotto associato.");
        }
    }
}

public class ES01_java {

    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        Negozio[] negozi = new Negozio[3];
        boolean continua = true;

        while (continua) {
            System.out.println("\nMENU:");
            System.out.println("1 - Inserisci prodotto in un negozio");
            System.out.println("2 - Visualizza dati di tutti i negozi");
            System.out.println("3 - Cerca il negozio con il prodotto più costoso");
            System.out.println("4 - Modifica quantità di un prodotto");
            System.out.println("5 - Vendi prodotti da un negozio");
            System.out.println("6 - Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scannerInt.nextInt();
            scannerStr.nextLine(); // consuma il newline

            switch (scelta) {
                case 1:
                    inserisciProdotto(negozi);
                    break;
                case 2:
                    visualizzaNegozi(negozi);
                    break;
                case 3:
                    cercaProdottoCostoso(negozi);
                    break;
                case 4:
                    modificaQuantita(negozi);
                    break;
                case 5:
                    vendiProdotto(negozi);
                    break;
                case 6:
                    continua = false;
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    static void inserisciProdotto(Negozio[] negozi) {
        // Da implementare
    }

    static void visualizzaNegozi(Negozio[] negozi) {
        // Da implementare
    }

    static void cercaProdottoCostoso(Negozio[] negozi) {
        // Da implementare
    }

    static void modificaQuantita(Negozio[] negozi) {
        // Da implementare
    }

    static void vendiProdotto(Negozio[] negozi) {
        // Da implementare
    }
}