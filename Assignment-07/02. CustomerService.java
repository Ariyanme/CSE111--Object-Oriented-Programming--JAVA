
                                              //Task-02 


public class CustomerService{
  
  int capacity;                             
  int count;
  String customer[]; 
 
  public CustomerService(int n){
    capacity=n;
    customer=new String [capacity];
  }
  
  public void serveCustomer(){
    
    if(count==0){
      System.out.println("No customers to serve");
    }
    else{
      System.out.println("Serving "+ customer[0]);
      
      count--;
      
      for(int i=0; i<count; i++){         // used this loop for updating the queue;
        
        customer[i]=customer[i+1];
      }
      
      customer[count]=null;          //Emtying the last index since it is redundant; 
    }
  }
  
  public void addCustomer(String n){
    
    if(count<capacity){
      customer[count++]=n;
      
      System.out.println("Added: "+n);
    }
    else{
      System.out.println("Queue is full. Cannot add "+n);
    }
  }
  
}
















