             
 //Task-01             //A

public class UniversityTester{
  public static void main(String[]args){
    University u1=new University();
    University u2=new University();
    System.out.println("u1 location: "+u1);      //The location of the objects won't be same bcz a new location is assigned during the creation of an object;
    System.out.println("u2 location: "+u2);
    System.out.println("\nu1 name: "+u1.name);
    System.out.println("u1 country: "+u1.country);       // no values assigned yet, so will be null;
    System.out.println("u2 name: "+u2.name);
    System.out.println("u2 country: "+u2.country);
    System.out.println("\nAre the location of the objects the same? "+(u1==u2));
    
                 //B
    
    u1.name = "Imperial College London";
    u1.country ="England";
    u2.name = "BRAC University";
    u2.country = "Bangladesh";
    
    System.out.println("\nu1 name: "+u1.name);
    System.out.println("u1 country: "+u1.country);   // Instance varibales of the both objects have been changed and of different values;
    System.out.println("u2 name: "+u2.name);
    System.out.println("u2 country: "+u2.country);
  }
}
