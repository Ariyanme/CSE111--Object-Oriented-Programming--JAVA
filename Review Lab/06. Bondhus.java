
                                               //Review Lab Task-06 

public class Bondhus extends SocialMedia{
  
  String sentbox [] =new String [5];
  int sent;
  
  public Bondhus(String name, String email){
    
    super(name, email);
  }
  
  public void sendMessage(String m){
    
    if(sent<5){
      sentbox[sent++]=m;
    }
    else{
      System.out.println("Sentbox is full");
    }
  }
  
  public void showSentbox(){
    System.out.println(userName+"'s Sentbox: ");
    
    if(sent<=0){
      System.out.println("No sent messages.");
    }
    else{
      for(int i=0; i<sent; i++){
        System.out.println(sentbox[i]);
      }
    }
  }
  
  public String toString(){
    
    return super.toString() + "\nMessages Sent: "+sent;
  }
  
}




