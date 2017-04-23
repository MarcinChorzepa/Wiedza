package app;

import data.Book;
import data.Library;
import utils.DataReader;

/**
 * Created by Marcin on 23.04.2017.
 */
public class LibraryControl {
    public static final int EXIT=0;
    public static final int ADD_BOOKS = 1;
    public static final int PRINT_BOOKS=2;

    private DataReader dataReader;
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != EXIT) {
            switch (option) {
                case ADD_BOOKS:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
        // zamykamy strumień wejścia
        dataReader.close();

    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }
    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }
}
