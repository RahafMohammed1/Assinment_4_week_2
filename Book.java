public class Book extends Product {
    private String author;
    private double discountPercent=20;
    Book()
    {}

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    final public String getAuthor() {
        return author;
    }

    final public void setAuthor(String author) {
        this.author = author;
    }

    final public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public double getDiscount() {
        double p = discountPercent/100;
        return (1-p)*getPrice();
    }
}
