/**
 * Created by Marcin on 22.04.2017.
 */
public class CarShop2 {
    public static void main(String[] args){
        Car audi=new Car();
        audi.brand="Audi";
        audi.model="A4";
        audi.doors=4;
        audi.carColor="Czarny";
        audi.wheelsColor="Srebrny";
        audi.tiresColor="Czarny";

        String audiInfo=audi.brand+" "+audi.model
                +", Drzwi: "+ audi.doors
                +", Kolor nadwozia: "+ audi.carColor
                +", Kolor felg: "+ audi.wheelsColor
                +", Kolor opon: "+ audi.tiresColor;

        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);

        Car audiCopy=audi;
        audiCopy.carColor="Czerwony";

        System.out.println(audiCopy.carColor);
        System.out.println(audi.carColor);

        Car audiNew=new Car();
        audiNew.carColor="Zielony";
        System.out.println(audiNew.carColor);
/*do lekcji z przeciążaniem metod w klasie*/
        Car2 merc=new Car2(2015,"Mercedes","E180","Red");
        merc.printCar();
        Car2 merc2=new Car2(1998,"Volvo","S40");
        merc2.color="Dark green";
        merc2.printCar();
        merc2.printString(merc2.brand,merc2.model,merc2.color);


    }
}
