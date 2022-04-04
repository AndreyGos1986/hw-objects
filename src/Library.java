
public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }
    public void addBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void showBooks() {
        for (Book book : books) {
            if (book == null) {
                break;
            }
            System.out.println(book.getTitle() + " " +
                    book.getAuthor().getFirstName() + " "
                    + book.getAuthor().getLastName() + " " +
                    book.getPubYear());
        }
    }

    public void showBookByTitle(String title) {
        Book book = findBook(title);
        if (book != null) {
            System.out.println(book.getTitle() + " " +
                    book.getAuthor().getFirstName() + " "
                    + book.getAuthor().getLastName() + " " +
                    book.getPubYear());
        }
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void setPubYear(String title, int newYear) {
        Book book = findBook(title);
        if (book != null) {
            book.setPubYear(newYear);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            if (book == null) {
                sb.append(book);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
