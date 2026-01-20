
//Task-03

public class Shape2D{
  
  public String name="Square";
  public int length=5;
  public double area;
  
  public Shape2D(){
    area=length*length;
    System.out.println("A "+name+" has been created with length: "+length);
  }
  
  public Shape2D(int a, int b){
    name="Rectangle";
    area=a*b;
    System.out.println("A "+name+" has been created with length: "+a+" and breadth: "+b);
  }
  
  public Shape2D(int a, int b, String s){
    name=s;
    area=0.5*a*b;
    System.out.println("A "+name+" has been created with height: "+a+" and base: "+b);
  }
  
  public Shape2D(int a, int b, int c){
    name="Triangle";
    double s=(a+b+c)/2;
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("A "+name+" has been created with the following sides: "+a+", "+b+", "+c);
  }
  
  public void area(){
    System.out.println("The area of the "+name+" is: "+String.format("%.2f",area));
  }
}




