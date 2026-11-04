/*
 * Program Name : ObjectClassDemo
 *
 * Description :
 * Demonstrates methods inherited from Object class.
 * Every class in Java directly or indirectly extends
 * the Object class.
 *
 * Author : Krapi Pundhir
 */

public class ObjectClassMthd {

    public static void main(String[] args) {

        Student student = new Student("Krapi", 101);

        // Returns String representation of object
        System.out.println(student.toString());

        // Returns Runtime Class information
        System.out.println(student.getClass());

        // Returns HashCode value
        System.out.println(student.hashCode());

        Student anotherStudent =
                new Student("Krapi", 101);

        // Compares objects
        System.out.println(
                student.equals(anotherStudent)
        );
    }
}

class Student {

    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='"
                + name
                + "', rollNumber="
                + rollNumber + "}";
    }

    @Override
    public boolean equals(Object obj) {

        Student other = (Student) obj;

        return this.rollNumber
                == other.rollNumber;
    }

    @Override
    public int hashCode() {
        return rollNumber;
    }
}