
public class BracuBus{
  
  public String route;
  public int pcount;
  public int max=2;
  public String passenger[]=new String [max];
  
  public BracuBus(String r){
    route=r;
  }
  
  public BracuBus(String r, int m){
    route=r;
    max=m;
    passenger=new String [max];
  }
  
  public void board(){
    System.out.println("No passengers");
  }
  
  public void board(BracuStudent obj){
    
    if(pcount<max){
      if(obj.pass){
        if(obj.location.equals(route)){
          System.out.println(obj.name+" boarded the bus.");
          passenger[pcount]=obj.name;
          pcount++;
        }
        else{
          System.out.println("You got on the wrong bus!");
        }
      }
      else{
        System.out.println("You don't have a bus pass!");
      }
    }
    else{
      System.out.println("Bus is full!");
    }
  }
  
  public void board(BracuStudent ob1, BracuStudent ob2){
    
    board(ob1);
    board(ob2);
  }
  
  public void showDetails(){
    System.out.println("Bus Route: "+route+"\nPassenger Count: "+pcount+"(Max: "+max+")"+"\nPassengers on Board: ");
    
    for(int i=0; i<pcount; i++){
      System.out.print(passenger[i]+" ");
    }
    System.out.println();
  }
}







