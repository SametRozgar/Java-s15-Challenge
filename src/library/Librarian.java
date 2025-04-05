package library;


public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Kitap ödünç verme
    public void issueBook(Library library, String bookId, MemberRecord member) {
        Book book = library.searchBookById(bookId);
        if (book != null && book.getStatus().equals("AVAILABLE") &&
                member.getNoBooksIssued() < member.getMaxBookLimit()) {
            library.lendBook(bookId, new Reader(member.getName()));
            member.incBooksIssued();
            System.out.println("Kitap verildi: " + book.getTitle());
        } else {
            System.out.println("Kitap verilemedi!");
        }
    }

    // Kitap iade alma
    public void returnBook(Library library, String bookId, MemberRecord member) {
        library.takeBackBook(bookId);
        member.decBooksIssued();
        System.out.println("Kitap iade alındı.");
    }

    // Üye doğrulama
    public boolean verifyMember(MemberRecord member) {
        return member != null && member.getNoBooksIssued() >= 0;
    }
}