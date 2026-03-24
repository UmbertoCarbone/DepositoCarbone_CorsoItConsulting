package Java24_03.JavaPomeriggio;

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
        System.out.print("Negozio: " + this.nomeNegozio + " - ");
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

        negozi[0] = new Negozio("Negozio1", null);
        negozi[1] = new Negozio("Negozio2", null);
        negozi[2] = new Negozio("Negozio3", null);

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

    // Funzione per inserire un prodotto in un negozio scelto dall'utente
    static void inserisciProdotto(Negozio[] negozi) {
        System.out.println("In quale negozio vuoi inserire il prodotto? (1-3)");
        int sceltaNegozio = scannerInt.nextInt();

        // Controllo validità scelta
        if (sceltaNegozio < 1 || sceltaNegozio > 3) {
            System.out.println("Negozio non valido.");
            return;
        }
        System.out.print("Nome prodotto: ");
        String nome = scannerStr.nextLine();
        System.out.print("Prezzo prodotto: ");
        double prezzo = scannerInt.nextDouble();
        System.out.print("Quantità disponibile: ");
        int quantita = scannerInt.nextInt();

        // Crea il nuovo prodotto e lo assegna al negozio scelto
        Prodotto nuovoProdotto = new Prodotto(nome, prezzo, quantita);
        negozi[sceltaNegozio - 1].prodotto = nuovoProdotto;

        System.out.println("Prodotto inserito nel " + negozi[sceltaNegozio - 1].nomeNegozio);
    }

    // Funzione per visualizzare i dati di tutti i negozi
    static void visualizzaNegozi(Negozio[] negozi) {
        for (int i = 0; i < negozi.length; i++) {
            negozi[i].stampa();
        }
    }

    // Funzione per trovare e mostrare il negozio con il prodotto più costoso
    static void cercaProdottoCostoso(Negozio[] negozi) {
        Negozio negozioAlto = negozi[0];
        for (int i = 1; i < negozi.length; i++) {
            // Confronta solo se entrambi i negozi hanno un prodotto
            if (negozi[i].prodotto != null && negozioAlto.prodotto != null) {
                if (negozi[i].prodotto.prezzo > negozioAlto.prodotto.prezzo) {
                    negozioAlto = negozi[i];
                }
            }
        }
        if (negozioAlto.prodotto == null) {
            System.out.println("Nessun prodotto inserito.");
        } else {
            System.out.println("Il negozio con il prodotto più costoso è:");
            negozioAlto.stampa();
        }
    }

    // Funzione per modificare la quantità di un prodotto in un negozio scelto
    static void modificaQuantita(Negozio[] negozi) {
        System.out.println("Scegli il negozio dove modificare la quantita (1-3)");
        int sceltaNegozio = scannerInt.nextInt();

        // Controllo validità scelta
        if (sceltaNegozio < 1 || sceltaNegozio > 3) {
            System.out.println("Negozio non valido.");
            return;
        }

        Prodotto p = negozi[sceltaNegozio - 1].prodotto;

        if (p == null) {
            System.out.println("Nessun prodotto in questo negozio.");
            return;
        }

        System.out.print("Nuova quantità: ");
        p.quantita = scannerInt.nextInt();
        System.out.println("Quantità aggiornata!");
    }

    // Funzione per vendere una quantità di prodotto da un negozio scelto
    static void vendiProdotto(Negozio[] negozi) {
        System.out.println("Da quale negozio vuoi vendere? (1-3)");
        int sceltaNegozio = scannerInt.nextInt();

        // Controllo validità scelta
        if (sceltaNegozio < 1 || sceltaNegozio > 3) {
            System.out.println("Negozio non valido.");
            return;
        }

        Prodotto p = negozi[sceltaNegozio - 1].prodotto;

        if (p == null) {
            System.out.println("Nessun prodotto in questo negozio.");
            return;
        }

        System.out.print("Quante unità vuoi vendere? ");
        int quantitaVenduta = scannerInt.nextInt();

        // Controllo disponibilità
        if (quantitaVenduta > p.quantita) {
            System.out.println("Quantità insufficiente. Disponibili: " + p.quantita);
            return;
        }

        p.quantita -= quantitaVenduta;
        System.out.println("Vendita effettuata! Quantità rimanente: " + p.quantita);
    }
}