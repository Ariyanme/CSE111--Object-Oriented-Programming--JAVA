
                                             //Ungraded Task-01 

public class Student  extends Section{
  
  public Student(int id, String S_name, int section, String T_name){
    
    super(section, T_name);
    
    super.student_id=id;
    super.student_name=S_name;
  }
  
  public void printStudentInfo(){
    
    System.out.println("Student id: "+student_id+"\nStudent name: "+student_name);
    
    super.printInfo();
  }
  
}

