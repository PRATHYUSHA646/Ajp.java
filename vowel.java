
import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String kstr = sc.nextLine();
        
        int vowels = 0, consonants = 0;
        kstr = kstr.toLowerCase();

        for (int i = 0; i < kstr.length(); i++) {
            char ch = kstr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
