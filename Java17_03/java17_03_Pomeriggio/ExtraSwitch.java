import java.util.Scanner;

public class ExtraSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un valore");
        int valore = in.nextInt();
        in.nextLine();

        switch (valore) {
            case 1:
                System.out.println("Uno");
            case 2:
                System.out.println("Due");
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("valore superiore al 3");
        }
    }
}
