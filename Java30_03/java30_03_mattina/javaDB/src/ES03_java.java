import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    boolean isAvailable;

    // costruttore
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // mostra le informazioni del libro
    void displayBookInfo() {
        System.out.println(
                "Titolo: " + title + " | Autore: " + author + " | Disponibile: " + (isAvailable ? "Sì" : "No"));
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // aggiunge un libro alla biblioteca
    void addBook(Book book) {
        books.add(book);
    }

    // mostra tutti i libri presenti
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Nessun libro disponibile.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + " - ");
            books.get(i).displayBookInfo();
        }
    }

    // prende in prestito un libro se disponibile
    void borrowBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Hai preso in prestito: " + b.title);
                } else {
                    System.out.println("Il libro non è disponibile.");
                }
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    // restituisce un libro e lo segna come disponibile
    void returnBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                b.isAvailable = true;
                System.out.println("Libro restituito: " + b.title);
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    // cerca un libro per titolo o autore
    void searchBook(String keyword) {
        boolean trovato = false;
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase()) ||
                    b.author.toLowerCase().contains(keyword.toLowerCase())) {
                b.displayBookInfo();
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro trovato.");
        }
    }
}

public class ES03_java {

    static Scanner scanner = new Scanner(System.in);
    static Library library = new Library();

    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Aggiungi libro");
            System.out.println("2 - Visualizza tutti i libri");
            System.out.println("3 - Cerca libro");
            System.out.println("4 - Prendi in prestito");
            System.out.println("5 - Restituisci libro");
            System.out.println("6 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer dopo la scelta del menu

            switch (scelta) {
                case 1:
                    aggiungiLibro();
                    break;
                case 2:
                    visualizzaLibri();
                    break;
                case 3:
                    cercaLibro();
                    break;
                case 4:
                    prendiInPrestito();
                    break;
                case 5:
                    restituisciLibro();
                    break;
                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    static void aggiungiLibro() {
        System.out.print("Titolo: ");
        String title = scanner.nextLine();

        System.out.print("Autore: ");
        String author = scanner.nextLine();

        library.addBook(new Book(title, author));
        System.out.println("Libro aggiunto!");
    }

    static void visualizzaLibri() {
        library.displayBooks();
    }

    static void cercaLibro() {
        System.out.print("Cerca per titolo o autore: ");
        String keyword = scanner.nextLine();

        library.searchBook(keyword);
    }

    static void prendiInPrestito() {
        System.out.print("Titolo del libro: ");
        String title = scanner.nextLine();

        library.borrowBook(title);
    }

    static void restituisciLibro() {
        System.out.print("Titolo del libro da restituire: ");
        String title = scanner.nextLine();

        library.returnBook(title);
    }
}