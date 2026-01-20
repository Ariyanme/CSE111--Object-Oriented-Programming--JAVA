

//Ungraded Task-01

public class Parcel{
  
  public String name;
  public int weight;
  public double fee;
  
  public Parcel(){
    
  }
  
  public Parcel(String nm){
    name=nm;
  }
  
  public Parcel(String nm, int w){
    name=nm;
    weight=w;
  }
  
  public void addWeight(int w){
    weight+=w;
    System.out.println("Updated Weight: "+weight);
  }
  
  public void calcFee(String s){
    
    if(weight==0){
      fee=0;
    }
    if(s.equals("Dhanmondi")){
      fee=(weight*20)+50;
    }
    else{
      fee=weight*20;
    }
  }
  
  public void printDetails(){
    if(name==null){
      System.out.println("Set name first");
    }
    else{
      System.out.println("Name: "+name+"\nTotal Weight: "+weight+"\nTotal Fee: "+fee);
    }
  }
}










