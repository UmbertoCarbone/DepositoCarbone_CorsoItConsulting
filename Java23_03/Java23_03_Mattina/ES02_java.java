package Java23_03.Java23_03_Mattina;

import java.util.Scanner;

public class ES02_java {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);

        // Giocatore 1 inserisce il numero UNA SOLA VOLTA, con controllo validità
        int numeroScelto;
        do {
            System.out.println("Giocatore 1: Inserisci un numero da 1 a 100");
            numeroScelto = scannerInt.nextInt();
            if (numeroScelto < 1 || numeroScelto > 100) {
                System.out.println("Numero non valido! Riprova.");
            }
        } while (numeroScelto < 1 || numeroScelto > 100);

        // Inizio tentativi per Giocatore 2
        int tentativi = 0;
        boolean indovinato = false;

        while (tentativi < 5 && !indovinato) {
            System.out.println("Giocatore 2: Prova a indovinare il numero (oppure scrivi -1 per arrenderti)");
            int NumeroDaIndovinare = scannerInt.nextInt();

            if (NumeroDaIndovinare == -1) {
                System.out.println("Hai scelto di arrenderti!");
                break;
            }

            if (NumeroDaIndovinare < 1 || NumeroDaIndovinare > 100) {
                System.out.println("Numero non valido! Riprova.");
                continue;
            }

            tentativi++;

            if (NumeroDaIndovinare == numeroScelto) {
                System.out.println("Complimenti! Hai indovinato!");
                indovinato = true;
            } else if (NumeroDaIndovinare < numeroScelto) {
                System.out.println("Troppo basso!");
            } else {
                System.out.println("Troppo alto!");
            }
        }

        if (!indovinato && tentativi == 5) {
            System.out.println("Hai esaurito i tentativi! Il numero era: " + numeroScelto);
        }
    }
}