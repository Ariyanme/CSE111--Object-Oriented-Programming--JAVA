
                                         // Review Lab task-07 

public class Patient {
  
  String name;
  String doctor;
  String id="P0";
  
  static int totalCount;
  static int out_patient;          // ALL THE VARIABLES INSIDE A STATIC MUST BE STATIC AS WELL.
  
  public Patient (String name, String doctor){
    this.name=name;
    this.doctor=doctor;
    
    id+= ++totalCount;
    
    if( this instanceof InPatient){
      out_patient++;
    }
  }
  
  public String toString(){
    
    return "Patient ID: "+id+", Name: "+name+"\nDoctor: "+doctor;
  }
  
  public static void details(){
    System.out.println("Total patients: "+totalCount);
  }
  
  public static void details( Patient array []){
    
    System.out.println("Details of "+totalCount+" selected patients: ");
    
    for(int i=0; i<array.length; i++){
      
      System.out.println("== == == == ==");
      
      System.out.println(array[i]);
      
    }
  }
  
}

















