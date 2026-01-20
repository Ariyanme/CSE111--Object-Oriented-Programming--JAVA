
public class User{
  
  String name;
  String location;
  String type;
  boolean board;         //This 02 vars. will be updated in Uber class after the pass. Boards;
  String num;
  
  public User(String n, String l, String t){
    name=n;
    location=l;
    type=t;
  }
  
  public User(String n, String l){
    name=n;
    location=l;
    type="Single";
  }
  
  public void status(){
    
    if(!board){
      System.out.println("Status: "+name+" is looking for a "+type+" ride!");
    }
    else{
      System.out.println("Status: "+name+" boarded in car "+num+"!");
    }
  }
  
}



















