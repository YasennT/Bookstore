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

    public void addBook(Book book) {
    }
    public void sell(Book prodajba)
    {
        if (books.contains(prodajba))
        {
            books.remove(prodajba);
            System.out.println("Prodadeno: " + prodajba.getTitle() + " ot " + prodajba.getAuthor().getName() + " za lv " + prodajba.getPrice());
        }
        else
        {
            System.out.println("Izvinete, " + prodajba.getTitle() + " ot " + prodajba.getAuthor().getName() + " ne e nalichna");
        }
    }


}
