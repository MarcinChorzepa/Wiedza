package Temat14;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Marcin on 23.04.2017.
 */
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj A:");
        double a = input.nextDouble();
        System.out.println("Podaj B:");
        double b = input.nextDouble();
        double n1=input.nextInt(); //do double mogę wpisać int
        //int n2 = input.nextDouble();
        input.close();

        System.out.println("A+B=" + (a + b));


    }
}
