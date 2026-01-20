
public class SignatureCard extends CreditCard{
  
  int companion;
  
  public SignatureCard (String name, String num){
    
    super(name, num, 200);
    companion=5;
  }
  
  public void spendCash(int a){
    
    System.out.println("Previous Reward Points: "+rewardPoints);
    rewardPoints+=(a/100)*4;
    System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);
  }
  
  
  public void cardDetails(){
    
    super.cardDetails();
    System.out.println("Possible Number of Companions for Lounge: "+companion);
  }
  
}




