
                                           //Task-08 

public class Player extends SportsPerson{
  
  int goal;
  int match;
  double ratio;
  
  public Player(String Team, String Name, String Role, int goal, int match){
    
    super(Team, Name, Role);
    this.goal=goal;
    this.match=match;
    
    super.earningPerMatch=(this.goal*1000)+(this.match*10);
    
  }
  
  public void calculateRatio(){
    
    ratio=(double)goal/match;
    
  }
  
  public void printDetails(){
    
    System.out.println( super.getNameTeam() +"\nTeam Role: "+role+"\nTotal Goal: "+goal+", Total Played: "+match);
    
    System.out.printf("Goal Ratio: %.2f\n", ratio);
    
    System.out.println("Match Earning: "+(int)earningPerMatch+"K");       // TypeCasted to omit the decimal points..
  }
  
}

















