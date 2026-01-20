
public class Teacher{
  
  public String name;
  public String initial;
  public Course list[];
  public int count;
  
  public Teacher(String nm, String in){
    name=nm;
    initial=in;
    list=new Course[3];
    System.out.println("A new teacher has been created");
  }
  
  public void addCourse(Course c){
    
    if(count<3){
      list[count]=c;
      count++;
    }
  }
  
  public void printDetail(){
    
    System.out.println("Name: "+name+"\nInitial: "+initial);
    if(count>0){
      System.out.println("List of courses:");
      
      for(int i=0; i<count; i++){
        System.out.println(list[i].code);
      }
    }
  }
}











