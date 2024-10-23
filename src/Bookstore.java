import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> books;

    public Bookstore() {
        this.books = new ArrayList<>();
    }

    // getters + setters
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    // methods
    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }

        return null;
    }
}