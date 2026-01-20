
                                               //UnGraded Task-02 

public class Travel{
  
  private static int count;
  
  private String source;
  private String destination;
  private int time;
  
  public Travel(String s, String d){
    source=s;
    destination=d;
    time=1;
    count++;
  }
  
  public void setTime(int t){
    time=t;
  }
  
  public void setSource(String s){
    source=s;
  }
  
  public void setDestination(String d){
    destination=d;
  }
  
  public String displayTravelInfo(){
    
    return "Source: "+source+"\nDestination: "+destination+"\nFlight Time: "+time+":00" ;
  }
  
  public static int getCount(){
    return count;
  }
}





