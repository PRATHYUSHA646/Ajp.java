import java.util.Scanner;

public class Stdresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of subject 3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of subject 4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of subject 5: ");
        int s5 = sc.nextInt()
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (double) total / 5;
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display result
        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage  = " + percentage + "%");
        System.out.println("Grade       = " + grade);
    
    }
}