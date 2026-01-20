// ASS_01_HW_02

import java.util.Scanner;
public class ASS_01_HW_002{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    if(m>n){            //swapping if the frst inpt is bigger
      int temp=m;
      m=n;
      n=temp;
    }
    int p_count=0;
    for(int i=m; i<=n; i++){
      int div_count=0;
      for(int j=1; j<=i; j++){
        if(i%j==0){
          div_count++;
        }
      }
      if(div_count==2){
        p_count++;
      }
    }
    System.out.println("There are "+p_count+" prime numbers between "+m +" and "+n);
  }
}

        