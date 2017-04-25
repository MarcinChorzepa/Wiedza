package Zadanie19;

/**
 * Created by Marcin on 25.04.2017.
 */
public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.addComp(new Computer("ASUS", 12345));
        dataStore.addComp(new Computer("ASUS", 12345));
        dataStore.addComp(new Computer("APPLE", 5));
        dataStore.addComp(new Computer("APPLE", 6));
        dataStore.addComp(new Computer("HP", 8871927));

        Computer compToFind = new Computer("ASUS", 12345);
        int computersFound = dataStore.checkAvaiability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for(Computer c: dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
