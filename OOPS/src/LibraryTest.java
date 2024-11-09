public class LibraryTest {
    public static void main(String[] args) {
        // Creating individual book objects
        Book book1 = new Book("kalki", "Nag Ashwin", 100.99);
        Book book2 = new Book("sahoo", "sujith", 120.99);
        Book book3 = new Book("Mockingbird", "Harper Lee", 140.50);

        // Array of books for the library
        Book[] books = { book1, book2, book3 };

        // Creating a Library object with books
        Library library = new Library("College Library", books);

        // Displaying library and book details
        library.displayLibraryDetails();
    }
}
