package libapp;


public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("25374");
        app.searchByTitle("Castle");
        app.searchByTitle("night");
        app.searchByTitle("kook");
    }
}