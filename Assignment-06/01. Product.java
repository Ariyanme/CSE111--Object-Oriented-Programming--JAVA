

//Task-01

public class Product{
  
  private String name;
  private double price;
  private int quantity;
  private boolean flag;
  
  public Product(){
    name="Unknown";
    price=0;
  }
  
  public Product(String n, double p){
    name=n;
    price=p;
  }
  
  public void setQuantity(int n){
    quantity=n;
  }
  
  public int getQuantity(){
    return quantity;
  }
  
  public void setName(String n){
    name=n;
  }
  
  public String getName(){
    return name;
  }
  
  public void setPrice(double p){
    price=p;
  }
  
  public double getPrice(){
    return price;
  }
  
  
  public void displayInfo(){
    displayInfo(false);
  }
  
  public void displayInfo(boolean f){
    flag=f;
    
    if(!flag){
      System.out.println("Product Name: Unknown"+"\nPrice: $0.0");
    }
    else{
      System.out.println("Product Name: "+name+"\nPrice: $"+price+"\nQuantity: "+quantity);
    }
  }
}

