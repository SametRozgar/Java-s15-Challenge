package library;

public class Book implements LibraryItem {
    private String id;
    private String title;
    private String author;
    private double price;
    private String status; // "AVAILABLE" veya "BORROWED"

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.status = "AVAILABLE";
    }

    // Interface Metotları
    @Override
    public String getTitle() { return title; }
    @Override
    public String getAuthor() { return author; }
    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }

    // Getter & Setter
    public String getId() { return id; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}