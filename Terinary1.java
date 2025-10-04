

public class Terinary1 {
    public static void main(String[] args) {
        int num1=15;
        int num2=20;
        int num3=35;
        int big=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);

        System.out.println("greatest number is:"+big);
    }
}
