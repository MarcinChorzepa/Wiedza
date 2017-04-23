package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class ExhaustPart extends Warehouse {
    private String emission;

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public ExhaustPart(int pnum, String prod, String ser, String emission) {
        this.setPartNum(pnum);
        this.setProducent(prod);
        this.setSerialNb(ser);
        this.setEmission(emission);

    }
}
