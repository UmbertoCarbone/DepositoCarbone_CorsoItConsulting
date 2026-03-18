package intro;

public class SimpleArrayForLoop {
    public static void main(String[] args) {
        // Dichiarazione di un array di 5 elementi
        int[] numeri = new int[5];

        // Riempimento dell'array con i numeri 1-5
        
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 1;
        }

        // Stampa degli elementi dell'array
        System.out.println("Elementi dell'array:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + " ");
        }
    }
}