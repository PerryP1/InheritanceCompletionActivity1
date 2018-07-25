public class Product {

    private String code;
    private String description;
    private double price;
    private static int count = 0; // a protected static variable


    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }




    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double unformattedPrice) {

        String formattedData = String.format("%.02f", unformattedPrice);
        return formattedData;

        // Use the NumberFormat class to format the price to 2 decimal places
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;


    }
}





/*Make the following application work. Then create a method that outputs the name of the current class to the console.

Product.java

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}


Book.java

public class Book extends Product {

    private String author;
    private int pages;

}


Software.java

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

}*/