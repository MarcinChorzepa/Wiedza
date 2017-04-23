package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Test17 {
    public static void main(String[] args) {
        Warehouse wr = new Warehouse(16, "miód", "45dfafd");
        Tire tr = new Tire(78, "Kamaz", "45fsdf", 42, 128);
        ExhaustPart ep = new ExhaustPart(1, "Goodyear", "788dfs", "EN56");

        wr.dispalyPart();
        tr.dispalyPart();
        ep.dispalyPart();
    }
}
