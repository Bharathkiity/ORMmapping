class Library {
    String libraryName;
    Book[] books; // Composition - Library has Books

    // Constructor to initialize library details
    public Library(String libraryName, Book[] books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    //  display library details and list all books
    public void displayLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("List of books: ");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
