package libapp;

import java.util.ArrayList;

public class BookRepository {
    // contains the books
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("83471", "The dead of Night", "Horror", null, "S.K. Eleton"));
        books.add(new Book("25374", "Castles and Grenellations", "Historical", null, "H.P. Anderson"));
        books.add(new Book("51575", "The Knight's sword", "Fantasy", null, "R.E. Anvil"));
        books.add(new Book("25375", "Castle and Grenellations", "Mystery", null, "H.P. Anderson"));
        books.add(new Book("51576", "Night and Day", "Thriller", null, "R.E. Anvil"));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return  null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                 booksFound.add(book);
            }
        }
        return  booksFound;
    }
}
