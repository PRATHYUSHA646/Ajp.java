
import java.util.Scanner;

public class stdres1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of sub 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of sub  2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of sub 3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of sub 4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of  sub 5: ");
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (double) total / 5;
        String grade;
        if (percentage >= 85) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 55) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage  = " + percentage + "%");
        System.out.println("Grade       = " + grade);
    }
}    
            
               