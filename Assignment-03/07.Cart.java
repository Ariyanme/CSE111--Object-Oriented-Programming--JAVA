
//Task-07

public class Cart{
  int num;
  int count;
  String items[]=new String[3];
  double prices[]=new double[3];
  double total;
  double dis;
  
  public void create_cart(int n){
    num=n;
  }
  
  public void addItem(String i, double p){
    if(count<3){
      items[count]=i;
      prices[count]=p;
      count++;
      total+=p;
      System.out.println(i+" added to cart "+num);
      System.out.println("You have "+count+" item(s) in your cart now.");
    }
    else{
      System.out.println("You already have "+count+" items on your cart");
    }
  }
  
  public void addItem(double p, String i){
    addItem(i,p);
  }
  
  public void giveDiscount(int n){
    dis=n;
    total=total-(total*(dis/100));
  }
  
  public void cartDetails(){
    System.out.println("Your cart(c"+num+") :");
    
    for(int i=0; i<count; i++){
      if(items[i]!=null){
        System.out.println(items[i]+" - "+prices[i]);
      }
    }
    System.out.println("Discount Applied: "+dis+"%");
    System.out.println("Total price: "+total);
  }
}







