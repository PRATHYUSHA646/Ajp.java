public class Terinary2 {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int c=9;
        int big=a<c?(a>c?a:b):(c<a?b:c);
        int small=(a>b?c:a);
        System.out.println("greater num is:"+big);
        System.out.println("small num is:"+small);

    }
}