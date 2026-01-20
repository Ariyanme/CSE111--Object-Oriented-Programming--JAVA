

public class Manager extends Employee{
  
  double bonus;
  double salary;
  
  public Manager(String name, double base, int hour, double bonus){
    
    super(name, base, hour);
    this.bonus=bonus;
  }
  
  public void calculateSalary(){
    double bonus=0;
    
    if(getHoursWorked() >40){
      bonus= getBaseSalary() * (this.bonus/100);
      salary= getBaseSalary() + bonus;
    }
    else{
      salary= getBaseSalary();
    }
  }
  
  public void requestIncrement(int add){
    
    if( getHoursWorked()>100){
      
      setBaseSalary( getBaseSalary() + add);
      
      System.out.println("$"+add+" Increment approved.");
    }
    else if(getHoursWorked()>80){
      
      setBaseSalary( getBaseSalary() + (add/2));
      
      System.out.println("$"+(add/2)+" Increment approved.");
    }
    else{
      System.out.println("Increment denied.");
    }
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Bonus: "+bonus+" %\nFinal Salary: $"+salary);
  }
  
}



















