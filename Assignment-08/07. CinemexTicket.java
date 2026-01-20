
                                       //Task-07

public class CinemexTicket extends MovieTicket{
  
  private static int total;
  String genre;
  boolean paid;
  int id;
  
  public CinemexTicket(String movie, String time, String type, String date){
    
    super(movie, date, time, 0);
    genre=type;
    
    seat=seatTypes[0];             // When Seat Type is not passed, we'll assume it too be Regular;
    setPrice(seatPrices[0]);
    id= ++total;
    
  }
  
  public CinemexTicket(String movie, String time, String type, String date, String seat){
    
    super(movie, date, time, 0);
    genre=type;
    id= ++total;
    this.seat=seat;
    
    for(int i=0; i<seatTypes.length; i++){         //For finding the SeatPrice for the SeatType;
      if(seat.equals(seatTypes[i])){
        setPrice( seatPrices[i] );
        break;
      }
    }
  }
  
  public void calculateTicketPrice(){
    
    String input[]= showtime.split(":");
    String input1=input[0];
    int result=Integer.parseInt(input1);
    
    if(result>=18 && result<=23){
      
      setPrice( getPrice() + getPrice()*(15/100.0));        // 100.0 bcz otherwise it excludes the decimal points if we do 15/100;
    }
    System.out.println("Ticket price is calculated successfully.");
  }
  
  public String confirmPayment(){
    
    if(!paid){
      paid=true;
      
      return "Payment Successful.";
    }
    else{
      return "Ticket price is already paid!";
    }
  }
  
  
  public static int getTotalTickets(){                      //Static Method;
    return total;
  }
  
  public String toString(){
    
    System.out.println("Ticket ID: "+ getMovie()+"-"+ seat.charAt(0)+"-"+id);
    
    System.out.println(super.toString());            
    
    System.out.println("Genre: "+genre+"\nSeat Type: "+seat+"\nPrice(tk): "+getPrice());
    
    if(paid){
      return "Status: Paid";
    }
    else{
      return "Status: Not Paid";
    }
  }
  
  
}




























