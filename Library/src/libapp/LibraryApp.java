package libapp;

import java.util.ArrayList;

public class LibraryApp {
    // it handles outside requests whenever they comes from, the frontend of the app
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("1 book found: \n\tTitle: %s\n\t Genre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.println(" O Books found");
        }
    }

    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s' in the title... \n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n ", books.size(), books.size() > 0 ? ":" : ".");
        for (Book book : books) {
            System.out.printf("\tTitle: %s\n\t Genre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());

        }
        System.out.println();

    }
}
