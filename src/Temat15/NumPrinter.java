package Temat15;

/**
 * Created by Marcin on 23.04.2017.
 */
public class NumPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Pierwsza petla: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla: " + i);
        }
        int i = 1;
        while (i <= 5) {
            System.out.println(i++);
        }


    int j = 6;
            do {
        System.out.println("Sprawdzanie do while: "+ j++);
    } while(j<3);
    }

}
