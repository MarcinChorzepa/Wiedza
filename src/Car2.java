/**
 * Created by Marcin on 22.04.2017.
 */
public class Car2 {
    int year;
    String brand;
    String model;
    String color;

    Car2(int year,String brand,String model,String color){
        this(year,brand,model);
        this.color=color;
    }

    Car2(int year,String brand,String model){
        this.year=year;
        this.brand=brand;
        this.model=model;
    }
    void printCar(){
        System.out.println("Rocznik: "+this.year+ " Marka: "+this.brand+" Model: "+this.model+" kolor: "+this.color);
    }
    void printString(String a){
        System.out.println(a);
    }
    void printString(String a , String b){
        printString(a);
        System.out.println(b);

    }
    void printString(String a , String b, String c){
        printString(a,b);
        System.out.println(c);
    }
}
