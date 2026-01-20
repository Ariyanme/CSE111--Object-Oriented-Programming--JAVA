
                                          //Review Lab Task-05 

public class Dragon extends MagicalCreature{
  
  int level;
  
  public Dragon(String name, int age, int level){
    
    super(name, age);
    this.level=level;
  }
  
  public void makeSound(){
    System.out.println(name+" roars with a fiery breath!");
  }
  
  public void performMagic(){
    System.out.println(name+" breathes fire with power level: "+level);
  }
  
  public void fly(){
    System.out.println(name+" flies through the sky.");
  }
  
}

