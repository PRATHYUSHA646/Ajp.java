

class Employee {
    String name;
    String qualification;
    double salary;
    Employee(String name, String qualification, double salary) {
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Prathyusha", "B.Tech", 50000);
        Employee emp2 = new Employee("prasanna", "B.Tech", 60000);
        emp1.display();
        emp2.display();
    }    
}
