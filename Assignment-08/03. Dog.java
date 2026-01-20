
                                         //Task-03 

public class Dog extends Animal{
  
  String type;       //Breed;
  
  public Dog(String Name, int Age, String Color, String Type){
    
    super(Name,Age,Color);
    type=Type;
  }
  
  public String info(){
    
    return super.info() +"Breed: "+type;
  }
  
  public void makeSound(){
    System.out.println(color+" color "+ name+" is barking");
  }
  
}
