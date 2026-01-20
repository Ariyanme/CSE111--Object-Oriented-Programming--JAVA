// ASS_01_HW_06

import java.util.Scanner;
public class ASS_01_HW_006{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N=");
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
     
    for(int i=0; i<arr.length; i++){
      int count=0;
      boolean flag=true;
      for(int j=0; j<arr.length; j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
      for(int k=0; k<i; k++){   // I used this loop & flag for avoiding printing the same arr[i] again
        if(arr[i]==arr[k]){
          flag=false;
          break;
        }
      }
      if(flag){
        System.out.println(arr[i]+" - "+count+" times");
      }
    }
  }
}