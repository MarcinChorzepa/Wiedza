package Temat19;

/**
 * Created by Marcin on 25.04.2017.
 */
public class Student {
   String firstName;
   String lastName;

    public Student(String fn, String ln) {
        firstName=fn;
        lastName=ln;
    }

    @Override
    public boolean equals(Object obj) {

if (this == obj)
return true;
// sprawdzamy, czy nie null
if (obj == null)
    return false;

// sprawdzamy, czy przekazany argument jest typu Student
if (!(obj instanceof Student))
return false;
//rzutowanie na odpowiedni typ
Student s = (Student) obj;

// sprawdzenie kolejnych pól klasy, uważając na wartości null
if(this.firstName == s.firstName && this.lastName == s.lastName)
return true;
if(this.firstName != null)
if(!this.firstName.equals(s.firstName))
return false;
if (this.lastName != null)
if(!this.lastName.equals(s.lastName))
return false;
//jeśli dojdziemy do tego miejsca to obiekty są równe
return true;

    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName);
    }

   // @Override
 //   public String toString() {
  //      return firstName + " " + lastName;
  //  }
}
