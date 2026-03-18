import java.util.Scanner;

public class esCicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // numeri dei voti da inserire nel ciclo for
        System.out.println("Quanti voti vuoi inserire? (numero positivo)");
        int numeroVoti = scanner.nextInt();

        // Validazione con while
        while (numeroVoti <= 0) {
            System.out.println("Numero non valido! Inserisci un numero positivo:");
            numeroVoti = scanner.nextInt();
        }

        int votiValidi = 0;

        // Ciclo for per inserire i voti
        for (int i = 0; i < numeroVoti; i++) {
            System.out.println("Inserisci il voto #" + (i + 1) + " (0-30):");
            int voto = scanner.nextInt();

            if (voto >= 0 && voto <= 30) {
                //incremento votoValido +1
                votiValidi++;
                //voto maggiore
                if (voto > 24) {
                    System.out.println("Voto: Ottimo");
                } else if (voto >= 18) {
                    System.out.println("Voto: Sufficiente");
                } else {
                    System.out.println("Voto: Insufficiente");
                }
            } else {
                System.out.println("Voto non valido");
                // return ?
            }
        }

        System.out.println("Numero totale di voti validi inseriti: " + votiValidi);
    }
}