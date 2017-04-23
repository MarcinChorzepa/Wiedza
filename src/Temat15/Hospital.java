package Temat15;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Hospital {

public static final int MAX_PATIENTS_NUM=2;
private Patient[] patients;
private int regPatients;

    public Hospital() {
        patients = new Patient[MAX_PATIENTS_NUM];
        regPatients=0;
    }

    public void addPatient(Patient patient) {
        if (regPatients < MAX_PATIENTS_NUM) {
            patients[regPatients]=patient;
            regPatients++;
        }else{
            System.out.println("Zapisano już max liczę pacjętów");
        }
    }
    public void printPatients() {
        for(int i=0;i<regPatients;i++) {
            System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() + " " + patients[i].getPesel());
        }
    }

}
