package Temat12;

/**
 * Created by Marcin on 22.04.2017.
 */
public class Employee {
   private String firstName;
   private String lastName;
   private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String firstName,String lastName, double salary){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
    }
}
