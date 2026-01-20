
//Task-05

public class Triangle{
  
  public int peri;
  public int a, b, c;
  
  public Triangle(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
    peri=a+b+c;
  }
  
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: "+a+", "+b+", "+c);
    
    System.out.println("Perimeter: "+peri);
  }
  
  public String printTriangleType(){
    String result="";
    
    if(a==b && b==c && c==a){
      result= "an Equilateral";
    }
    else if(a==b || b==c || c==a){
      result= "an Isosceles";
    }
    else{
      result="a Scalene";
    }
    return "This is "+result+" Triangle";
  }
  
  public void compareTrinagles(Triangle obj){
    if(this==obj){
      System.out.println("These two triangle objects have the same address.");
    }
    else{
      if(this.a==obj.a && this.b==obj.b && this.c==obj.c){
        System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
      else if(this.peri==obj.peri){
        System.out.println("Only the perimeter of both triangles is equal.");
      }
      else{
        System.out.println("Addresses, length of the sides and perimeter all are different.");
      }
    }
  }
}








