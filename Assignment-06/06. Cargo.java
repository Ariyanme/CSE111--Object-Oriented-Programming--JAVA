
                                            //Task-06

public class Cargo{
  
  static double capacity=10;
  static int count=1;
  
  int id;
  String name;
  double weight;
  boolean load;
  
  public Cargo(String n, double w){
    name=n;
    weight=w;
    id=count++;
  }
  
  public void details(){
    System.out.println("Cargo ID: "+id+", Contents: "+name+", Weight: "+weight+", Loaded: "+load);
  }
  
  public void load(){
    
    if(capacity>=weight){
      load = true;
      capacity-=weight;
      System.out.println("Cargo "+id+" loaded for transport.");
    }
    else{
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }
  
  public void unload(){
    
    System.out.println("Cargo "+id+" unloaded.");
    capacity+=weight;
    load=false;
  }
  
  public static String capacity(){              // Used String type return bcz it handles the decimal point issue better than double type return;
    return String.format("%.1f",capacity);  
  }
}







