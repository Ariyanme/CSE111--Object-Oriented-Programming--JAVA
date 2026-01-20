
//Task-04

public class Student{
  String name="Not Set";
  String dept="CSE";
  double cg;
  int credit=9;
  String status="Not Set";
  
  public void updateDetails(String nm, double cg, int cr){
    name=nm; 
    this.cg=cg;
    credit=cr;
  }
  
  public void updateDetails(String nm, double cg){
    name=nm;
    this.cg=cg;
  }
  
  public void updateDetails(String nm, double cg, int cr, String dept){
    name=nm;
    this.cg=cg;
    credit=cr;
    this.dept=dept;
  }
  public void checkScholarshipEligibility(){
    if(cg>=3.5 && credit>10){
      if(cg>=3.5 && cg<3.7){
        status="Need based scholarship";
      }
      else{
        status="Merit based scholarship";
      }
      System.out.println(name+" is eligible for "+status);
    }
    else{
      status="No Scholarship";
      System.out.println(name+" is not eligible for Scholarship");
    }
  }
  
  public void showDetails(){
    String output="Name: "+name+"\nDepartment: "+dept+"\nCGPA: "+cg+"\nCredits: "+credit+"\nScholarship Status: "+status;
    System.out.println(output);
  }
}



