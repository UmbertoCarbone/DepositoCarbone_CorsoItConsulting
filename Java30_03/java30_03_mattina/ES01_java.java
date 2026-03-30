import java.util.Scanner;
import java.util.ArrayList;

class BankAccount {
    String accountHolderName;
    double balance;

    // costruttore
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // aggiunge amount al saldo
    void deposit(double amount) {
        balance += amount;
    }

    // preleva amount solo se il saldo non va in negativo
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saldo insufficiente!");
        } else {
            balance -= amount;
        }
    }

    // mostra il saldo attuale
    void displayBalance() {
        System.out.println("Saldo di " + accountHolderName + ": " + balance);
    }
}

public class ES01_java {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Crea nuovo account");
            System.out.println("2 - Deposita");
            System.out.println("3 - Preleva");
            System.out.println("4 - Visualizza saldo");
            System.out.println("5 - Lista Clienti");
            System.out.println("6 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    creaNuovoAccount();
                    break;
                case 2:
                    deposita();
                    break;
                case 3:
                    preleva();
                    break;
                case 4:
                    visualizzaSaldo();
                    break;
                case 5:
                    cicloClienti();

                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    // funzione per stampare la lista dei clienti
    static void cicloClienti() {
        System.out.println("Lista dei clienti ");
        if (accounts.size() == 0) {
            System.out.println("ci sono 0 clienti");
        }
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + " - " + accounts.get(i).accountHolderName);
        }
    }

    // crea un nuovo account e lo aggiunge alla lista
    static void creaNuovoAccount() {
        System.out.print("Nuovo Account! Inserisci Nome: ");
        scanner.nextLine(); // pulizia buffer
        String nome = scanner.nextLine();

        System.out.print("Saldo iniziale: ");
        double saldo = scanner.nextDouble();

        accounts.add(new BankAccount(nome, saldo));
        System.out.println("Account creato per " + nome + "!");
    }

    // deposita su un account scelto
    static void deposita() {
        if (accounts.isEmpty()) {
            System.out.println("Nessun account disponibile.");
            return;
        }

        // mostra la lista degli account
        cicloClienti();

        System.out.print("Scegli account: ");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > accounts.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        System.out.print("Importo da depositare: ");
        double importo = scanner.nextDouble();

        // chiama il metodo deposit della classe BankAccount
        BankAccount account = accounts.get(scelta - 1);
        account.deposit(importo);
        System.out.println("Depositati " + importo + " su " + account.accountHolderName);
    }

    // preleva da un account scelto
    static void preleva() {
        if (accounts.isEmpty()) {
            System.out.println("Nessun account disponibile.");
            return;
        }

        // mostra la lista degli account
        cicloClienti();

        System.out.print("Scegli account: ");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > accounts.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        System.out.print("Importo da prelevare: ");
        double importo = scanner.nextDouble();

        // chiama il metodo withdraw della classe BankAccount
        BankAccount account = accounts.get(scelta - 1);
        account.withdraw(importo);
    }

    // mostra il saldo di un account scelto
    static void visualizzaSaldo() {
        if (accounts.isEmpty()) {
            System.out.println("Nessun account disponibile.");
            return;
        }

        // mostra la lista degli account
        cicloClienti();

        System.out.print("Scegli account: ");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > accounts.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        // chiama il metodo displayBalance della classe BankAccount
        accounts.get(scelta - 1).displayBalance();
    }
}