
public class InPatient extends Patient{
  
  String department;
  static int inPatient_Count;
  
  public InPatient(String name, String doc, String dep){
    
    super(name, doc);
    department=dep;
    
    inPatient_Count++;
    
    System.out.println("New patient admitted in "+department);
  }
  
  public String toString(){
    
    return super.toString() + "\nDepartment: "+department;
    
  }
  
  public static void details(){
    System.out.println("Total patients: "+totalCount+".\nAdmitted In-Patients: "+inPatient_Count+".\nOut-Patients: "+out_patient+"." );
  }
  
}






