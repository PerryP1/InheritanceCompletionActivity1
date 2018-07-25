import java.util.Scanner;

public class ProductApp {

    private String code;  // default: null
    private String description;
    private double Price; // default: 0.0

    public static void main(String[] args) {

        //Object declarartion
        Product p = new Product();
        // Object initialization
        //p = new Product

        System.out.println(p);

        p.setCode("CODE-01");
        p.setDescription("Product 01 description");
        p.setPrice(50.00);

        System.out.println(p);

        Book b = new Book();
        b.setAuthor("Dr Suess");
        b.setPages(30);
        System.out.println("Author is: " + b.getAuthor());
        System.out.println("Pages: " + b.getPages());

        Book c = new Book();
        c.setAuthor("RL Stein");
        c.setPages(200);
        System.out.println("Author is: " + c.getAuthor());
        System.out.println("Pages: " + c.getPages());

        System.out.println();

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
