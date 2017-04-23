package app;

/**
 * Created by Marcin on 23.04.2017.
 */
public class LibraryApp {

        public static void main(String[] args) {
            final String appName = "Biblioteka v0.7";
            System.out.println(appName);
            LibraryControl libControl = new LibraryControl();
            libControl.controlLoop();

    }
}
