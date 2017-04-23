package Temat15;

import java.util.Scanner;

/**
 * Created by Marcin on 23.04.2017.
 */
public class ForEachProblem {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int tmp : numbers) {
            System.out.println("Podaj liczbę");
            tmp=sc.nextInt();
        }
        sc.close();
        for (int tmp : numbers) {
            System.out.println(tmp);
        }

        /*Powyższy program pomimo iż możemy spodziewać się,
         że wypisze na ekranie wprowadzone liczby, to jednak wyświetla
          trzy zera. Spowodowane jest to tym, że kolejne liczby
          przypisywaliśmy do zmiennej tmp, a nie do bezpośrednio do tablicy.*/
    }
}
