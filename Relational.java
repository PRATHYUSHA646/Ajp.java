public class Relational {
    public static void main(String[] args) {
        int num1,num2;
        num1=20;
        num2=15;
        System.out.println("num1==num2:"+(num1==num2));
        System.out.println("num1<num2:"+(num1<num2));
        System.out.println("num1>num2:"+(num1>num2));
        //Logical operators
        boolean value=num1>num2 || num1==num2;
        boolean value1=num1>num2 || num1==num2;
        System.out.println(value+" "+value1);
        System.out.println(num1<num2 && num1==num2);
        System.out.println(!(num1>num2 && num1==num2));

    }

}
