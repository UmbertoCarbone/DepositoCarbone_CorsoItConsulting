public class cicloDoWhile {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int numero;
        do {
            System.out.print("Inserisci un numero (0 per uscire): ");
            numero = input.nextInt();
        } while (numero != 0);
        System.out.println("Hai inserito 0. Programma terminato.");
    }
}
