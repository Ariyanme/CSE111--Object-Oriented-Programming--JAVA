
                                       //Task-04 

public class PlatinumCard extends CreditCard {
  
  public PlatinumCard (String name, String num){
    
    super(name, num, 100);
  }
  
  public void spendCash(int a){
    
    System.out.println("Previous Reward Points: "+rewardPoints);
    rewardPoints+=(a/100)*2;
    System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);
  }
  
}












