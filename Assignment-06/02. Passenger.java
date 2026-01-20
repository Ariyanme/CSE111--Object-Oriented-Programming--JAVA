
                                 //Task-02

public class Passenger{
  
  static int no_of_passenger;         //Since not mentioned in ques.  
  static double total_fare;           // I've set all the attributes in default
  
  String name;
  double distance;
  double baggage;
  double fare;
  
  public Passenger(String n, double d){
    name=n;
    distance=d;
    no_of_passenger++;
  }
  
  public void storeBaggageWeight(double b){
    baggage=b;
  }
  
  public double calcFare(double dis, double bag){         //Extra method created;
    fare=(distance*20)+(baggage*10);
    total_fare+=fare;
    
    return fare;
  }
  
  public void passengerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Fare: "+calcFare(distance, baggage) +" TK");
  }
}













