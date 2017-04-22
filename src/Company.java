/**
 * Created by Marcin on 22.04.2017.
 */
public class Company {
    public static void main(String args[]){
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();

        emp1.name="Stefan";
        emp2.name="Marcin";
        emp3.name="Grzegorz";

        emp1.surname="Nowak";
        emp2.surname="Glich";
        emp3.surname="Suman";

        emp1.dateOfBirth="2010-11-01";
        emp2.dateOfBirth="2015-08-02";
        emp3.dateOfBirth="2003-01-25";

        emp1.inJob=3;
        emp2.inJob=2;
        emp3.inJob=8;

        String messText="Pracownik " +emp1.name+" "+emp1.surname+" urodzony: " +emp1.dateOfBirth +" Pracuje tutaj już "+emp1.inJob
                +"\n"+"Pracownik " +emp2.name+" "+emp2.surname+" urodzony: " +emp2.dateOfBirth +" Pracuje tutaj już "+emp2.inJob
                +"\n"+"Pracownik " +emp3.name+" "+emp3.surname+" urodzony: " +emp3.dateOfBirth +" Pracuje tutaj już "+emp3.inJob;
        System.out.println(messText);

    }
}
