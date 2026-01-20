
                                    //Task-06 

public class Car extends Vehicle {
  
  String model;
  int doors;
  boolean ai;
  
  public Car(String brand, String model, int year, int doors, int wheels, boolean boo){
    
    super(brand, year);
    setWheels(wheels);
    this.model=model;
    this.doors=doors;
    ai=boo;
  }
  
  public String toString(){
    
    return "Car "+super.toString()+", Model: "+model+", Doors: "+doors+", AI: "+ai ;
  }
  
  
  public void startAutoPilot(){
    if(this.ai){
      System.out.println(getBrand()+":"+model+" AutoPilot Started");
    }
    else{
      System.out.println(this.getBrand()+":"+model+" has NO AutoPilot");
    }
  }
  
}





