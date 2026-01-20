//Task-08

public class Employee{
  String name;
  double salary=30000;
  String designation="junior";
  
  public void newEmployee(String name){
    this.name=name;
  }
  
  public void displayInfo(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+salary+" TK");
    System.out.println("Employee Designation: "+designation);
  }
  
  public void calculateTax(){
    double tax=0;
    
    if(salary>50000){
      tax=(salary*0.3);
      System.out.println(name+" Tax Amount: "+tax+" TK");
    }
    else if(salary>30000){
      tax=(salary*0.1);
      System.out.println(name+" Tax Amount: "+tax+" TK");
    }
    else{
      System.out.println("No need to pay tax");
    }
  }
  
  public void promoteEmployee(String designation){
    this.designation=designation;
    System.out.println(name+" has been promoted to "+designation);
    if(designation.equals("senior")){
      salary+=25000;
    }
    else if(designation.equals("lead")){
      salary+=50000;
    }
    else{
      salary+=75000;
    }
    System.out.println("New Salary: "+salary+" TK");
  }
}

       
      
    
    
    
    
    
    
    
    
    
    
    
  