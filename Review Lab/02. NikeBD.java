
                                            //Review Lab task-02 


public class NikeBD{
  
  String location;
  static int total;
  
  static String product[]= {"Jordan", "Cortez", "Kobe"};  //STATIC BCZ IT REMAINS SAME ALL THE TIME;
  
  int stock []= {0, 0, 0};                             //INSTANCE;
  
  static int Tstock[] ={0,0,0};                        //STATIC 
  
  static int Tsold;
  int sold;
  
  public NikeBD(String s){
    
    location=s;
    total++;
  }
  
  public void restockProducts(String s, int n){
    
    for(int i=0; i<product.length; i++){
      if(s.equals(product[i])){
        
        stock[i]+=n;
        Tstock[i]+=n;
      }
    }
  }
  
  public void restockProducts( String p[], int q[]){
    
    for(int i=0; i<product.length; i++){
      
      restockProducts(p[i], q[i]);
    }
  }
  
  public static void status(){
    
    System.out.print("Nike Bangladesh Status:"+"\nBranches Opened: "+total+"\nCurrently Stocked: ");
    
    for(int i=0; i<product.length; i++){
      
      System.out.print( product[i]+": "+Tstock[i]+", ");
    }
    System.out.println("\nSold: "+Tsold);
  }
  
  public void details(){
    
    System.out.print("Nike "+location+" outlet: "+"\nProducts Currently Stocked: ");
    
    for(int i=0; i<product.length; i++){
      
      System.out.print( product[i]+": "+stock[i]+", ");
    }
    System.out.println("\nSold: "+sold);
  }
  
  public void productSold(String s1, int n1, String s2, int n2){
    
    productSold(s1, n1);
    productSold(s2, n2);
  }
  
  public void productSold(String s, int n){
    
    for(int i=0; i<product.length; i++){
      if(s.equals(product[i])){
        
        stock[i]-=n;
        Tstock[i]-=n;
        Tsold+=n;
        sold+=n;
      }
    }
  }
  
}




