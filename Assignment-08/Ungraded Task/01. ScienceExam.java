
                                            //Ungraded Task-01

public class ScienceExam extends Exam{
  
  int partCount=2;
  
  String parts[]={"Maths","English",null, null,null};
  
  public ScienceExam(int mark, int time, String s1, String s2){
    
    super(mark);
    this.time=time;
    parts[partCount++]=s1;
    parts[partCount++]=s2;
  }
  
  public ScienceExam(int mark, int time, String s1, String s2, String s3){
    
    super(mark);
    this.time=time;
    parts[partCount++]=s1;
    parts[partCount++]=s2;
    parts[partCount++]=s3;
  }
  
  
  public String examSyllabus(){
    String s="";
    
    for(int i=0; i<partCount; i++){
      
      if(i!=partCount-1){
        s+=parts[i]+", ";
      }
      else{
        s+=parts[i];
      }
    }
    return s;
  }
  
  public String examParts(){
    
    String s="";
    int a=1;
    
    for(int i=0; i<partCount; i++){
      
      s+="Part "+(a++)+" - "+parts[i]+"\n";
    }
    return s;
  }
  
  
  public String toString(){
    
    String s;
    
    s="Marks: "+marks+" Time: "+time+" minutes Number of Parts: "+partCount;
    
    return s;
  }
  
}










