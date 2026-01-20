
                                               //Review Lab Task-03

public class Striker extends Football{
  
  int goal;
  int shot;
  
  public Striker(String name, int age, int stamina, int goal, int shot){
    
    super( name, age, stamina);
    this.goal=goal;
    this.shot=shot;
    
  }
  
  public void display(){
    
    super.display();
    System.out.println("Goals: "+goal+"\nShots on target: "+shot);
  }
  
  public void calculatePerformance(){
    double performance;
    
    performance= (double)goal/shot;
    
    System.out.println("Performance: "+performance);
  }
  
}

