
public class Usis {
  public int total;                         //Total advisee counter;
  public Student list[] = new Student[5];
  
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  
  
  public void login(Student obj) {
    if (obj.email == null || obj.password == null) {
      System.out.println("Email and password need to be set.");
      //obj.login = false;
    } 
    else{
      System.out.println("Login successful.");
      obj.login = true;
    }
  }
  
  public void advising(Student obj) {
    if (!obj.login) {
      System.out.println("Please login to advise courses!");
    } 
    else if (obj.count == 0) {
      System.out.println("You haven't selected any courses.");
    }
  }
  
  public void advising(Student s, String c1, String c2, String c3, String c4) {
    System.out.println("You need special approval to take more than 3 courses.");
  }
  
  public void advising(Student s, String c1, String c2, String c3) {
    
    list[total++]=s;
    s.courses[s.count++]=c1;
    s.courses[s.count++]=c2;
    s.courses[s.count++]=c3;
    System.out.println("Advising successful!");
  }
  
  public void allAdviseeInfo() {
    System.out.println("Total advisee: " + total);
    
    for(int i=0; i<total; i++){
      
      System.out.println("Name: "+list[i].name+" ID: "+list[i].id +"\nDepartment: "+list[i].dep +"\nAdvised Courses: ");
      
      for(int j=0; j<list[i].count; j++){
        System.out.print(list[i].courses[j] +" ");
      }
      System.out.println("\n==============");
    }
  }
}










