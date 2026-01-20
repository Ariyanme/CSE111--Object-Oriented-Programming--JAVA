
// Previous year lab Quiz Solve;

public class GymMembership{
  String name;
  String type;
  String time;
  int duration;
  double fee;
  
  public void setGymDetails(String nm, String tp, String tm, int dur){
    name=nm;
    type=tp;
    time=tm;
    duration=dur;
  }
  
  public void printDetails(){
    System.out.println("Gym Member Name: "+ name);
    System.out.println("Membership Type: "+type);
    System.out.println("Enrollment Time: "+time);
    System.out.println("Duration: "+duration+" months");
    
    if(fee==0){
      System.out.println("Membership Fee has not been calculated yet.");
    }
    else{
      System.out.println("Membership Fee:(BDT) "+fee);
    }
  }
  
  
  public double calculateFee(){
    if(type.equals("Standard")){
      if(time.equals("Evening")){
        fee=1200;
      }
      else{
        fee=900;
      }
    }
    else{
      if(time.equals("Evening")){
        fee=2200;
      }
      else{
        fee=1900;
      }
    }
    return fee;
  }
}

    
      
         
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  