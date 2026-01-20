
                                               //Ungraded Task-02 

public class Section{                //Designing the Parent Class
  
  static int student_count;
  static int section_count;
  
  int student_id;
  String student_name;
  int sec_id;
  String teacher_name;
  
  
  public Section(){       // super() const. is a must to initialize the vars. of CHILD class.
    
  }
  
  
  public Section(String t){
    
    teacher_name=t;
    sec_id = ++section_count;
    
  }
  
}

  
  


