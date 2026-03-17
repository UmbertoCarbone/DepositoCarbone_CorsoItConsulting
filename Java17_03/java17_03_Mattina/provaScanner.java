import java.util.Scanner;

public class provaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner: classe // crea scanner object

        // Avvio Input/Output
        System.out.println("Log 1: Avvio programma");
        // nome
        System.out.println("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        // cognome
        System.out.println("Inserisci il tuo Cognome: ");
        String cognome = scanner.nextLine();

        // eta
        System.out.println("Inerisci la tua eta ");
        int eta = scanner.nextInt();
        scanner.nextLine();

        // peso
        System.out.println("Inserisci il tuo peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        // isStudent ?
        System.out.println("Sei uno studente? (true/false)");
        boolean isStudente = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("--------------------------------------------");
        System.out.println(String.format(
                "Mi chiamo %s %s, ho %d anni, peso %.2f kg, studente: %b",
                nome, cognome, eta, peso, isStudente));
        System.out.println("--------------------------------------------");
        System.out.println("Log 2: Fine programma");
    }
}
