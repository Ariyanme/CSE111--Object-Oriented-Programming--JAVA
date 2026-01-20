
public class Bike extends Vehicle{
  
  String model;
  boolean sidecar;
  
  public Bike(String brand, String model, int year, int wheels, boolean boo){
    
    super(brand, year);
    setWheels(wheels);
    this.model=model;
    sidecar=boo;
  }
  
  public String toString(){
    
    return "Bike "+super.toString()+ ", Model: "+model+", SideCar: "+sidecar ;
  }
  
  public void doAWheelie(){
    
    if( !sidecar ){
      System.out.println( getBrand()+ ":"+model+" is doing Wheelie!!");
    }
    else{
      System.out.println( "Wheelie Failed. "+getBrand()+ ":"+model+" has SideCar");
    }
  }
  
}



