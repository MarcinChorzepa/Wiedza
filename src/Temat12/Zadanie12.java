package Temat12;

import java.util.Random;

/**
 * Created by Marcin on 22.04.2017.
 */
public class Zadanie12 {
    public static void main(String[] args) {
    int[] x=new int[3];
    int[] y=new int[3];
        Random rand=new Random();
    int suma=0;
for (int i =0; i<x.length;i++) {
    x[i] = rand.nextInt(10);
    System.out.println("X" + i + " = " + x[i]);
    suma = suma + x[i];
}
    for (int j=0; j<y.length;j++){

        y[j]=rand.nextInt(10);
        System.out.println("Y"+j+" = " +y[j]);
        suma=suma+y[j];
    }



    System.out.println("Suma: "+suma);
    }
}
