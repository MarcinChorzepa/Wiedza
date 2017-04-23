package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Warehouse {
    private int partNum;
    private String producent;
    private String serialNb;

    public int getPartNum() {
        return partNum;
    }

    public void setPartNum(int partNum) {
        this.partNum = partNum;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getSerialNb() {
        return serialNb;
    }

    public void setSerialNb(String serialNb) {
        this.serialNb = serialNb;
    }

    public Warehouse() {

    }

    public Warehouse(int pnumber, String prod, String serial) {
        this.setPartNum(pnumber);
        this.setProducent(prod);
        this.setSerialNb(serial);
    }

    public void dispalyPart() {
        System.out.println("Część: " + partNum + " producent: " + producent + " serial number: " + serialNb);
    }
}
