import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class BookInventory {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(1, "9898", "Raid Shadow Legends");
        books[1] = new Book(2, "9899", "Harry Potter");
        books[2] = new Book(3, "10000", "Game of Throne");
        books[3] = new Book(4, "10001", "Lala land");
        books[4] = new Book(5, "10002", "No Game No Life");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the library!");
            System.out.println("Please select an option:");
            System.out.println("1. Show available books");
            System.out.println("2. Show checked out books");
            // ^ Also display C - to check in book, and x - to go back to the home screen.
            System.out.println("3. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();



        }
    }
}
