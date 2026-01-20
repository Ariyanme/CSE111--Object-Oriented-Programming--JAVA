
                                     //Task=03

public class Circle extends Shape{
  
  int radius;
  double area;
  
  public Circle(){
    super();
  }
  
  public void area(){
    area=Math.PI*radius*radius;
    System.out.print("Area of "+color+" "+name+": ");
    System.out.printf("%.2f\n", area);
  }
}
