package Week5.Assignment;

public class MainLibrarySystem {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);

        // Add members to the library
        Member member1 = new Member("John Doe", "M001", 2);
        Member member2 = new Member("Jane Smith", "M002", 2);
        library.addMember(member1);
        library.addMember(member2);

        // Member borrows a book
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        // Display library info
        library.showLibraryInfo();

        // Member returns a book
        member1.returnBook(book1);

        // Display updated library info
        library.showLibraryInfo();
    }
}
