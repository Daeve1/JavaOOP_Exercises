import java.util.ArrayList;

public class LibraryMain {
    
    private ArrayList<String> books;

  
    public LibraryMain() {
        books = new ArrayList<>();
    }

   
    public void addBook(String title) {
        books.add(title);
        System.out.println("\"" + title + "\" has been added to the library.");
    }

    
    public void removeBook(String title) {
        if (books.remove(title)) {
            System.out.println("\"" + title + "\" has been removed from the library.");
        } else {
            System.out.println("\"" + title + "\" not found in the library.");
        }
    }

    
    public void displayBooks() {
        System.out.println("\nLibrary Collection:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
        System.out.println("-----------------------------------");
    }

   
    public static void main(String[] args) {
        LibraryMain library = new LibraryMain();

     
        library.addBook("Harry Potter and the Sorcerer's Stone");
        library.addBook("The Hobbit");
        library.addBook("To Kill a Mockingbird");

       
        library.displayBooks();

     
        library.removeBook("The Hobbit");

      
        library.displayBooks();
    }
}
