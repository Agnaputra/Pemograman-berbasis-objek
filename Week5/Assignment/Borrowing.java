package Week5.Assignment;

public class Borrowing {
    private Book book;
    private Member member;

    // Constructor
    public Borrowing(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    // Getters
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
