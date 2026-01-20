//Task-01

public class BankAccount{
  int ac;
  String type="Not Set";
  
  public void setInfo(int ac, String s){
    type=s;
    this.ac=ac;
    System.out.println("Account information updated!");
  }
  
  public String printDetails(){
    String output= "Acccount No: "+this.ac+"\nType: "+this.type;
    return output;
  }
}

