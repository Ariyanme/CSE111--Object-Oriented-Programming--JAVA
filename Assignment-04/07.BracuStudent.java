
//Task-07

public class BracuStudent{
  
  public String name;
  public String location;
  public boolean pass;
  
  public BracuStudent(String nm, String l){
    name=nm;
    location=l;
  }
  
  public void updateHome(String l){
    location=l;
  }
  
  public void getPass(){
    pass=true;
  }
  
  public void showDetails(){
    System.out.println("Student Name: "+name+"\nLives in "+location+"\nHave Bus Pass? "+pass);
  }
}












