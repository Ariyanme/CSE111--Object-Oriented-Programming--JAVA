
public class Phoenix extends MagicalCreature{
  
  int cycle;
  
  public Phoenix (String name, int age, int cycle){
    
    super(name, age);
    this.cycle=cycle;
  }
  
  public void makeSound(){
    System.out.println(name+" sings an enchanting song.");
  }
  
  public void performMagic(){
    System.out.println(name+" is reborn with "+cycle+" rebirth cycles.");
  }
  
  public void regenerate(){
    System.out.println(name+" regenerates its body in a burst of flames.");
  }
  
}
