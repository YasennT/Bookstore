import java.util.ArrayList;
import java.util.List;

public class Bookstore
{
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void sell(Book book)
    {
        if (books.contains(book))
        {
            books.remove(book);
            System.out.println("Prodadeno: " + book.getTitle() + " ot " + book.getAuthor().getName() + " za lv " + book.getPrice());
        }
        else
        {
            System.out.println("Izvinete, " + book.getTitle() + " ot " + book.getAuthor().getName() + " ne e nalichna");
        }
    }
}
