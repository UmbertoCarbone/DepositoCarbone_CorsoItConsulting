package Java19_03.Java19_03_mattina;

import java.util.ArrayList;
import java.util.Scanner;

public class ES02_menu {
    public static void main(String[] args) {

        // scanner per input da tastiera
        Scanner scannerStr = new Scanner(System.in);

        // scelta per lo switch del menu
        int scelta = 0;

        // arraylist per memorizzare i nomi inseriti dall'utente
        ArrayList<String> listName = new ArrayList<>();

        while (scelta != 5) {
            System.out.println("1 - Aggiungi nome");
            System.out.println("2 - Visualizza tutti i nomi");
            System.out.println("3 - Cerca nome");
            System.out.println("4 - Rimuovi nome");
            System.out.println("5 - Esci");
            System.out.print("Scegli un'opzione: ");
            // se non lo inserisco fa il loop all'infinito!
            scelta = scannerStr.nextInt();
            scannerStr.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Aggiungi un nome all'array: ");
                    String nome = scannerStr.nextLine(); // leggi il nome inserito dall'utente
                    listName.add(nome); // aggiungi il nome alla lista
                    System.out.println("Nome aggiunto!");
                    break;
                case 2:
                    // se listName è vuoto stampa "Lista vuota!", altrimenti stampa la lista attuale
                    if (listName.isEmpty()) {
                        System.out.println("Lista vuota!");
                        // stampa la lista aggiornata
                    } else {
                        System.out.println("Nomi presenti nella lista: " + listName);
                    }
                    break;

                case 3:
                    // cerca il nome nella lista
                    System.out.println("Inserisci il nome da cercare: ");
                    String nomeCercato = scannerStr.nextLine();
                    // verifica se listName contiene il nome cercato
                    if (listName.contains(nomeCercato)) {
                        System.out.println("Il nome cercato " + nomeCercato.toUpperCase() + " esiste!");
                        // messaggio se il nome esiste
                    } else {
                        System.out.println("Il nome cercato " + nomeCercato.toUpperCase() + " non esiste!");
                        // messaggio se il nome non esiste
                    }
                    break;
                case 4:
                    // controllo se esiste il nome, se esiste lo cancella, altrimenti messaggio di
                    // errore
                    System.out.println("Elimina un nome dalla lista");
                    String nomeEliminato = scannerStr.nextLine();

                    // se listName contiene il nome da eliminare, cancella il nome inserito dalla
                    // lista
                    if (listName.contains(nomeEliminato)) {
                        // rimuovi il nome inserito
                        listName.remove(nomeEliminato);
                        System.out.println("Nome eliminato!");
                        // lista aggiornata
                        System.out.println(listName);
                    } else {
                        System.out.println("Nome non trovato! Impossibile da eliminare!");
                    }

                    break;
                case 5:
                    // esci dal ciclo
                    System.out.println("Esci dal ciclo");
                    break;
                default:
                    // gestione scelta non valida
                    System.out.println("Riprova!");
                    break;
            }
        }
        scannerStr.close();
    }

}
