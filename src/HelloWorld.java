/**
 * Created by Marcin on 21.04.2017.
 */
public class HelloWorld {
    public static void main(String[] args){
        int x;
 int wiek=25;
 boolean pr=true;
 char im='J';
 char nz='K';
 String tresc="Czesc Jan , słyszałem , że masz " + wiek + " i uczysz się programować, czy to \n prawda?";
 tresc=tresc+pr + "\n" + "Czy twoje inicjały to " + im+nz +"? \n";
 tresc=tresc+"Tak," + pr;

        System.out.print(tresc);
    }
}
