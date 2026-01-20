//Task-02;

public class Shape{
  String name;
  double area;
  
  public void setParameters(String s1, int n){        //for circle;
    name=s1;
    area=Math.PI*n*n;
  }
  
  public void setParameters(String s1, int m, int n){       //for triangle;
    name=s1;
    area=0.5*m*n;
  }
  
  public void setParameters(String s1, double m, double n){      //for rectangle;
    name=s1;
    area=m*n;
  }
  
  public String details(){
    return "Shape Name: "+name+"\nArea: "+String.format("%.2f",area);
  }
}

