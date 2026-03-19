package Java19_03.Java19_03_pomeriggio;

public class functionArray {
    static void modifica(int[] arr) {
        arr[0] = 99; // Questa modifica sarà visibile all'esterno
    }

    public static void main(String[] args) {
        int[] numeri = { 1, 2, 3 };
        modifica(numeri);
        System.out.println(numeri[0]); // Output: 99
    }
}
