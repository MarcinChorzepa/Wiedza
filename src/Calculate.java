/**
 * Created by Marcin on 22.04.2017.
 */
public class Calculate {
    public static  void main(String args[]){
        Calculator calc=new Calculator();
        double x=4.25;
        double y=2.4;
        double result;
        result=calc.add(x,y);
        System.out.println(result);
        result=calc.substract(x,y);
        System.out.println(result);
        result=calc.multipy(x,y);
        System.out.println(result);
        result=calc.divide(x,y);
        System.out.println(result);
    }
}
