
                                            //Task-03

public class Book{
  
  static int total_books_sold;
  static double total_revenue;
  
  String name;
  int discount;
  double price;
  
  public Book(String n, int dis){
    name=n;
    discount=dis;
    price=150;
    
    total_books_sold++;
    
  }
  
  public void bookDetails(){
    System.out.println("Title: "+name);
    System.out.println("Price after Discount: "+calcPrice(discount)+" TK");
  }
  
  public double calcPrice(int dis){
    double discount=dis;
    
    price=price-(price*(discount/100));
    
    total_revenue+=price;
    
    return price;
  }
}
















