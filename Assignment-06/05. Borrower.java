
                                                   //Task-05

public class Borrower{
  
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali","Durgesh Nandini", "Anandmath"};
  
  String name;
  String cart[]=new String [3];
  int count;
  
  
  public static void bookStatus(){
    System.out.println("Available Books: ");
    
    for(int i=0; i<book_count.length; i++){
      System.out.println(book_name[i] + ": "+ book_count[i]);
    }
  }
  
  public Borrower(String n){
    name=n;
  }
  
  public void borrowBook(String b){
    boolean flag=false;
    
    for(int i=0; i<book_name.length; i++){
      
      if(book_name[i].equals(b) && book_count[i]>0){                 // or, && remainingBooks(b)>0
        flag=true;
        book_count[i]--;
      }
    }
    
    if(flag){
      cart[count++]=b;
    }
    else{
      System.out.println("This book is not available.");
    }
  }
  
  public void borrowerDetails(){
    System.out.println("Name: "+name+"\nBooks Borrowed:");
    
    for(int i=0; i<count; i++){
      System.out.println(cart[i]);
    }
  }
  
  
  public static int remainingBooks(String b){
    int remain=0;
    
    for(int i=0; i<book_name.length; i++){
      
      if(book_name[i].equals(b)){
        
        remain= book_count[i];
        break;
      }
    }
    return remain;
  }
}
























