/**
 * Created by Marcin on 22.04.2017.
 */
public class Book {
    String title;
    String author;
    int releseDate;
    int pages;
    String publisher;
    String isbn;
    Book(String bookTitle,String bookAuthor, int bookRelese, int bookPages, String bookPublisher, String bookIsbn){
        title=bookTitle;
        author=bookAuthor;
        releseDate=bookRelese;
        pages=bookPages;
        publisher=bookPublisher;
        isbn=bookIsbn;

    }

    void printInfo() {
        String info = title + "; " + author + "; " + releseDate + "; " + pages + "; " + publisher
                + "; " + isbn;
        System.out.println(info);
    }

}
