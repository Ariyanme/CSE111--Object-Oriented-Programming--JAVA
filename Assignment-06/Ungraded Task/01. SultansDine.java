
                                                //UnGraded Task-01 

public class SultansDine{
  
  static int totalBranch; 
  static int totalSell;
  static SultansDine list[]= new SultansDine [3];
  
  String name;
  int sell;
  int quantity;
  
  public SultansDine(String n){
    name=n;
    list[totalBranch++]=this;
  }
  
  public void sellQuantity(int q){
    quantity=q;
    
    if(quantity<10){
      sell=quantity*300;
    }
    else if(quantity<20){
      sell=quantity*350;
    }
    else{
      sell=quantity*400;
    }
    
    totalSell+=sell;
  }
  
  public void branchInformation(){
    
    System.out.println("Branch Name: "+name+"\nBranch Sell: "+sell+" Taka");
  }
  
  public static void details(){
    System.out.println("Total Number of branch(s): "+totalBranch+"\nTotal Sell: "+totalSell+" Taka");
    
    for(int i=0; i<totalBranch; i++){
      System.out.println("Branch Name: "+list[i].name+", Branch Sell: "+list[i].sell+" Taka");
      
      double percentage=((double)list[i].sell/totalSell)*100.0;     //We've to calculate this here in static method bcz in Instance it doesn't update;          
      
      System.out.printf("Branch consists of total sell's %.2f\n", percentage);
    }
  }
}




