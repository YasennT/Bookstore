import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

        System.out.print("Enter the number of books: ");
        int numBooks = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter author name: ");
            String authorName = sc.nextLine();

            System.out.print("Enter author age: ");
            int authorAge = sc.nextInt();
            sc.nextLine();

            Author author = new Author(authorName, authorAge);

            System.out.print("Enter book type (CHILDREN_BOOK, COMIC_BOOK, BOOK): ");
            String bookTypeStr = sc.nextLine();
            BookType bookType = BookType.valueOf(bookTypeStr);

            Book book;
            if (bookType == BookType.COMIC_BOOK) {
                System.out.print("Enter character name: ");
                String characterName = sc.nextLine();
                book = new ComicBook(title, author, 10.0, characterName);
            } else if (bookType == BookType.CHILDREN_BOOK) {
                System.out.print("Enter age group: ");
                int age = sc.nextInt();
                book = new ChildrenBook(title, author, 12.0, age);
            } else {
                book = new Book(title, author, 15.0);
            }

            bookstore.books.add(book);
        }
        sc.close();

        if (!bookstore.books.isEmpty()) {
            Book bookToSell = bookstore.books.get(0);
            bookstore.sell(bookToSell);
        }
    }
}
