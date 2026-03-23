package Java23_03.Java23_03_Mattina;

import java.util.Scanner;

public class ES03_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scelta = 0;

        while (scelta != 3) {
            //
            System.out.println("Scegli un'opzione:");
            System.out.println("1 - Cripta");
            System.out.println("2 - Decripta");
            System.out.println("3 - Esci");
            //
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di newline
            //
            switch (scelta) {
                case 1:
                    
                    // parola da criptare
                    System.out.println("Inserisci la parola da criptare:");
                    String parola = scanner.nextLine();
                    
                    // numero chiave
                    System.out.println("Inserisci la chiave:");
                    int chiave = scanner.nextInt();

                    scanner.nextLine(); // Consuma il newline

                    String risultato = "";

                    // Cicla su ogni carattere della parola
                    for (int i = 0; i < parola.length(); i++) {

                        // Prende il carattere in posizione i
                        char c = parola.charAt(i);

                        // Se il carattere è una lettera minuscola
                        if (c >= 'a' && c <= 'z') {
                            // Applica il cifrario di Cesare: sposta la lettera avanti di "chiave" posizioni nell'alfabeto

                            c = (char) ('a' + (c - 'a' + chiave) % 26);
                        }

                        // Aggiunge il carattere (criptato o invariato) alla stringa risultato
                        risultato += c;
                    }

                    // Stampa la parola criptata finale
                    System.out.println("Risultato cifrato: " + risultato);

                    break;
                case 2:
                    System.out.println("Hai scelto: Decripta");
                    // Qui andrà la logica di decriptazione
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
    }

}