
//Task-06

public class TaxiLagbe{
  String num;
  String area;
  int pcount;
  String list[]=new String[4];
  int fare;
  
  public void storeInfo(String num, String area){
    this.num=num;
    this.area=area;
  }
  
  public void addPassenger(String nm, int fare){
    
    if(pcount<4){                                  //Ekhane <= dile list[] out of bounds hoye jay; watchout nextTime *_* 
      this.fare+=fare;
      list[pcount]=nm;                //Alternative way: list[4] not possible;
      pcount++;
      System.out.println("Dear "+nm+"! Welcome to TaxiLagbe");
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
  
  public void addPassenger(String nm1, int f1, String nm2, int f2){
    addPassenger(nm1, f1);
    addPassenger(nm2, f2);
  }
  
  public void printDetails(){
    String output="Taxi number: "+num+"\nThis taxi can cover "+area+" area"+"\nTotal Passenger: "+pcount+"\nPassenger Lists: ";
    System.out.println(output);
    
    for(int i=0; i<pcount; i++){
      if(list[i]!=null){
        System.out.print(list[i]+" ");
      }
    }
    System.out.println("\nTotal collected fare: "+fare+" Taka");
  }
}




