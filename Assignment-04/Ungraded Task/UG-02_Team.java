
//Ungraded Task-02

public class Team{
  
  public String team;
  public Player list[]=new Player[2];
  public int count;
  
  public Team(){
  }
  
  public Team(String s){
    team=s;
  }
  
  public void updateName(String s){
    team=s;
  }
  
  public void addPlayer(Player obj){
    list[count]=obj;
    count++;
  }
  
  public void printDetail(){
    System.out.println("Team: "+team+"\nList of Players:");
    
    for(int i=0; i<count; i++){
      System.out.println("Name: "+list[i].name+"\nAge: "+list[i].age+", Total Matches: "+list[i].matches);
    }
  }
}













