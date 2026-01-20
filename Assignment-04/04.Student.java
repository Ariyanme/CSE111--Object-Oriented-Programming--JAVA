
//Task-04

public class Student{
  
  public int id;
  public double cg;
  public String courses[]=new String [4];
  public int count;
  
  public Student(int id){
    this.id=id;
    System.out.println("A student with ID "+id+" has been created.");
  }
  
  public Student(int id, double cg){
    this.id=id;
    this.cg=cg;
    System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
  }
  
  public void storeCG(double cg){
    this.cg=cg;
  }
  
  public void storeID(int id){
    this.id=id;
  }
  
  public void addCourse(String c){
    if(cg==0){
      System.out.println("Failed to add "+c+"\nSet CG first");
    }
    else if(count==4){
      System.out.println("Failed to add "+c+"\nMaximum "+count+" courses allowed.");
    }
    else if(cg<3 && count==3){
      System.out.println("Failed to add "+c+"\nCG is low. Can't add more than "+count+" courses.");
    }
    else{
      courses[count]=c;
      count++;
    }
  }
  
  public void addCourse(String arr[]){
    for(int i=0; i<arr.length; i++){
      addCourse(arr[i]);
    }
  }
  
  public void removeAllCourse(){
    courses=new String[4];
    count=0;
  }
  
  public void showAdvisee(){
    System.out.println("Student ID: "+id+", CGPA: "+cg);
    
    if(count>0){
      System.out.println("Added courses are:");
      
      for(int i=0; i<count; i++){
        System.out.print(courses[i]+" ");
      }
      System.out.println();
    }
    else{
      System.out.println("No courses added.");
    }
  }
}


