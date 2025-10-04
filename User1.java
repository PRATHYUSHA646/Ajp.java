

// Base class
class User {
    String name;
    int age;

    // Constructor
    User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

// Derived class (Employee inherits from User)
class Employee extends User {
    String add;

    // Constructor
    Employee(String name, int age, String company, double salary) {
        super(name, age);  // Call parent constructor
        this.add = add;;
        
    }

    void displayEmployeeInfo() {
        // Call parent class method
        displayUserInfo();
              System.out.println("add: " + add);
    
    }
}

// Main class
public class User1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Prathyusha", 25, "Hyd",10000);

        // Show all details
        emp.displayEmployeeInfo();
    }    
}
