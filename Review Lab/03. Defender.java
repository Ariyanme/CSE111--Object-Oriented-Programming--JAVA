
public class Defender extends Football{
  
  int tackle;
  int intercept;
  
  public Defender(String name, int age, int stamina, int tackle, int intercept){
    
    super( name, age, stamina);
    this.tackle=tackle;
    this.intercept=intercept;
    
  }
  
  public void display(){
    
    super.display();
    System.out.println("Tackles: "+tackle+"\nInterceptions: "+intercept);
  }
  
  public void calculatePerformance(){
    double performance;
    
    performance= (double)intercept/tackle;
    
    System.out.println("Performance: "+performance);
  }
  
}