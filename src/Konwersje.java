/**
 * Created by Marcin on 21.04.2017.
 */
public class Konwersje {
    public static void main(String[] args){
        double number1=10.987;
        int number2=5;

        int narrowing=(int)number1;
        double widening=(double)number2;
        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);


    }
}
