
//Task-08

public class Reader{
  String name="New user";
  int cap;
  String list[];
  int count;
  
  public String createReader(String nm, int i){
    name=nm;
    cap=i;
    list=new String[cap];
    return "A new reader is created!";
  }
  
  public void addBook(String book){
    if(count<cap){
      list[count]=book;
      count++;
    }
    else{
      System.out.println("No more capacity");
    }
  }
  
  public void readerInfo(){
    System.out.println("Name: "+name+"\nCapacity: "+cap+"\nBooks: ");
    
    if(count==0){
      System.out.println("No books added yet");
    }
    else{
      for(int i=0; i<count; i++){
        if(list[i]!=null){
          System.out.println("Book "+(i+1)+": "+list[i]);
        }
      }
    }
  }
}



