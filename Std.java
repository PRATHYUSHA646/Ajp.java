
import java.util.Scanner;


public class Std {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Read marks for each subject manually
        System.out.print("Enter marks for Sub1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Sub 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Sub3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks for Subj4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks for Subj5: ");
        int sub5 = sc.nextInt();

        // Calculate total and percentage
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (double) totalMarks / 5;

        // Display result
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage  = " + percentage + "%");
    }    
}