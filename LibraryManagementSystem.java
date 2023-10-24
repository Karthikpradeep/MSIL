package p3;
import java.util.ArrayList;
class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean available;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initially, the book is available.
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + available;
    }
}
class Library {
    private final ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + book);
                return;
            }
        }
        System.out.println("Book not found with title: " + title);
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("List of Books in the Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        // Adding books to the library
        Book book1 = new Book("Harry potter", "J. K. Rowling", "1338878921");
        Book book2 = new Book("Lord of the rings", "John Ronald Reuel Tolkien", "9788845269707");
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        library.searchBook("Harry potter");
        library.removeBook(book1);
        library.displayBooks();
    }
}

