
public class  caliculate {
    void  add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    void add(int a,int b,int b) {
        System.out.println("sum="+(a+b+c));
    }
    void  multiply(int a,int b){
        System.out.println("Product="+(a*b));
    }
    int multiply(int a,int b,int c);{
       System.out.println("Product="+(a*b));
    }

    public static void main(String[] args) {
        Caluculator calc=new caluculator();
        calc.add(10,80);
        calc.add(12,23,43);
        calc.multiply(10,30);
        calc.multiply(23,65);

        
    }
}