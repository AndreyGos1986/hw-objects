public class Main {
    public static void main(String[] args) {

        Author author = new Author("Иван", "Иванов");
        Author author2 = new Author("Сидр", "Сидоров");

        Book horror = new Book("Ужасные Ужасы ", author, 1955);
        Book novel = new Book("Романтичный роман", author2, 1974);

        System.out.println("Общие данные о книге ужасов:" + " "
                + "Названние книги: " + horror.getTitle() + " " +
                "Автор книги: " + author.getName() + " " + author.getLastName() + " "
                + "Год издания книги: " + horror.getPubYear());
        horror.setPubYear(1966);//меняем через Сеттер год издания

        System.out.println("После изменения года издания книги ужасов: " + " " +
                "Названние книги: " + horror.getTitle() + " " +
                "Автор книги: " + author.getName() + " " + author.getLastName() + " " +
                "Год издания книги: " + horror.getPubYear());
        System.out.println();


        System.out.println("Общие данные о романе:" + " " +
                "Названние книги: " + novel.getTitle() + " " +
                "Автор книги: " + author2.getName() + " " + author2.getLastName() + " " +
                "Год издания книги: " + novel.getPubYear());
        novel.setPubYear(2017);//меняем через Сеттер год издания
        System.out.println("После изменения года издания романа:" + " " +
                "Названние книги: " + novel.getTitle() + " " +
                "Автор книги: " + author2.getName() + " " + author2.getLastName() + " " +
                "Год издания книги: " + novel.getPubYear());


    }
}
