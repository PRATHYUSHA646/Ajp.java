public class Relational1{
    public static void main(String[] args) {
        // Relational Operators in Java
        int a=25;
        int b=30;
        System.out.println("a == b : " + (a == b));   // equal to
        System.out.println("a != b : " + (a != b));   // not equal to
        System.out.println("a > b  : " + (a > b));    // greater than
        System.out.println("a < b  : " + (a < b));    // less than
        System.out.println("a >= b : " + (a >= b));   // greater than or equal to
        System.out.println("a <= b : " + (a <= b));   // less than or equal to

    }
}


//Terinary oeration to find greast of given 3 numbers.java
public class Terinary2 {
    public static void main(String[] args) {
        // Terinary greast of 3 numbers
        int a=3;
        int b=6;
        int c=9;
        int big=a<c?(a>c?a:b):(c<a?b:c);
        int small=(a>b?c:a);
        System.out.println("greater num is:"+big);
        System.out.println("small num is:"+small);

    }
}
    
