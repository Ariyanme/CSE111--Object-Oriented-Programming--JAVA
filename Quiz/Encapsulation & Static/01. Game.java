
// Theory Quiz-03  Encapsulation & Static

public class Game{
  
  private String name;
  private int size;
  private String user;
  
  public Game(String n, int s){
    name=n;
    size=s;
  }
  
  public int getSize(){
    return size;
  }
  
  public String getName(){
    return name;
  }
  
  public void setUser(String n){
    user=n;
  }
  
  public String getUser(){
    return user;
  }
}

