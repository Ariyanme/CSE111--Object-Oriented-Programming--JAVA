

public class Tennis_Tournament extends Tournament{
  
  int total;
  String type;
  
  public Tennis_Tournament( String n, int t){
    super(n);
    this.total=t;
  }
  
  public String detail(){
    
    return "Tennis Tournament Name: "+super.getName()+"\nNumber of Players: "+total;
  }
  
}

