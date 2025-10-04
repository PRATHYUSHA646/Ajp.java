import java.util.Scanner;

public class FibonacciSeris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}


//PALINDROME CHECK PROGRAM  

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;   // store original number
        int reversed = 0;     // to store reversed number
        
        // reverse the number using while loop
        while (num > 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;             // remove last digit
        }
        
        // check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

