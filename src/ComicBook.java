public class ComicBook extends Book
{
    private String characterName;

    public ComicBook(String title, Author author, double price, String characterName)
    {
        super(title, author, price);
        this.characterName = characterName;
    }

    @Override
    public double getPrice() {
        return 0.4 * getPrice();
    }

    public double getPrice(double discountPercent)
    {
        return (1 - discountPercent / 100) * getPrice();
    }

    public void printComicBookInfo()
    {
        System.out.println("Komiks - Zaglavie: " + getTitle() + ", Avtor: " + getAuthor().getName() +
                ", Geroi: " + characterName + ", Cena: lv " + getPrice());
    }
}
