// ASS_01_HW_03

import java.util.Scanner;
public class ASS_01_HW_003{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String res=s1+" "+s2;
    int sum=0;
    for(int i=0; i<res.length(); i++){
      int ascii=res.charAt(i);
      if(ascii!=32){
        if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)){
          
          sum+=res.charAt(i);
        }
      }
    }
    System.out.println(res);
    System.out.println(sum);
  }
}
