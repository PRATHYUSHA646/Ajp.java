

public class  Student {
    static String collegeName;
    int s_id;
    String s_name;
    String city;
    public  static  void main(String[] args){
         Student student=new Student();
         student.s_id=101;
         student.s_name="prathyu";
         student.city="hyd";
         Student.collegeName="SDES";

         Student student1=new Student();
         student1.s_id=102;
         student1.s_name="jyosh";
         student1.city="nlg";
         student1.collegeName="SDGI";   
         System.out.println(student.s_id+" "+student.s_name+" "+student.city+" "+Student.collegeName);
         System.out.println(student1.s_id+" "+student1.s_name+" "+student1.city+" "+Student.collegeName);    


    }
}