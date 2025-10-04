import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      // get last digit
            int fact = 1;

            // find factorial of digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum += fact;              // add factorial to sum
            num = num / 10;           // remove last digit
        }

        if (sum == temp) {
            System.out.println(temp + " is a Strong Number.");
        } else {
            System.out.println(temp + " is NOT a Strong Number.");
        }
    }
}