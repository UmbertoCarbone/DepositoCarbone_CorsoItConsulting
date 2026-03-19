package postPomeriggio;

/* Scrivi un programma che chiede all’utente di inserire un numero.
 Continua a chiedere finché l’utente non inserisce 0.
  Alla fine stampa "Fine ciclo". */

public class WhileA {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 30) {
            if (i % 3 == 0) {
                System.out.println(i + " e\' divisibile per 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " e\' divisibile per 5");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
