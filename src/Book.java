public class Book {
    private String book_title;
    private String author;
    private double price;
    private boolean in_stock;
    private String description;

    public Book(){          // default constructor

    }

    public Book(String book_title, String author, double price, boolean in_stock, String description) {
        this.book_title = book_title;
        this.author = author;
        this.price = price;
        this.in_stock = in_stock;
        this.description = description;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public boolean isIn_stock() {
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }

    public void getDisplayText(){
        System.out.println("\nBook Title: " + getBook_title());
        System.out.println("Author: " + getAuthor());
        System.out.println("Description: " + getDescription());

    }
}
