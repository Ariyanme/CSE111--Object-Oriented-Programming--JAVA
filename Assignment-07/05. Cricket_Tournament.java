
                                             // Task-05 

public class Cricket_Tournament extends Tournament{
  
  int teams;
  String type="No type";
  
  public Cricket_Tournament(){
    super();
  }
  
  public Cricket_Tournament(String n, int a, String t){
    super(n);
    teams=a;
    type=t;
  }
  
  public String detail(){
    
    return "Cricket Tournament Name: "+super.getName()+"\nNumber of Teams: "+teams+"\nType: "+type;
  }
  
}


