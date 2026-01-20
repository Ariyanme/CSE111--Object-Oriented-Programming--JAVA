// ASS_01_HW_01

import java.util.Scanner;
public class ASS_01_HW_001{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int POcount=0;
    int sum=0, min=10000000, max=-99999; 
    double avg=0;
    for(int i=1; i<=10; i++){
      int num=sc.nextInt();
      if(num%2!=0 && num>0){
        POcount++;
        sum+=num;
        if(num<min){
          min=num;
        }
        if(num>max){
          max=num;
        }
      }
    }
    avg=(double)sum/POcount;
    if(POcount>0){
      System.out.println("Sum:"+sum);
      System.out.println("Minimum:"+min);
      System.out.println("Maximu:"+max);
      System.out.println("Average:"+avg);
    }
    else{
      System.out.println("No positive Odd numbers found");
    }
  }
}