import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // password esatta
        String pass = "java123";
        // numereo tentativi
        int tentativi = 0;
        // login all'inizio e' false.
        boolean login = false;

        // cicla massimo 3 volte finche' login non e' true
        while (tentativi < 3 && !login) {
            // input IN
            System.out.print("Inserisci la password: ");
            String password = in.nextLine();

            // Se la password è corretta, login riuscito
            if (password.equals(pass)) {
                login = true;
            } else {
                // Altrimenti aumenta i tentativi e avvisa l'utente
                tentativi++;
                System.out.println("Password errata. Tentativi rimasti: " + (3 - tentativi));

            }
        }
        // Stampa il risultato finale
        if (login) {
            System.out.println("Login Riuscito!");
        } else {
            System.out.println("hai inserito la password sbagliata troppe volte!");
            return;
        }

        // Accendere al sistema : Finche' non si preme s o n, il ciclo parte sempre.
        String system;

        do {
            System.out.println("Vuoi accedere al sistema? (s/n)");
            system = in.nextLine();
        } while (!system.equals("s") && !system.equals("n"));

        if (system.equals("s")) {
            System.out.println("Accesso al sistema effettuato!");
        } else {
            System.out.println("Accesso annullato!");
        }

    }
}
