import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // schermata del programma
        System.out.println("Menu:");
        System.out.println("1 - Visualizza profilo");
        System.out.println("2 - Modifica nome");
        System.out.println("3 - Logout");
        // scelta 1-2-3
        System.out.print("Inserisci la tua scelta: ");
        int scelta = in.nextInt();
        in.nextLine();

        switch (scelta) {
            case 1:
                System.out.println("Profilo utente visualizzato");
                break;
            case 2:
                System.out.print("Inserisci il nuovo nome: ");
                String nome = in.nextLine();
                System.out.println("Nome aggiornato in: " + nome);
                break;
            case 3:
                System.out.println("Logout effettuato");
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }
    }
}