/**
 * Created by Marcin on 22.04.2017.
 */
public class CalcTest {
    public static void main(String[] args){
        Calc calc=new Calc();
        double addResult=calc.add(2.5,7.5);
        System.out.println(addResult);

        calc.addAndPrint(6,8);

    }
}
