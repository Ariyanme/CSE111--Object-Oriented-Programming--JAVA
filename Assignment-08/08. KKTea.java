
                                                  //Task-08

public class KKTea extends Tea{
  
  int bags;
  int weight;
  static int total;
  static int regularCount;
  static int flavourCount;
  
  public KKTea(int p, int b){
    
    super("Regular", p);
    bags=b;
    weight=2*bags;
  }
  
  public KKTea(String n, int p, int b){
    
    super(n,p);
    bags=b;
    weight=2*bags;
  }
  
  public void productDetail(){
    
    System.out.println("Name: KK "+name+" Tea, Price: "+price+"\nStatus: "+status+"\nWeight: "+weight+", Tea Bags: "+bags);
    
  }
  
  public static void totalSales(){
    
    if(flavourCount==0){
      System.out.println("Total Sales: "+total+"\nKK Regular Tea: "+regularCount);
    }
    else{
      System.out.println("Total Sales: "+total+"\nKK Regular Tea: "+regularCount+"\nKK Flavoured Tea: "+flavourCount);
    }
  }
  
  public static void updateSoldStatusRegular(KKTea tea){
    total++;
    regularCount++;
    tea.status=true;            // tea.status bcz Status is an instance variable of Tea Class, 
  }                             // and we can't access a non-static var. from a static method;
  
}




