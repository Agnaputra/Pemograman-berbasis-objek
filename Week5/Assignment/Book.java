package Week5.Assignment;

public class Book {
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;  // Book is available initially
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Borrow the book
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    // Return the book
    public void returnBook() {
        available = true;
    }

    // Display book details
    public String info() {
        return "Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}

