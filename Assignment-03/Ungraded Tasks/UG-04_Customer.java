
// Ungraded Task-04 

public class Customer{
  String name;
  String item[]=new String[4];
  int price[]=new int[4];
  int count;
  int total;
  boolean flag=false;
  
  public void createCustomer(String nm){
    name=nm;
  }
  
  public void addItem(String i, int p){
    boolean flag2=true;
    if(count<4){
      item[count]=i;
      price[count]=p;
      count++;
      total+=p;
    }
    else{
      System.out.println("Cart is full");
      flag2=false;
    }
                                                      //flag checks if it is from the other method; 
    if(flag==false && flag2==true){                   //flag2 checks if the "cart is full", if it is full then the "added" msg doesnt print;
      System.out.println(i+" added to cart");
    }
  }
  
  
  public void addItem(String i1, int p1, String i2, int p2){
    
    flag=true;
    
    addItem(i1, p1);
    addItem(i2, p2);
    System.out.println(i1+" and "+i2+" added to cart");
    
    flag=false;
  }
  
  
  public void showCart(){
    System.out.println("Customer Name: "+name);
    
    for(int i=0; i<count; i++){
      if(item[i]!=null){
        System.out.println("Item: "+item[i]+" Price: "+price[i]);
      }
    }
  }
  
  public void calculatePrice(){
    System.out.println("Total: "+total);
  }
}




