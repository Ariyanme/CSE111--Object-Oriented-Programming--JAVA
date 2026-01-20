
//Task-01

public class Student{
  public String name;
  public String prog;
  
  public Student(String nm, String pg){
    name=nm;
    prog=pg;
  }
  public void updateName(String nm){
    name=nm;
  }
  
  public void updateProgram(String p){
    prog=p;
  }
  
  public String accessProgram(){
    return prog;
  }
  
}
