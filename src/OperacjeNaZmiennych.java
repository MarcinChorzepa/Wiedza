import java.util.Random;

/**
 * Created by Marcin on 21.04.2017.
 */
public class OperacjeNaZmiennych {
    public static void main(String[] args){
        Random rand=new Random();
        int x=rand.nextInt(10);
        int y= new Random().nextInt(10);

        System.out.println(x);
        System.out.println(y);

        System.out.println("Czy X jest większe od Y?");
        System.out.println(x>y);

        System.out.println("Czy X pomnożone przez 2 jest większe od Y?");
        System.out.println(x*2>y);

        System.out.println("Czy Y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(y<x+3 && y>x-2);

        System.out.println("Czy iloczyn liczb X i Y  jest parzysty?");
        System.out.println(x*y%2==0);

    }
}
