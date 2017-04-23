package Temat16;

/**
 * Created by Marcin on 23.04.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int indexNum;
    public static int numOfStudents;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public Student() {
        numOfStudents++;
    }

    public Student(String fname,String lname,int index) {
        numOfStudents++;
        this.setFirstName(fname);
        this.setLastName(lname);
        this.setIndexNum(index);

    }
}
