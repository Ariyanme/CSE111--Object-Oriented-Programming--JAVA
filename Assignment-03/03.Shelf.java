
//Task-03

public class Shelf{
  int capacity;
  int count;
  
  public void addBooks(int n){
    count+=n;
    
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
      count-=n;
    }
    else if(count>capacity){
      System.out.println("Exceeds capacity");
      count-=n;
    }
    else{
      System.out.println(n+" books added to shelf.");
    }
  }
  
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity+"\nNumber of books: "+count);
  }
}

      
      
      
      
      
      
      
      
      
      