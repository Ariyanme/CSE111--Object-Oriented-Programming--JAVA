
// Ungraded Task-04

public class MobilePhone{
  int storage;
  int count;
  String list[];
  int num[];
    
  public void setContactCapacity(int n){
    storage=n;
    list=new String[storage];
    num=new int[storage];
  }
  
 
  public void addContact(String n1, int n2){
    if(count<storage){
      list[count]=n1;
      num[count]=n2;
      count++;
      System.out.println("The contact of "+n1+" is added");
    }
    else{
      System.out.println("Storage Full!!!");
    }
  }
  
  
  public void  details(){
    System.out.println("Total Contacts: "+count+"\nContact List:");
    
    for(int i=0; i<list.length; i++){
      if(list[i]!=null){
        System.out.println(list[i]+":"+num[i]);
      }
    }
  }
  
  public void makeCall(int n){
    boolean flag=false;
    for(int i=0; i<num.length; i++){
      if(num[i]==n){
        System.out.println("calling "+list[i]+". . .");
        flag=true;
        break;
      }
    }
    if(!flag){
      System.out.println("calling "+n+". . .");
    }
  }
}

    
    
    
    
    
    
      

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    