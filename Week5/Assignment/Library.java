package Week5.Assignment;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Add a new member to the library
    public void addMember(Member member) {
        members.add(member);
    }

    // Find a book by title
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Find a member by ID
    public Member findMember(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    // Display library info
    public void showLibraryInfo() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.info());
        }
        System.out.println("\nLibrary Members:");
        for (Member member : members) {
            System.out.println(member.info());
        }
    }
}
