import library.Book;
import library.Library;
import library.Reader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Örnek Kitap Ekleme
        Book book1 = new Book("B001", "Clean Code", "Robert Martin", 29.99);
        library.addBook(book1);

        // Konsol Menüsü
        while (true) {
            System.out.println("\n1. Kitap Ödünç Al\n2. Kitap İade Et\n3. Çıkış");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    System.out.print("Kitap ID: ");
                    String bookId = scanner.nextLine();
                    Reader reader = new Reader("Ahmet");
                    library.lendBook(bookId, reader);
                    break;
                case 2:
                    System.out.print("Kitap ID: ");
                    bookId = scanner.nextLine();
                    library.takeBackBook(bookId);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}