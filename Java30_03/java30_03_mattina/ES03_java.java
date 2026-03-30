import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        // quando creiamo un libro è sempre disponibile di default
        this.isAvailable = true;
    }

    void displayBookInfo() {
        // il ? è un if/else compatto:
        // se isAvailable è true stampa "Sì", altrimenti stampa "No"
        System.out.println(
                "Titolo: " + title + " | Autore: " + author + " | Disponibile: " + (isAvailable ? "Sì" : "No"));
    }
}

class Library {
    // ArrayList di tipo Book: ogni elemento è un oggetto Book
    // i libri appartengono alla Library, per questo stanno qui e non nel main
    ArrayList<Book> books = new ArrayList<>();

    // il parametro "Book book" significa: mi aspetto un oggetto di tipo Book
    // Book = tipo (classe creata da noi), book = nome della variabile
    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Nessun libro disponibile.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + " - ");
            // (i+1) perché l'ArrayList parte da 0 ma l'utente vede i numeri da 1
            books.get(i).displayBookInfo();
        }
    }

    void borrowBook(String title) {
        // "Book b" è una variabile temporanea che rappresenta un libro alla volta
        // ad ogni giro del for, b è un libro diverso dell'ArrayList
        for (Book b : books) {
            // equalsIgnoreCase: confronta le stringhe ignorando maiuscole/minuscole
            if (b.title.equalsIgnoreCase(title)) {
                if (b.isAvailable) {
                    // b non è una copia ma un riferimento all'oggetto originale
                    // quindi modificando b.isAvailable modifichiamo il libro nell'ArrayList
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

    void searchBook(String keyword) {
        // serve a capire se almeno un libro è stato trovato DOPO il for
        // non possiamo stampare "non trovato" dentro il for perché
        // il for scorre tutti i libri e stamperebbe il messaggio per ogni libro che non
        // corrisponde
        boolean trovato = false;
        for (Book b : books) {
            // contains: cerca se la stringa CONTIENE la keyword (ricerca parziale)
            // toLowerCase: converte tutto in minuscolo per ignorare maiuscole/minuscole
            // diverso da equalsIgnoreCase che richiede la stringa intera uguale
            if (b.title.toLowerCase().contains(keyword.toLowerCase()) ||
                    b.author.toLowerCase().contains(keyword.toLowerCase())) {
                b.displayBookInfo();
                trovato = true;
            }
        }
        // ! = negazione: se trovato è false, !trovato è true
        if (!trovato) {
            System.out.println("Nessun libro trovato.");
        }
    }
}

public class ES03_java {

    static Scanner scanner = new Scanner(System.in);
    // Library con L maiuscola = tipo (classe)
    // library con l minuscola = nome della variabile (oggetto)
    // è statica perché deve essere accessibile da tutte le funzioni statiche
    // è una sola perché abbiamo una sola biblioteca con tanti libri dentro
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
            // dopo nextInt() rimane un \n nel buffer
            // senza questa riga la prossima nextLine() leggerebbe il \n e salterebbe la
            // domanda
            scanner.nextLine();

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

        // new Book(title, author) crea prima il libro con titolo e autore
        // poi lo passa direttamente ad addBook che lo aggiunge all'ArrayList
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