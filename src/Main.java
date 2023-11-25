import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

        System.out.print("Vavedete broi knigi: ");
        int numberBooks = sc.nextInt();

        for (int i = 0; i < numberBooks; i++) {
            System.out.println("Vavedete detaili za Kniga " + (i + 1));

            System.out.print("Vavedete zaglavie: ");
            String title = sc.next();

            System.out.print("Vavedete imeto na avtora: ");
            String authorName = sc.next();

            System.out.print("Vavedete vuzrast na avtor: ");
            int authorAge = sc.nextInt();

            Author author = new Author(authorName, authorAge);

            System.out.print("Vavedete vid kniga (CHILDREN_BOOK, COMIC_BOOK, BOOK): ");
            BookType bookType = BookType.valueOf(sc.next());

            Book book;
            switch (bookType) {
                case CHILDREN_BOOK:
                    System.out.print("Vavedete vuzrast: ");
                    int age = sc.nextInt();
                    book = new ChildrenBook(title, author, 12.0, age);
                    break;
                case COMIC_BOOK:
                    System.out.print("Enter character name: ");
                    String characterName = sc.next();
                    book = new ComicBook(title, author, 10.0, characterName);
                    break;
                default:
                    book = new Book(title, author, 15.0);
                    break;

            }

            bookstore.addBook(book);
        }

        for (int i = 1; i < numberBooks; i += 2)  //Ima problem s metoda
        {
            Book prodajba = bookstore.getBooks().get(i);
            bookstore.sell(prodajba);
        }
    }
}
