package library;

import java.util.HashSet;
import java.util.Set;

public class Reader extends Person{
    private String name;

    private Set<Book> borrowedBooks=new HashSet<>();

    private static final int MAX_BOOK_LIMIT=5;


    public boolean borrovBook(Book book){
        if(borrowedBooks.size()<MAX_BOOK_LIMIT){
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }


    public void returnBook(Book book){
        borrowedBooks.remove((book));
    }


    public Reader(String name, String name1) {
        super(name);
        this.name = name1;
    }





    @Override
    public void whoyouare() {
        System.out.println("Ben Okuyucuyum benim adım :"+name);
    }


}
