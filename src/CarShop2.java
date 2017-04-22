/**
 * Created by Marcin on 22.04.2017.
 */
public class CarShop2 {
    public static void main(String args[]){
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



    }
}
