class ChildrenBook extends Book
{
    private int age;

    public ChildrenBook(String title, Author author, double price, int age)
    {
        super(title, author, price);
        this.age = age;
    }

    @Override
    public double getPrice()
    {
        return 0.3 * getPrice();
    }

    public void printChildrenBookInfo()
    {
        System.out.println("Detska kniga - Zaglavie: " + getTitle() + ", Avtor: " + getAuthor().getName() +
                ", Vuzrast: " + age + ", Cena: lv " + getPrice());
    }
}
