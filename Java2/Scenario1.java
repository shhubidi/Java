import java.util.ArrayList;

class Book{
    String title;
    String author;
    String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // toString for display
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class Scenario1 {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        Book book1 = new Book("Java Programming", "John Doe", "123456789");
        Book book2 = new Book("Data Structures", "Jane Smith", "987654321");
        Book book3 = new Book("Algorithms", "Bob Johnson", "456789123");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayAllBooks();

        // Search for a book
        Book foundBook = library.searchByTitle("Data Structures");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Search for a non-existent book
        foundBook = library.searchByTitle("Non-existent Book");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
