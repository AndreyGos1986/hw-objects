public class Main {
    public static void main(String[] args) {

        Author author = new Author("Иван", "Иванов");
        Author author2 = new Author("Антип", "Сидоров");

        Book horror = new Book("Ужасные Ужасы ", author, 1955);
        Book novel = new Book("Романтичный роман", author2, 1974);
        Book novel2 = new Book("Антиромантичный роман", author2, 1965);

        Author author3 = author;
        Book someNovel = novel;

        System.out.println(horror.toString());//вызов переопределенного метода toString
        System.out.println(novel.toString());//вызов переопределенного метода toString

        System.out.println(novel2.booksEquals(novel)); ////вызов переопределенного метода equals
        System.out.println("novel.booksEquals(someNovel) = " + novel.booksEquals(someNovel));////вызов переопределенного метода equals

        novel.getBookHashCode();//вызов переопределенного метода hashCode для класса Books
        System.out.println("novel.hashCode() = " + novel.hashCode()); // Вызов стандартного метода для сравнения
        author.getAuthorHashCode();//вызов переопределенного метода hashCode для класса Author
        System.out.println("author.hashCode() = " + author.hashCode());



    }
}
