
                                               //Task-04

public class Circle{
  
  static int count;
  
  private double radius;
  private double area;
  
  public Circle(int r){
    radius=r;
    count++;
  }
  
  public void setRadius(int r){
    radius=r;
  }
  
  public double getRadius(){
    return radius;
  }
  
  public double area(){
    area= Math.PI*radius*radius;
    
    return area;
  }
}

  
  
  
  
  
  
  
  
  
  
  
  
  
