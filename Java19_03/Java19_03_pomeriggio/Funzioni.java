package Java19_03.Java19_03_pomeriggio;

public class Funzioni {

    static int pippoAddizione(int a, int b) {
        return a + b;
    }

    static void mostra(int numero) {
        System.out.println("Numero: " + numero);
    }

    static void mostra(String testo) {
        System.out.println("Testo: " + testo);
    }

    public static void main(String[] args) {
        System.out.println(pippoAddizione(10, 20));
        mostra(10);
        mostra("ciao");
    }

}
