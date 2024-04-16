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

    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if( book != null ){
            if(book.checkOut()){
                System.out.println("Check out SUCCESSFUL:");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t", book.getIsbn(), book.getTitle(), book.getAuthor());
            } else {
                System.out.println("Check out FAILED: ");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t", book.getIsbn(), book.getTitle(), book.getAuthor());
                System.out.println("Reason: More books checked out than the recorded quantity");
            }


        } else {
            System.out.println("Failed to check out the book. \n");
            System.out.printf("There is no book with that ISBN %s \n on record\n\t", isbn );
        }
    }

    public void checkInBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if( book != null ){
            book.checkIn();
            System.out.println("Book checked in successfully.\n");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t", book.getIsbn(), book.getTitle(), book.getAuthor());
        } else {
            System.out.println("Failed to check in the book. \n");
            System.out.printf("There is no book with that ISBN %s \n on record\n\t", isbn );
        }
    }

}
