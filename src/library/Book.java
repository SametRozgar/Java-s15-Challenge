package library;

public class Book implements LibraryItem{
    private String id;
    private String title;
    private String author;
    private double price;
    private String status; //avaible veya broomed

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.status = "Avaible";
    }




    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void display() {
        System.out.println("Kitap"+title+"tarafından"+author);
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

}
