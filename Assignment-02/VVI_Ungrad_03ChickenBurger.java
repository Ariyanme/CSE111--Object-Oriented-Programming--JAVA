//Ungraded Task-03

public class ChickenBurger{
  String bun="Sesame";
  int price=200;
  String sauceOption="Less";
  String spiceLevel="Not Set";
  
  String spice[] = {"Mild", "Spicy", "Naga", "Extreme"};
  int count=0;
  
  public String serveBurger(){
    if(count==0){
      return "Cannot serve now. Customize Spice Level first.";
    }
    else{
      return "The burger is being served:-\nBun Type: "+bun+"\nPrice: "+price+"\nSauce Option: "+sauceOption+"\nSpice Level: "+spiceLevel;
    }
  }
  
  public void customizeSpiceLevel(String sp){
    boolean flag=false;
    for(int i=0; i<spice.length; i++){
      if(spice[i].equals(sp)){
        spiceLevel=sp;
        count++;
        flag=true;
        break;
      }
    }
    if(flag){
      System.out.println("Spice level set to "+spiceLevel);
    }
    else{
      System.out.println("This spice level is unavailable.");
    }
  }
}

  
        
    
      
      
      
      
      
      
      
      
      
      
      

