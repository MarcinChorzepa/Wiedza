package Temat19;

/**
 * Created by Marcin on 25.04.2017.
 */
public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Jan", "Kowalski");
        System.out.println("student1==student2");
        System.out.println(student1 == student2);
        System.out.println("Student1.equal(student2)");
        System.out.println(student1.equals(student2));
        Student student3=student1;
        System.out.println("student1==student3");
        System.out.println(student1 == student3);
        System.out.println("Student1.equal(student3)");
        System.out.println(student1.equals(student3));
        student1.printInfo();
        System.out.println(student1);

        String studentDesc=student2.toString();
        System.out.println(studentDesc);

        Student[] students = new Student[3];
        students[0] = new Student("Zenek", "Koza");
        students[1] = new Student("Marek", "Wierzba");
        students[2] = new Student("Ania", "Bania");

        for(int i=0;i<students.length;i++) {
            System.out.println(students[i]);
        }
    }
}
