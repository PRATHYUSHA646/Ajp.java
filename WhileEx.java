public  class  WhileEx {
    public static void main(String[] args) {
        int num=4;
        int fact=1;
        int temp=num;
        while(temp>=1) {
                fact*=num;
                num--;
        }
            System.out.println("Factorial of "+temp+"="+fact);
        
    }
}    