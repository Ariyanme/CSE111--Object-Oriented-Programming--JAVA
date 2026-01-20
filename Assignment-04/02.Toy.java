
//Task-02

public class Toy{
  
  public String name;
  public int price;
  
  public Toy(String nm, int a){
    name=nm;
    price=a;
    System.out.println("A new toy has been made!");
  }
  
  public void updatePrice(int a){
    price=a;
  }
  
  public void showPrice(){
    System.out.println("Price: "+price+" Taka");
  }
  
  public void updateName(String nm){
    System.out.println("Changing old name: "+name);
    name=nm;
    System.out.println("new name: "+name);
  }
}






