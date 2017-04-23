package data;


import data.Book;
import utils.DataReader;

/**
 * Created by Marcin on 21.04.2017.
 */
public class Library {
    public static final int MAX_BOOKS = 1000;
    private Book[] books;
    private int booksNumber;

    public Library() {
        books = new Book[MAX_BOOKS];
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maxymalna liczba książek została osiągnięta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        } else {
            for (int i = 0; i < booksNumber; i++) {
                books[i].printInfo();
            }
        }
    }

   /* public static void main(String[] args){
        final String appName="Biblioteka v0.1";
     /**
       String title="W pustyni i w puszczy";
        String author="Henryk Sienkiewicz";
        int releseDate = 2010;
        int pages=296;
        String publisher="Greg";
        String isbn="978897855548";
        System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releseDate);
        System.out.println(pages);
        System.out.println(publisher);
        System.out.println(isbn);
*/
/*Book[] books=new Book[1000];
        DataReader dataReader=new DataReader();

         books[0]=new Book("W pustyni i w puszczy","Henryk Sienkiewicz",2010,296,"Greg","654654654654");
         books[1]=new Book("Java","Genod Hazn",2013,1000,"Greg","5454666666");
         books[2]=new Book("SUN","Adam Mickiewicz",2000,45,"Greg","9989988888");
        books[3]=new Book(books[0]);
        System.out.println("Wprowadź nową książkę");
        books[4]=dataReader.readAndCreateBook();
        dataReader.close();
         /*Zamieniam to na tablice
     Book book1=new Book("W pustyni i w puszczy","Henryk Sienkiewicz",2010,296,"Greg","654654654654");
       Book book2=new Book("Java","Genod Hazn",2013,1000,"Greg","5454666666");
       Book book3=new Book("SUN","Adam Mickiewicz",2000,45,"Greg","9989988888");

Book book4=new Book(book1);
*/


  /*
  Utowrzyłem konstruktora dlatego przypisuje wszystko w 1 linii
     book1.author="Henryk Sienkiewicz";
     book1.releseDate=2010;
     book1.title="W pustyni i w puszczy";
     book1.pages=296;
     book1.publisher="Greg";
     book1.isbn="546581236135";
**/
   /*     System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece");
       books[0].printInfo();
       books[1].printInfo();
       books[2].printInfo();
       books[3].printInfo();
       books[4].printInfo();
       /*
       w klasie Book jest już procedura do wyświetlanie informacji o książce
        System.out.println( book1.title);
        System.out.println( book1.author);
        System.out.println( book1.releseDate);
        System.out.println( book1.pages);
        System.out.println( book1.publisher);
        System.out.println( book1.isbn);
**/
//}  */

}
