class Book {
    String title;
    String author;
    double price; // Properties

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
    	super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: rs " + price);
        System.out.println("-------------------------");
    }
}
