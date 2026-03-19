package Java19_03.Java19_03_pomeriggio;

public class ES01_funzioni {
    // stesso nome della funziona ma con parametro int = n
    static int fattoriale(int n) {
        int risultato = 1;
        for (int i = 1; i <= n; i++) {
            risultato *= i;
        }
        return risultato;
    }

    // stesso nome della funziona ma con parametro String word
    static void fattoriale(String word) {
        System.out.println("Inserisci un numero valido");
    }

    static int provaFattoriale(int num) {
        if (num == 1) {
            return 1;
        }
        return num * provaFattoriale(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(5)); // n
        fattoriale("ciao"); // Stampa messaggio di errore
        System.out.println(provaFattoriale(5));
    }
}

/*
 * Il metodo fattoriale(int n) deve restituire il risultato del calcolo
 * (il fattoriale), quindi il suo tipo di ritorno è int.
 * Il metodo fattoriale(String word) non restituisce nessun valore, ma solo
 * stampa un messaggio, quindi il suo tipo di ritorno è void.
 * 
 * In sintesi:
 * 
 * Quando vuoi restituire un valore → usa il tipo corrispondente (es. int).
 * Quando vuoi solo eseguire un’azione (es. stampare) → usa void.
 */
