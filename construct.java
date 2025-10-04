

public class Construct {
    String name;
    long population;
    String currency;
    country(){
        System.out.println("Constructor ");
    }
    country(String name,long population,String currency){
        this.name=name;
        this.population=population;
        this.currency=currency;
        System.out.println("parameterized constructor");
    }
    country(String name){
        this.name=name;
        
    }
    void display(){
        System.out.println(name+" "+population+" "+currency);
    }

    public static void main(String[] args) {
        // Create an instance of User1 to run the program
      country country=new country();
      country.name="India";
      country.population=200000;
      country.currency="INR"; 
      country.getcountry();
      country country1=new country("USA",300000,"USD");
      country1.getcountry();
      country country2=new country("UK");
      country2.getcountry();

      


    
    }
}