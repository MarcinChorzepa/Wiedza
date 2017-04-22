/**
 * Created by Marcin on 22.04.2017.
 */
public class ComputerStore {
    public static void main(String args[]){
       /*
        Computer comp1=new Computer();
        comp1.processor="Intel i5";
        comp1.memory=8192;

        Computer comp2=new Computer();
        comp2.processor="AMS Ryzen 1700";
        comp2.memory=16384;
*/

      /* tworzenie poprze class Factory
       ComputerFactory factory=new ComputerFactory();
       Computer comp1=factory.create("Intel i5",8192);
       Computer comp2=factory.create("AMD Ryzen 1700",16384);

       */
      /*Tworzenie poprzez konstruktora stworzyłem osobną klasę ale powinno być w klasie Computer*/
      ComputerConstructor comp1=new ComputerConstructor("Intel i5",8192);
      ComputerConstructor comp2=new ComputerConstructor("AMD Ryzen 1700",16384);

        System.out.println(comp1.processor + " " + comp1.memory);
        System.out.println(comp2.processor + " " + comp2.memory);
/* musiałem to wyłączyć bo konstruktora zbudowałem w innej klasie
ComputerUpgrade upgrade = new ComputerUpgrade();
upgrade.addMemory(comp1,1024);
*/

        comp1.printInfo();
        comp2.printInfo();
    }
}
