
                                                //Review Lab Task-04 

public class Nokia extends Mobile{
  
  double balance;
  
  public Nokia(String model, boolean status, String imei, double balance){
    
    super(model, imei, status);
    this.balance=balance;
  }
  
  public String toString(){
    
    return super.toString()+"\nBalance: "+balance+" TK" ;
  }
  
  public String dialCall(String num){
    
    String code="";
    
    for(int i=0; i<3; i++){
      code+=num.charAt(i);
    }
    
    String name= getCountryName(code);
    
    if(balance<=0){
      return "Insufficient balance! Please recharge.";
    }
    else if(!simCardStatus){
      return "No SIM card available! Please check the SIM card connectivity.";
    }
    else if(name==null){
      return "Dialing is not allowed in this region.";
    }
    else{
      return "Dialing the number "+num+" to "+name+" region.";
    }
    
  }
  
  public void rechargeSIMCard(int n){
    balance+=n;
    System.out.println("Recharge successful! Current balance "+balance+" TK.");
  }
  
}


