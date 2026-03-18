import java.util.Scanner;

public class cicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un numero da 1 a 10");
        int numeroScelto = scanner.nextInt();

        System.out.println("hai scelto il numero" + numeroScelto);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroScelto + " * " + i + " = " + (numeroScelto * i));
        }
    }
}
