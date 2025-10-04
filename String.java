

public class String {
    public static void main(String[] args){
        String str=new String("Anudip");
        String str1="java";
        char arr[]={'p','y','t','h','o','n'};
        String str2=new String(arr);

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        for (int i = 0; i<str.length(); i++)
            System.out.println(str.charAt(i));
            
        
    }
}