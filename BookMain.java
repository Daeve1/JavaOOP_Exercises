import java.util.ArrayList;

public class BookMain {
    // Attributes
    private String title;
    private String author;
    private String isbn;

    // Static collection to hold all books
    private static ArrayList<BookMain> books = new ArrayList<>();

    // Constructor
    public BookMain(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    // Static method to add a book to the collection
    public static void addBook(BookMain book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Static method to remove a book by title
    public static void removeBook(String title) {
        boolean removed = false;
        for (BookMain book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Book removed: " + title);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book not found: " + title);
        }
    }

    // Static method to display all books
    public static void displayAllBooks() {
        System.out.println("\nBook Collection:");
        for (BookMain book : books) {
            book.displayBook();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create BookMain objects
        BookMain b1 = new BookMain("Noli Me Tangere", "Dr. Jose Rizal", "978-0747532743");
        BookMain b2 = new BookMain("Flaurante at Laura", "Francisco Balagtas", "978-0261102217");
        BookMain b3 = new BookMain("Mga Ibong Mandaragit", "Amado v. Hernandez", "978-0451524935");

        // Add books to the collection
        addBook(b1);
        addBook(b2);
        addBook(b3);

        // Display all books
        displayAllBooks();

        // Remove one book
        removeBook("Noli Me Tangere");

        // Display updated list
        displayAllBooks();
    }
}
