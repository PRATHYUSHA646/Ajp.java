
import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
            int num = sc.nextInt();
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false; // numbers less than or equal to 1 are not prime
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false; // found a divisor, not prime
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
  
            }
    }
}    
