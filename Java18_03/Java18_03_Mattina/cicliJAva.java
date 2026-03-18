import java.util.Scanner;

public class cicliJAva {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean RispEsatta = true;

        while (RispEsatta) {
            System.out.println("Scrivi la parola \'cane\'");
            String parolaEsatta = in.nextLine();
            if (parolaEsatta.equals("cane")) {
                System.out.println("Risposta corretta!");
                RispEsatta = false;
            } else {
                System.out.println("Risposta sbagliata, riprova.");
            }
        }
    }
}
