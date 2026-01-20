
                                                         //Task-08

public class Player{
  
  static int total;
  static String list[]=new String[11];
  
  String name;
  String country;
  int jersey;
  
  public Player(String n, String c, int j){
    name=n;
    country=c;
    jersey=j;
    list[total++]=n;
  }
  
  public String player_detail(){
    
    return "Player Name: "+name+"\nJersey Number: "+jersey+"\nCountry: "+country;
    
  }
  
  
  public static void info(){
    System.out.println("Total number of players: "+total);
    
    if(total>0){
      System.out.print("Players enlisted so far: ");
      
      for(int i=0; i<total; i++){
        
        if(i<total-1){                               //used if-else for handling "," issue while printing;
          System.out.print(list[i]+", ");
        }
        else{
          System.out.print(list[i]);
        }
      }
      System.out.println();
    }
  }
}








