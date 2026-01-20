
                                //Task-03 

public class CSEStudent extends Student{
  
  String msg;
  
  public CSEStudent(){
    this.msg="I want to transfer to CSE";
  }
  
  public String shout(){         //we've to override bcz variables are scopeBased
    return msg;                  //Otherwise msg var. from Parent class Student will be printed;
  }
}
