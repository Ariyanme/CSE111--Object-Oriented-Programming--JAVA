
                                         //Task-01 

                                        //(a)
public class Pokemon{
  
  String name;
  
  public Pokemon(String n){
    name=n;
  }
  
  public void attack(){
    System.out.println(name+" attacks with a basic move!");
  }
  
  public void attack(String n){
    System.out.println(name+ " uses Thunderbolt!");
  }
  
  public void attack(String n, int a){
    System.out.println("Pokemon uses "+n+" with power "+a+"!");
  }
}

                                     //(b)

//Compile Time polymprphism is depicted using method overloading;




