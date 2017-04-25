package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class AnimalSound {
    public static void main(String[] args) {
    Animal animal=new Animal();
        Bird bird = new Bird();
        Cat cat=new Cat();
        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
        bird.superSound();
    }
}
