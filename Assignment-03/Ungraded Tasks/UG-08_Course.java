
//Ungraded Task-08

public class Course{
  String name;
  String code;
  String list[]=new String[4];
  int count;
  
  public void updateDetails(String nm, String c){
    name=nm;
    code=c;
  }
  
  public void addContent(String c){
    
    if(count<4){
      list[count]=c;
      count++;
      System.out.println(c+" was added.");
    }
    else{
      System.out.println("Cannot add more content");
    }
  }
  
  public void addContent(String c1, String c2){
    addContent(c1);
    addContent(c2);
  }
  
  public void printDetails(){
    System.out.println("Course details:");
    System.out.println("Course Name: "+name+"\nCourse Code: "+code+"\nCourse Syllabus:");
    
    for(int i=0; i<count; i++){
      
      if(i==count-1){
        System.out.print(list[i]+"\n");
      }
      else{
        System.out.print(list[i]+", ");
      }
    }
    if(count==0){
      System.out.println("No content yet");
    }
  }
}



