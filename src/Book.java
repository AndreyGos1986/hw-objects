public class Book {
    String title;
    Author author;
    int pubYear;

    public Book(String title, Author author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public void setPubYear(int pubYear) {
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

    public String toString() {
        return "Название  книги: " + getTitle() + ", " +
                "Автор книги: " + author.toString() + ", " +
                "Год выпуска книги: " + getPubYear();

    }

    public boolean booksEquals(Book book) {
        if (this.getTitle() == book.getTitle()) {
            if (this.author.authorEquals(author)) {
                return true;
            }
         }
        return false;
    }
    public void getBookHashCode () {
        System.out.println("book.hashCode() = " +this.hashCode());
    }
}
