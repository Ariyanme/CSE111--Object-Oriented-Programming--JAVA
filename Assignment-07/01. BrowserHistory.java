
                                                  //Task-01 

public class BrowserHistory{
  
  int count;
  String history[];
  int capacity;
  
  public BrowserHistory(int n){
    
    capacity=n;
    history= new String [capacity];
  }
  
  public void visitWeb(String n){
    
    if(count<capacity){
      history[count++]=n;
      System.out.println("Visited: "+n);
    }
    else{
      System.out.println("History is full. Cannot visit "+n+" web page.");
    }
  }
  
  public void currentWeb(){
    
    if(count==0){
      System.out.println("You have not visited any website yet!");
    }
    else{
      System.out.println("Current web page: "+ history[count-1]);
    }
  }
  
  public void back(){
    count-=1;
  }
  
  public void showHistory(){
    
    if(count==0){
      System.out.println("No web pages visited yet.");
    }
    else{
      System.out.println("Browser History:");
      
      for(int i=0; i<count; i++){
        System.out.println(history[i]);
      }
    }
  }
  
}







