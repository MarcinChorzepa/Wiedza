package Zadanie19;

import java.util.Scanner;

/**
 * Created by Marcin on 25.04.2017.
 */
public class DataStore {
    private Computer[] computers;
    private Scanner sc;
    private static int maxComp=100;
    private int lcomp;

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public void setLcomp(int lcomp) {
        this.lcomp = lcomp;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[lcomp];
        for(int i=0;i<lcomp;i++) {
            comps[i] = computers[i];
        }
        return comps;

    }

    public int getLcomp() {
        return lcomp;

    }

    public Computer[] getComputer() {
        return computers;
    }

    public DataStore() {
        computers = new Computer[maxComp];
        lcomp=0;

    }

    public void addComp(Computer computer) {
        if (lcomp < maxComp) {
            this.computers[lcomp] = computer;
            lcomp++;
        }else{
            System.out.println("Za mało miejsca");
        }

    }

    public int checkAvaiability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < lcomp; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

}
