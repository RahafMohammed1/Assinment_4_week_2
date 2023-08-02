import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void BookProducts()
    {
        int num=0;
        Book b1=new Book("The Lord of the Rings",185,"J. R. R. Tolkien");
        Book b2=new Book("The Kite Runner",15,"Khaled Hosseini");
        Scanner scan=new Scanner(System.in);
        Book book;
        do{
            System.out.println("\nBooks: \n1-The Lord of the Rings\n2-The Kite Runner\n0-for exit");
            num=scan.nextInt();
            switch (num) {
                case 1:
                    book = b1;
                    System.out.println("Book name : " + book.getName() + "\n" + "Book Price : " + book.getPrice() + "SR" + "\n" + "Author Name : " + book.getAuthor() + "\n" + "Book Price After discount by " + book.getDiscountPercent() + " % = " + book.getDiscount());
                    break;
                case 2:
                    book = b2;
                    System.out.println("Book name : " + book.getName() + "\n" + "Book Price : " + book.getPrice() + "SR" + "\n" + "Author Name : " + book.getAuthor() + "\n" + "Book Price After discount by " + book.getDiscountPercent() + " % = " + book.getDiscount());
                    break;
            }
        }while (num!=0);

    }

    public static void MovieProducts()
    {
        Scanner scan=new Scanner(System.in);
        Movie m1=new Movie("Luck",100,"Peggy Holmes");
        Movie m2=new Movie("Encanto",200,"Byron Howard, Jared Bush");
        int num;
        Movie movie;
        do {
            System.out.println("\nMovies: \n1-Luck\n2-Encanto\n0-for exit");
            num=scan.nextInt();
            switch (num) {
                case 1:
                    movie = m1;
                    System.out.println("Movie name : " + movie.getName() + "\n" + "Movie Price : " + movie.getPrice() + "SR" + "\n" + "Director Name : " + movie.getDirector() + "\n" + "Movie Price After discount by " + movie.getDiscountPercent() + " % = " + movie.getDiscount());
                    break;
                case 2:
                    movie = m2;
                    System.out.println("Movie name : " + movie.getName() + "\n" + "Movie Price : " + movie.getPrice() + "SR" + "\n" + "Director Name : " + movie.getDirector() + "\n" + "Movie Price After discount by " + movie.getDiscountPercent() + " % = " + movie.getDiscount());
                    break;
            }

        }while (num != 0) ;
        }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=0;
        System.out.println("Welcome in Book-Movie Store...  ");
        do {
            System.out.println("Please choose the product you want to buy or 0 for exit... \n"+"0-exit\n"+"1-Book\n"+"2-Movie");
            try {
                num=scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error,Please enter a Numerical Value ");
            }
            switch (num)
            {
                case 1:
                    System.out.println("Book Products : \nplease choose one to print it's info or 0 for exit");
                    BookProducts();
                    break;
                case 2:
                    System.out.println("Movie Products : \nplease choose one to print it's info");
                    MovieProducts();
                    break;
            }
        }while(num!=0);
    }
}