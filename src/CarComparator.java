/**
 * Created by Marcin on 22.04.2017.
 */
public class CarComparator {
    //static Car polonez;
    public static void main(String[] args){
        Car audi=new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        boolean isCar=audi instanceof Car;
        System.out.println(isCar);

        Car ff=new Car();

        System.out.println(ff.brand);
       // System.out.println(polonez.brand);
    }
}
