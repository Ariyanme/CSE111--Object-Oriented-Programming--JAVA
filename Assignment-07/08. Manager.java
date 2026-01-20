
public class Manager extends SportsPerson{
  
  int win;
  
  public Manager(String Team, String Name, String Role, int win){
    
    super(Team, Name, Role);
    this.win=win;
    
    super.earningPerMatch= win*1000;
  }
  
  public void printDetails(){
    
    System.out.println( super.getNameTeam() +"\nTeam Role: "+role+"\nTotal Win: "+win);
    
    System.out.printf("Match Earning: %.0fK\n", earningPerMatch);        //%.0f basically omits the decimal point.....
  }
  
}
