import java.util.Scanner;

public class Table {

    // Method to print table of a number
    static void printTable(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to print its table: ");
        int number = sc.nextInt();

        // Call the method
        printTable(number);

        
    }

}
