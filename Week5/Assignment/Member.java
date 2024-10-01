package Week5.Assignment;

public class Member {
    private String name;
    private String id;
    private Borrowing[] borrowings;
    private int borrowedCount;

    // Constructor
    public Member(String name, String id, int maxBooks) {
        this.name = name;
        this.id = id;
        this.borrowings = new Borrowing[maxBooks];  // Maximum books member can borrow
        this.borrowedCount = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Borrow a book
    public boolean borrowBook(Book book) {
        if (borrowedCount < borrowings.length && book.isAvailable()) {
            book.borrowBook();
            borrowings[borrowedCount++] = new Borrowing(book, this);
            return true;
        }
        return false;
    }

    // Return a book
    public boolean returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowings[i].getBook() == book) {
                book.returnBook();
                borrowings[i] = null;
                borrowedCount--;
                return true;
            }
        }
        return false;
    }

    // Display member info
    public String info() {
        String info = "Member Name: " + name + ", ID: " + id + "\nBorrowed Books:\n";
        for (int i = 0; i < borrowedCount; i++) {
            info += borrowings[i].getBook().info() + "\n";
        }
        return info;
    }
}

