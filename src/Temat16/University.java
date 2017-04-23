package Temat16;

/**
 * Created by Marcin on 23.04.2017.
 */
public class University {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Marcin", "Chorzepa", 44);
        students[1] = new Student("Michał", "Borkowski", 11);
            students[2]=new Student();
        students[2].setFirstName("Wojciech");
        students[2].setLastName("Całka");

        System.out.println("Liczba studentów: " + Student.numOfStudents);

    }
}
