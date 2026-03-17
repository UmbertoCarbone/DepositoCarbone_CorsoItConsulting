/* Esercizi IF-Else


Verifica del segno di un numero:

Scrivi un programma che chiede all'utente di inserire un numero intero.

Se il numero è maggiore di zero, stampa "Il numero è positivo".

Se il numero è minore di zero, stampa "Il numero è negativo".

Se il numero è zero, stampa "Il numero è zero".


Confronto tra due numeri:

Scrivi un programma che richiede all'utente di inserire due numeri.

Utilizza le strutture condizionali per confrontare i due numeri.

Se il primo numero è maggiore, stampa "Il primo numero è maggiore".

Se il secondo numero è maggiore, stampa "Il secondo numero è maggiore".

Se sono uguali, stampa "I numeri sono uguali".


Controllo dell'età:

Scrivi un programma che chiede all'utente la propria età.

Se l'età è inferiore a 18, stampa "Sei minorenne".

Se l'età è 18 o superiore, stampa "Sei maggiorenne".


Verifica dell'anno bisestile:

Scrivi un programma che richiede all'utente di inserire un anno.

Un anno è bisestile se è divisibile per 4 ma non per 100, oppure se è divisibile per 400.

Se l'anno è bisestile, stampa "Anno bisestile".

Altrimenti, stampa "Anno non bisestile". */

import java.util.Scanner;

public class postPomeriggio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // scelta traccia da svolgere

        System.out.println("Scegli l'esercizio da eseguire:");
        System.out.println("1 - Verifica del segno di un numero");
        System.out.println("2 - Confronto tra due numeri");
        System.out.println("3 - Controllo dell'età");
        System.out.println("4 - Verifica dell'anno bisestile");

        // inserimento numero esercizio
        System.out.print("Inserisci il numero dell'esercizio: ");

        int numeroEsercizio = in.nextInt();
        in.nextLine();

        // scelta esercizio numero1
        switch (numeroEsercizio) {
            // gestire il numero intero!
            case 1:
                System.out.println("Scegli un numero intero");

                int numero = in.nextInt();
                in.nextLine();
                // condizione
                if (numero > 0) {
                    System.out.println("Numero Maggiore di 0");
                } else if (numero < 0) {
                    System.out.println("Numero minore di 0!");
                } else {
                    System.out.println("Il numero e\' 0!");
                }
                break;
            case 2:
                System.out.println("Scegli due numeri! 1/2");
                // scelta numero 1
                int num1 = in.nextInt();
                in.nextLine();
                // scelta di due numeri in input
                System.out.println("Scegli due numeri! 2/2");
                int num2 = in.nextInt();
                in.nextLine();

                // condizione num1 e num2
                if (num1 > num2) {
                    System.out
                            .println("Il primo numero e\' maggiore del secondo numero! " + num1 + " e\' > di " + num2);
                } else if (num1 < num2) {
                    System.out.println("Il primo numero e\' minore del secondo numero! " + num1 + " e\' < di " + num2);
                } else {
                    System.out.println("Il primo numero e il secono numero sono uguali!" + num1 + " e\' = a " + num2);
                }
                break;
            // isMaggiorenne ?
            case 3:
                System.out.println("Quanti anni hai? ");

                int eta = in.nextInt();
                in.nextLine();

                // condizione
                if (eta >= 18) {
                    System.out.println("Sei Maggiorenne! Hai eta\': " + eta);
                } else {
                    System.out.println("Sei Minorenne! Hai eta\': " + eta);
                }
                break;
            case 4:
                // attraverso l'input, sapere se l'anno inserito e' bisestile
                System.out.println("Inserisci un anno:");
                int anno = in.nextInt();
                in.nextLine();

                // condizione per anno bisestile
                if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
                    System.out.println("Anno bisestile!");
                } else {
                    System.out.println("Anno non bisestile!");
                }
                break;
            default:
                System.out.println("Scegli un numero da 1 a 4!");
        }
    }
}
