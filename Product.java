public abstract class Product {
    private String name;
    private double price;

    Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    final public String getName() {
        return name;
    }

    final public void setName(String name) {
        this.name = name;
    }

    final public double getPrice() {
        return price;
    }

    final public void setPrice(double price) {
        this.price = price;
    }
    public abstract double getDiscount();
}
