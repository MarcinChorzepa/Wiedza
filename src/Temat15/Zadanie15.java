package Temat15;

import java.util.Scanner;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("Ile liczb chcesz wprowadzić?");
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();
        int[] numbers=new int[howMany];
        for(int i=0;i<howMany;i++) {
           System.out.println("Podaj cyfrę:" + i+1);
            numbers[i] = sc.nextInt();
        }
        int suma=0;
        for (int tmp : numbers) {
            suma=suma+tmp;
        }
        System.out.println("Suma cyfr: " + suma);
sc.close();

    }
}
