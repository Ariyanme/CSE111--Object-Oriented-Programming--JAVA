// ASS_01_HW_04

import java.util.Scanner;
public class ASS_01_HW_004{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String res="";
    for(int i=0; i<s1.length(); i++){
      if(s1.charAt(i)==97){
        res+='z';
      }
      else{
        res+=(char)(s1.charAt(i)-1);
      }
    }
    System.out.println(res);
  }
}