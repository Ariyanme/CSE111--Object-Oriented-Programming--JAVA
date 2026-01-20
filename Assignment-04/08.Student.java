
// Task-08

class Student {
  public String email;
  public String password;
  boolean login;
  public String name;
  public int id;
  public String dep;
  public String[] courses = new String[3];
  public int count;                           //Course Counter;
  
  public Student(String name, int id, String dep) {
    
    this.name = name;
    this.id = id;
    this.dep = dep;
    System.out.println("Student object is created.");
  }
}

