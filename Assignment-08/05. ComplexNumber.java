
                                    //Task-05  

public class ComplexNumber extends RealNumber{
  
  double imaginary;
  
  public ComplexNumber(){
    this(1,1);
  }
  
  public ComplexNumber( double r, double i){
    
    super(r);
    imaginary=i;
  }
  
  public String toString(){
    
    return super.toString() +"\nImaginaryPart: "+imaginary;
  }
  
}






  
  
  
  
  
  
  
  
  
  
  
  
  
  