package Java19_03.Java19_03_mattina;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUtil {
    public static void main(String[] args) {
        /*
         * ArrayList<String> nomi = new ArrayList<>();
         * nomi.add("francesco");
         * nomi.add("pippo");
         * nomi.add("ciccio");
         * 
         * System.out.println(nomi.get(0));
         * System.out.println(nomi.get(1));
         * System.out.println(nomi.get(2));
         */

        ArrayList<Integer> numeri = new ArrayList<>();

        // agggiungi 10 numeri casuali
        for (int i = 0; i < 10; i++) {
            numeri.add((int) (Math.random() * 100)); // aggiungo un numero casuale tra 0 e 99
        }

        System.out.println("Numeri random" + numeri);
        // ordino la lista
        Collections.sort(numeri);

        System.out.println("lista ordinata" + numeri);
    }

}
