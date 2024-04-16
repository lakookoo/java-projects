package libapp;


public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("25374");
        app.searchByTitle("Castle");
        app.searchByTitle("night");
        app.searchByTitle("kook");
        app.checkOutBook("83471");
        app.checkOutBook("51576");
        app.checkOutBook("5157");
        app.checkInBook("83471");
    }
}