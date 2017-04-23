package Temat13;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Zadanie13 {
    public static void main(String[] args) {
double[][] tab=new double[3][3];
//        tab[0][0] = 1;
//        tab[1][0] = 1.5;
//        tab[2][0] = 2;
//        tab[0][1] = 1.5;
//        tab[1][1] = 2;
//        tab[2][1] = 2.5;
//        tab[0][2] = 2;
//        tab[1][2] = 2.5;
//        tab[2][2] = 3;
//tak będzie lepiej
        double[] line1 = {1, 1.5, 2};
        double[] line2 = {1.5, 2, 2.5};
        double[] line3 = {2, 2.5, 3};
        tab[0] = line1;
        tab[1] = line2;
        tab[2] = line3;

        System.out.println("Suma iloczynów przekątnych: ");
        System.out.println((tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]));
        System.out.println("Iloczyn sum srodkowego wiersza i kolumny: ");
        System.out.println((tab[0][1] + tab[1][1] + tab[2][1]) * (tab[1][2] + tab[1][1] + tab[1][0]));
         System.out.println("Suma wszystkich elementów przy krawędzi tablicy: ");
        System.out.println(tab[0][0] + tab[0][1] + tab[0][2] + tab[0][1] + tab[2][1] + tab[0][2] + tab[1][2] + tab[2][2]);
        System.out.println(max(tab, 1));

    }
    public static double max(double[][] tablica, int wiersz){
        double max = tablica[wiersz][0];
        for(int i=0; i<tablica[wiersz].length; i++)
            if(max < tablica[wiersz][i])
                max = tablica[wiersz][i];
        return max;
    }
}
