import java.util.Scanner;

public class cicli {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci lo 0");
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Hai stampato " + numero);
            System.out.println("Inserisci lo 0 per terminare:");
            numero = scanner.nextInt();
        }
        System.out.println("Hai inserito 0, programma terminato.");
    }
}
