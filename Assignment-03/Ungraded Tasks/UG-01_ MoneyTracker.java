
//Ungraded Task-01

public class MoneyTracker{
  String name;
  double balance;
  double add;
  double spent;
  
  public void createTracker(String nm){
    name=nm;
    balance=1;
    
  }
  
  public void income(double a){
    balance+=a;
    add=a;
    System.out.println("Balance Updated!");
  }
  
  public String info(){
    
    return "Name: "+name+"\nCurrent Balance: "+balance;
  }
  
  public void expense(double a){
    balance-=a;
    
    if(balance==0){
      System.out.println("You're broke!");
    }
    else if(balance<0){
      balance+=a;
      System.out.println("Not enough balance.");
    }
    else{
      System.out.println("Balance Updated!");    //Catch: the last spent money is stored only when the balance updates; 
      spent=a;
    }
  }
  
  public void showHistory(){
    System.out.println("Last added: "+add);
    System.out.println("Last spent: "+spent);
  }
}






