import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    int pubYear;

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public Book(String title, Author author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }


    public String toString() {
        return "Название  книги: " + getTitle() + ", " +
                "Автор книги: " + author.toString() + ", " +
                "Год выпуска книги: " + getPubYear();

    }

    public String toString2() {
        return String.format("Book: %s by %s", title, author);
    }
}
