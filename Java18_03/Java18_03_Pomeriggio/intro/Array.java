package intro;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordinazioni;
        do {
            System.out.print("Quanti dolci diversi vuoi ordinare? (max 10): ");
            ordinazioni = scanner.nextInt();
        } while (ordinazioni < 1 || ordinazioni > 10);

        // dati [Array]
        String[] dolci = new String[ordinazioni];
        int[] quantita = new int[ordinazioni];

        for (int i = 0; i < ordinazioni; i++) {
            System.out.println((i + 1));
        }

    }
}
