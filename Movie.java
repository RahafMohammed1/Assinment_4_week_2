public class Movie extends Product{
   private String director;
   private double discountPercent=10;

   public Movie(String name, double price, String director) {
      super(name, price);
      this.director = director;
   }

   final public String getDirector() {
      return director;
   }

   final public void setDirector(String director) {
      this.director = director;
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
