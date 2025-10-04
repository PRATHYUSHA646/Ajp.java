
import java.util.regex.Pattern;

public  class Pattern {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Pattern p=new Pattern();
        p.pattern(n);
    }
}