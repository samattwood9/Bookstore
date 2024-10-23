import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookstoreTest {

    private Bookstore bookstore;

    @BeforeEach
    void setUp() {
        bookstore = new Bookstore();
    }

    // TODO: Add an appropriate @DisplayName here.
    // TODO: Turn this into a parameterised test that reads from a separate file.
    @Test
    void addBook_ValidBook_IsAdded() {
        // arrange
        Book book = new Book("STORM IN A TEACUP", 7.99);

        // act
        bookstore.addBook(book);

        // assert
        assertTrue(bookstore.getBooks().contains(book));
    }

    @Test
    void testAddAndFindBook() {
        // Create a new book
        String bookTitle = "Howl's Moving Castle";
        Book book = new Book(bookTitle, 10.99);

        // Add book to bookstore
        // TODO: You can make this test fail by adding a line or two here... Have a go at breaking it
        // (HINT) You don't need to make any additional assertions
        bookstore.addBook(book);

        // Find book in bookstore
        Book found = bookstore.findBook(bookTitle);

        // Confirm that the added book can be found
        assertNotNull(found, "The book should be found.");
        assertEquals(book, found, "The found book should be equivalent to the one that was added");
    }
}