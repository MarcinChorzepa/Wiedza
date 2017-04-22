package data;

/**
 * Created by Marcin on 22.04.2017.
 */
public class Book {
   private String title;
    private String author;
    private int releseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleseDate() {
        return releseDate;
    }

    public void setReleseDate(int releseDate) {
        this.releseDate = releseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String bookTitle, String bookAuthor, int bookRelese, int bookPages, String bookPublisher, String bookIsbn){
        this.setTitle(bookTitle);
        this.setAuthor(bookAuthor);
        this.setReleseDate(bookRelese);
        this.setPages(bookPages);
        this.setPublisher(bookPublisher);
        this.setIsbn(bookIsbn);

    }
public Book(Book book){
        this(book.getTitle(),book.getAuthor(),book.getReleseDate(),book.getPages(),book.getPublisher(),book.getIsbn());
}
   public void printInfo() {
        String info = getTitle() + "; " + getAuthor() + "; " + getReleseDate() + "; " + getPages() + "; " + getPublisher()
                + "; " + getIsbn();
        System.out.println(info);
    }

}
