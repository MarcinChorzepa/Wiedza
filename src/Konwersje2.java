/**
 * Created by Marcin on 21.04.2017.
 */
public class Konwersje2 {
    public static void main(String[] args) {
        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';
        System.out.println("Błędne \"sumowanie\" znaków");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" + letter1 + letter2 + letter3);
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" + letter1 + letter2 + letter3);
        int x=3;
        double y=10.22;
       /// int z=3.5;
        System.out.println(x>y);

    }
}
