// Task-5

public class Course{
  String courseName;
  String courseCode;
  int courseCredit;
  
  public void updateDetails(String name, String code, int credit){
    courseName=name;
    courseCode=code; 
    courseCredit=credit;
  }
  
  public void displayCourse(){
    System.out.println("Course Name: "+courseName);
    System.out.println("Course Code: "+courseCode);
    System.out.println("Course Credit: "+courseCredit);
  }
}
