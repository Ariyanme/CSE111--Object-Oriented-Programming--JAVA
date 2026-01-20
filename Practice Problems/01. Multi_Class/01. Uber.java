

public class Uber{
  
  String number;
  String type;
  String route[]=new String [4];
  int rcounter;
  int count;
  
  public Uber(String n, String t, String r1, String r2, String r3, String r4){
    number=n;
    type=t;
    
    addRoute(r1);     
    addRoute(r2);
    addRoute(r3);
    addRoute(r4);
//    route[rcounter++]=r1;
//    route[rcounter++]=r2;
//    route[rcounter++]=r3;
  }
  
  public Uber(String n, String t, String r1){
    
    number=n;
    type=t;
    
    addRoute(r1);
    //route[rcounter++]=r1;
  }
  
  public Uber(String n, String t, String r1, String r2){
    
    number=n;
    type=t;
    
    addRoute(r1);
    addRoute(r2);
//    route[rcounter++]=r1;
//    route[rcounter++]=r2;
  }
  
  public void addRoute(String r){            //Created a method for adding routes to ARRAY;
    
    route[rcounter++]=r;
  }
  
  
  public void details(){
    System.out.print("Car number: "+number+"\nType: "+type+"\nRoutes: ");
    
    for(int i=0; i<rcounter; i++){                 
      
      if(rcounter==1){
        System.out.print(route[i]);            //If-else to to handle the "-->" issue;
      }
      else if(i==rcounter-1){
        System.out.print(route[i]);
      }
      else{
        System.out.print(route[i]+" --> ");
      }
    }
    System.out.println();
  }
  
  public void pick(User u){          
    
    boolean flag=false;
    
    for(int i=0; i<rcounter; i++){             //Checking if the route matches with passenger;
      if(route[i].equals(u.location)){
        flag=true;
      }
    }
    
    if(! u.type.equals(type)){
      System.out.println(u.name+" is looking for a different ride.");
    }
    else if(!flag){
      System.out.println(u.name+"'s destination is different from this car's route.");
    }
    else{
      System.out.println(u.name+"  has been picked up.");   
      u.board=true;                                         
      u.num=number;                 //Updating the var. in User class after Boarding in car;
    }
  }
  
  public void pick(User u1, User u2, User u3, User u4){          //Method Chaining;
    pick(u1);
    pick(u2);
    pick(u3);
    pick(u4);
  }
  
  public void pick(User u1, User u2){                            ////Method Chaining;
    pick(u1);
    pick(u2);
  }
  
  
}





