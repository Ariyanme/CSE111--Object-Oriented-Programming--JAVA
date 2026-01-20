
                                         // Task-07 

public class CSEStudent extends Student {
  
  static int total;
  static String Lab_courses[]= {"CSE110", "CSE111", "CSE220", "CSE221"};
  
  public CSEStudent(String n, int i){
    
    super(n, i);
    total++;
  }
  
  public void addLabBasedCourse(String c){
    
    boolean flag=false;
    
    for(int i=0; i<Lab_courses.length; i++){
      
      if(Lab_courses[i].equals(c)){
        flag=true;
        courses+=Lab_courses[i]+" ";
      }
    }
    
    if(!flag){
      System.out.println("It is not a lab based course!");
    }
  }
  
  public static void details(){
    
    System.out.println("Total CSE Students: "+total+"\nAvailable Lab Based Courses:");
    
    for(int i=0; i<Lab_courses.length; i++){
      System.out.print(Lab_courses[i]+" ");
    }
    System.out.println();
  }
  
}








