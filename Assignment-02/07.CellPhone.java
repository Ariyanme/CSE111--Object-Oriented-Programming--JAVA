//Task-07

public class CellPhone{
  String model="unknown";
  int count;
  String contacts[]=new String[3];
  
  public void storeContact(String cont){
    if(count<3){
      contacts[count]=cont;
      count++;
      System.out.println("Contact Stored");
    }
    else{
      System.out.println("Memory full. New contact can't be stored");
    }
  }
  
  public void printDetails(){
    System.out.println("Phone Model "+model);
    System.out.println("Contacts Stored "+count);
    if(count>0){
      System.out.println("Stored Contacts: ");
      for(int i=0; i<count; i++){
        System.out.println(contacts[i]);
      }
    }
  }
}

    