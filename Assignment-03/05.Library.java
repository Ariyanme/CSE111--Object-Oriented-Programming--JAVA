
//Task-05

public class Library{
  int cap;
  int count;
  String list[];
  
  public void setBookCapacity(int n){
    cap=n;
    list=new String[cap];
  }
  
  public void addBook(String nm){
    if(count>=cap){
      System.out.println("Exceeds maximum capacity. You can't add more than "+cap+" books");
    }
    else{
      list[count]=nm;
      count++;
      System.out.println("Book '"+nm+"' added to the library");
    }
  }
  
  public void printDetail(){
    System.out.println("Maximum Capacity: "+cap+"\nTotal Books: "+count+"\nBook list: ");
    
    for(int i=0; i<count; i++){
      if(list[i]!=null){
        System.out.println(list[i]);
      }
    }
  }
}


