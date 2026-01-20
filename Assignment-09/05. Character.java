
// Overriding the equals() method in the parent class Character;

public class Character {
  public String name;
  public int level;
  
  public Character(String name, int level) {
    this.name = name;
    this.level = level;
  }
  
  public void specialMove() {
    System.out.println("Character uses a generic move.");
  }
  
  // Override the .equals() method
  
  public boolean equals(Character c){
    
    if(c instanceof Warrior){
      if(c.level== this.level){
        return true;
      }
      else{                 //We can also use String as Return Type instead of Boolean;
        return false;
      }
    }
    else if( c instanceof Mage){
      if(c.level==this.level){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
    
  }
  
}







