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
