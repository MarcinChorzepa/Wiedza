package Temat17;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Tire extends Warehouse {
    private int width;
    private int size;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Tire() {

    }

    public Tire(int pnum, String prod, String serial, int wid, int sz) {
        this.setPartNum(pnum);
        this.setProducent(prod);
        this.setSerialNb(serial);
        this.setWidth(wid);
        this.setSize(sz);
    }
}
