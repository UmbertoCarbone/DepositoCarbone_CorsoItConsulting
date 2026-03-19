package Java19_03.Java19_03_mattina;

import java.util.ArrayList;
import java.util.Scanner;

public class ES01_ArrayList {
    public static void main(String[] args) {

        // Scanner per input da tastiera
        Scanner scanner = new Scanner(System.in);
        // ArrayList per memorizzare i nomi degli studenti
        ArrayList<String> studenti = new ArrayList<>();

        String nome = "";

        // Inserimento nomi finché non si scrive "fine"
        while (!nome.equals("fine")) {
            System.out.println("aggiungi un nome");
            nome = scanner.nextLine();
            // Se il nome inserito non è "fine", lo aggiunge alla lista degli studenti
            if (!nome.equals("fine")) {
                studenti.add(nome); // aggiunge il nome alla lista
                System.out.println(nome); // stampa il nome appena aggiunto
            }
        }

        // Stampa tutti i nomi inseriti
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println("Nome studente : " + studenti.get(i));
        }
        // Stampa il numero totale di studenti inseriti
        System.out.println("Sono stati inseriti Studenti : " + studenti.size());

        String risposta = "";

        
        // Ciclo per eliminare studenti finché l'utente non scrive "n"
        while (!risposta.equals("n")) {
            // Chiede se si vuole eliminare uno studente
            System.out.println("Vuoi eliminare uno studente? (s/n)");
            risposta = scanner.nextLine();

            // Se l'utente sceglie "s"
            if (risposta.equals("s")) {
                System.out.println("Scrivi il nome dello studente da eliminare:");
                String elimina = scanner.nextLine();
                // Controlla se il nome esiste nella lista
                if (studenti.contains(elimina)) {
                    studenti.remove(elimina); // elimina il nome
                    System.out.println("Studente eliminato!");
                } else {
                    System.out.println("Nome non trovato! Riprova."); // messaggio di errore
                }
            }
            // Se l'utente sceglie "n"
            else if (risposta.equals("n")) {
                System.out.println("Studenti rimasti: " + studenti); // stampa la lista aggiornata
            }
            // Se l'utente scrive altro
            else {
                System.out.println("Risposta non valida! Scrivi 's' o 'n'."); // messaggio per input non valido
            }
        }

    }
}