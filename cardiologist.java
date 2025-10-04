//method overriding
class Doctor {
    void treatment() {
        System.out.println("General treatment");
    }
    void prescription() {
        System.out.println("Doctor prescription");
    }
}

public class cardiologist extends Doctor {
    //void Treatment() {
       // System.out.println("Specialized treatment");
        void treatment() {
        System.out.println("cardiologist treatment is heart problem");
    }
public static void main(String[] args) {
    cardiologist cardic = new cardiologist();
    //doctor.treatment();  // Inherited method
    //doctor.Treatment();  // Overridden method 
    Doctor d = new Doctor(); // Upcasting 
    Doctor d1 = new cardiologist(); // Upcasting
    d.treatment(); // Calls Doctor's treatment method
    d1.treatment(); // Calls cardiologist's treatment method 
    d.prescription(); // Calls Doctor's prescription method
}
}