package Zadanie19;

/**
 * Created by Marcin on 25.04.2017.
 */
public class Computer {
    private String producer;
    private int model;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Computer(String producent, int model) {
        this.setProducer(producent);
        this.setModel(model);
    }

    public Computer() {

    }
    @Override
    public String toString() {
        return "Producent: "+getProducer()+" Model: "+getModel();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof Computer))
            return false;
        Computer c = (Computer) obj;
        if (this.getProducer() != null)
            if(producer.equals(c.getProducer())&&c.getModel()==this.model)
            return true;
    return false;

    }
}
