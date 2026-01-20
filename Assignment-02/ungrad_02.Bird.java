
//Ungraded Task-02

public class Bird{ 
  String name;
  int height;
  
  public void flyUp(int n){
    height+=n;
    System.out.println(name+" has flown up "+n+" feet");
  }
  
  public void makeNoise(){
    if(name.equals("Parrot")){
      System.out.println("Squawk");
    }
    else{
      System.out.println("Squee");
    }
  }
  
  public void flyDown(int n){
    height-=n;
    if(height==0){
      System.out.println(name+" has flown down "+n+" feet and landed");
    }
    else if(height>0){
      System.out.println(name+" has flown down "+n+" feet");
    }
    else{
      System.out.println(name+" cannot fly down "+n+" feet");
      height+=n;
    }
  }
}

  