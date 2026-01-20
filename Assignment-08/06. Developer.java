
                                         //Task-07

public class Developer extends Employee{
  
  String language;
  double salary;
  
  public Developer(String name, double base, int hour, String lang){
    
    super(name, base, hour);
    language=lang;
  }
  
  public void calculateSalary(){
    
    if(language.equals("Java")){
      
      salary= super.getBaseSalary() + 700;
    }
    else{
      salary=super.getBaseSalary();
    }
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: "+language+"\nFinal Salary: $"+salary);
  }
  
}


















