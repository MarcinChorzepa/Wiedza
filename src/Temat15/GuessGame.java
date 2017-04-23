package Temat15;

import java.util.Scanner;

/**
 * Created by Marcin on 23.04.2017.
 */
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=50;
        int userInput;

        System.out.println("Zgadnij liczbę");

        while ((userInput = sc.nextInt()) != number) {
            if (userInput < number) {
                System.out.println("Podana liczba jest za mała");
            }else{
                System.out.println("Podana liczba jest za duża");
            }
        }
        System.out.println("Brawo zgadłeś");
        sc.close();

    }
}
