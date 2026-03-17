import java.util.Scanner;

public class secondoEsercizio {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        // log per chiedere username
        System.out.println("Inserisci l'username ");
        // input per chiedere l'username
        String username = input.nextLine();

        // condizione
        if (username.length() == 0) {
            System.out.println("Username non valido!");
        } else if (username.length() < 5) {
            System.out.println("Username troppo corto!");
        } else {
            System.out.println("Username valido");
        }
        ///////////////////////// PROSSIMO ESERCIZIO//////////////////////////////
        System.out.println("Prossimo Esercizio!");

        System.out.print("Inserisci l'username: ");
        String userName = input.nextLine();
        System.out.print("Inserisci la password: ");
        String password = input.nextLine();

        String usernameCorretto = "admin";
        String passwordCorretta = "1234";

        // Confronto
        // Condizio se entrambe sono corrette
        if (userName.equals(usernameCorretto) && password.equals(passwordCorretta)) {
            System.out.println("Accesso consentito");
            // condizione se una della due e' corretta
        } else if (userName.equals(usernameCorretto) || password.equals(passwordCorretta)) {
            System.out.println("Credenziali errate");
            // se entrambe sono sbagliate
        } else {
            System.out.println("Accesso negato");
        }
        /////////////////////////// PROSSIMO ESERCIZIO/////////////////////////////////

        System.out.print("Inserisci il codice sconto: ");
        String codice = input.nextLine();

        System.out.print("Inserisci l'importo totale della spesa: ");
        String importoStr = input.nextLine(); // Leggi come stringa

        double importo = Double.parseDouble(importoStr); // Converte in double

        double importoScontato = importo; // valore di default

        if (codice.equals("SCONTO10")) {
            importoScontato = importo - (importo * 0.10); // sconto del 10%
            System.out.println("Totale scontato: " + importoScontato);
        } else if (codice.equals("SCONTO20")) {
            importoScontato = importo - (importo * 0.20); // sconto del 20%
            System.out.println("Totale scontato: " + importoScontato);
        } else if (codice.equals("VIP") && importo > 100) { // inserimento del codice VIP && importo > 100
            importoScontato = importo - (importo * 0.30);
        } else {
            System.out.println("Codice non valido");
        }
    }

}
