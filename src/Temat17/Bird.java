package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("ćwir ćwir");
    }

    public void superSound() {
        super.superSound();
        System.out.println(" ptak ptak");
    }
}
