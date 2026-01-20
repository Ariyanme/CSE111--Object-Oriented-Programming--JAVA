
public class Garage{
  
  public Car cars[];
  public Bike bikes[];
  int carCap;
  int bikeCap;
  int carCount;
  int bikeCount;
  
  public Garage(int c, int b){
    System.out.println("Welcome to the Garage!");
    
    carCap=c;
    bikeCap=b;
    
    cars= new Car[carCap];
    bikes= new Bike[bikeCap];
    
    System.out.println("Car Capacity: "+carCap+"\nBike Capacity: "+bikeCap);
  }
  
  
  public void addVehicle(Vehicle v){
    
    if( v instanceof Car){
      
      Car c=(Car)v;                  //Downcasting;
      
      if(carCount< carCap){
        
        cars[carCount++]=c;
        System.out.println("A "+c.getBrand()+" CAR has been added to the Garage");
      }
      else{
        System.out.println("Can't add more Cars! Capacity: "+carCap);
      }
    }
    
    else if( v instanceof Bike){
      Bike b=(Bike)v;                //DownCasting 
      
      if(bikeCount< bikeCap){
        
        bikes[bikeCount++]=b;
        System.out.println("A "+ b.getBrand()+ " BIKE has been added to the Garage");
      }
      else{
        System.out.println("Can't add more bikes! Capacity: "+bikeCap);
      }
    }
  }
  
}



