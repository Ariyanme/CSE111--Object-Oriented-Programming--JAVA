
//Ungraded Task-05

public class Calculator{
  
  public void add(int a, int b){
    System.out.println(a+b);
  }
  
  public void add(int a, int b, int c){
    System.out.println(a+b+c);
  }
  
  public void multiply(int a, int b){
    System.out.println(a*b);
  }
  
  public void multiply(int a, int b, int c){
    System.out.println(a*b*c);
  }
  
  public void multiply(String s, int a){
    String result=s;
    
    for(int i=1; i<a; i++){
      result+="-"+s;
    }
    System.out.println(result);
  }
}

