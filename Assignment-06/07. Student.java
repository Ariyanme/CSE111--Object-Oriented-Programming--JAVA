
                                                 //Task-07

public class Student{
  
  static int total;
  static int cse;
  static int other;
  static int count=1;
  
  String name;
  String dept;
  double cg;
  int id;
  
  public Student(String n, double c){
    name=n;
    cg=c;
    dept="CSE";
    total++;
    cse++;
    id=count++;
  }
  
  public Student(String n, double c, String d){
    name=n;
    cg=c;
    dept=d;
    total++;
    other++;
    id=count++;
  }
  
  public void individualDetail(){
    
    System.out.println("ID: "+id+"\nName: "+name+"\nCGPA: "+cg+"\nDepartment: "+dept);
  }
  
  public static void printDetails(){
    
    System.out.println("Total Student(s): "+total+"\nCSE Student(s): "+cse+"\nOther Department Student(s): "+other);
  }
}



