
public class Desktop{
  
  static int userCount;
  static int storage=512;
  static Game games[]= new Game[3];
  static int gamecount;
  
  String name;
  
  
  public Desktop(String n){
    name=n;
    userCount++;
    System.out.println(name+" logged in!");
  }
  
  
  
  public void installGame(Game g){
    
    if(gamecount>=3){
      System.out.println("Cannot install more than 3 games!");
    }
    else if(storage< g.getSize()){
      System.out.println("Not enough storage!");
    }
    else{
      System.out.println(g.getName()+" installed successfully!");
      games[gamecount++]=g;
      storage-=g.getSize();
      g.setUser(name);
    }
  }
  
  public static void displayInfo(){
    System.out.println("Desktop Info: ");
    System.out.println("Storage: "+storage+" GB");
    System.out.println("Games installed: ");
    
    if(gamecount>0){
      
      int index=1;
      for(int i=0; i<gamecount; i++){
        System.out.println(index++ +". "+ games[i].getName()+" ("+games[i].getSize()+")-installed by: "+games[i].getUser());
      }
    }
    else{
      System.out.println("No games installed!");
    }
  }
}


















