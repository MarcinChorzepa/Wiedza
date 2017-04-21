/**
 * Created by Marcin on 21.04.2017.
 */
public class UpAndDown {
    public static void main(String[] args) {
        int num = 3;
        //najpierw wyświetla, później zwiększa
        System.out.println(num++);
        System.out.println(num);
        //najpierw zwiększa, później wyświetla
        System.out.println(++num);
        System.out.println(num);
    }
}
