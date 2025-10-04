public class Evennum {
    public static void main(String[] args) {
        int num = 20;
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " is an even number & divisible by 3");
        } else {
            System.out.println(num + " is odd number or  it is not divisible by 3");
        }
    }
}