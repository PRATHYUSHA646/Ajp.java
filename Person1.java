
// Base class
class Person {
    void display() {
        System.out.println("I am a Person.");
    }
}

// Derived class 1
class Student extends Person {
    void study() {
        System.out.println("I am a Student.");
    }
}

// Derived class 2
class Employee extends Person {
    void work() {
        System.out.println("I am an Employee.");
    }
}

// Derived class 3
class Teacher extends Person {
    void teach() {
        System.out.println("I am a Teacher.");
    }
}

public class Person1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.study();

        Employee e = new Employee();
        e.display();
        e.work();

        Teacher t = new Teacher();
        t.display();
        t.teach();
    }    
}
