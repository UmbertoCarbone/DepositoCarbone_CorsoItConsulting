import java.util.Scanner;
import java.util.ArrayList;
import java.sql.*;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void displayBookInfo() {
        System.out.println(
                "Titolo: " + title + " | Autore: " + author + " | Disponibile: " + (isAvailable ? "Sì" : "No"));
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

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
            books.get(i).displayBookInfo();
        }
    }

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

public class App {

    static Scanner scanner = new Scanner(System.in);
    static Library library = new Library();
    // connessione al database MySQL
    static Connection conn;

    public static void main(String[] args) {

        // connessione al database prima di tutto
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "root");
            System.out.println("Connesso al database!");
        } catch (SQLException e) {
            System.out.println("Errore di connessione al database.");
            e.printStackTrace();
            return;
        }

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

        // chiude la connessione quando si esce
        try {
            conn.close();
            System.out.println("Connessione chiusa.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void aggiungiLibro() {
        System.out.print("Titolo: ");
        String title = scanner.nextLine();

        System.out.print("Autore: ");
        String author = scanner.nextLine();

        // aggiunge il libro all'ArrayList
        library.addBook(new Book(title, author));

        // salva il libro nel database
        try {
            String sql = "INSERT INTO books (title, author, isAvailable) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setBoolean(3, true);
            stmt.executeUpdate();
            System.out.println("Libro aggiunto!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void visualizzaLibri() {
        // legge i libri direttamente dal database
        try {
            String sql = "SELECT * FROM books";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            boolean trovato = false;
            while (rs.next()) {
                trovato = true;
                System.out.println(
                        "Titolo: " + rs.getString("title") +
                                " | Autore: " + rs.getString("author") +
                                " | Disponibile: " + (rs.getBoolean("isAvailable") ? "Sì" : "No"));
            }
            if (!trovato)
                System.out.println("Nessun libro disponibile.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void cercaLibro() {
        System.out.print("Cerca per titolo o autore: ");
        String keyword = scanner.nextLine();
        library.searchBook(keyword);
    }

    static void prendiInPrestito() {
        System.out.print("Titolo del libro: ");
        String title = scanner.nextLine();

        // aggiorna isAvailable nel database
        try {
            String sql = "UPDATE books SET isAvailable = false WHERE title = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            int righe = stmt.executeUpdate();
            if (righe > 0) {
                System.out.println("Hai preso in prestito: " + title);
            } else {
                System.out.println("Libro non trovato.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void restituisciLibro() {
        System.out.print("Titolo del libro da restituire: ");
        String title = scanner.nextLine();

        // aggiorna isAvailable nel database
        try {
            String sql = "UPDATE books SET isAvailable = true WHERE title = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            int righe = stmt.executeUpdate();
            if (righe > 0) {
                System.out.println("Libro restituito: " + title);
            } else {
                System.out.println("Libro non trovato.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}