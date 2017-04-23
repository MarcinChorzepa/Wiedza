package Temat11;

/**
 * Created by Marcin on 22.04.2017.
 */
public class HelloName {
    public static void main(String[] args) {
    final String krzysiek="Krzysiek";
    final String maciek="Maciek";
    final String marek="Marek";
    String name="Marek";

    switch (name){
        case krzysiek:System.out.println("Siemano Krzychu! Witaj w programie");
        break;
        case maciek:case marek: System.out.println("Witam Panie Prezesie. Jak mija dzień?");
        break;
        default: System.out.println("Witaj nieznany użytkowniku");
    }
    }
}
