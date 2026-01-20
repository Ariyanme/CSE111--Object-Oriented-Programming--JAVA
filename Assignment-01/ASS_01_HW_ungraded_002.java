// ASS_01_ungraded_Task_02

import java.util.Scanner;
public class ASS_01_HW_ungraded_002{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    int min=arr[0], max=arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i]<min){
        min=arr[i];
      }
      if(arr[i]>max){
        max=arr[i];
      }
    }
    for(int i=0; i<arr.length; i++){
      if(arr[i]==max){
        System.out.println("The largest number "+max+" was found at location "+i);
      }
      if(arr[i]==min){
        System.out.println("The smallest number "+min+" was found at location "+i);
      }
    }
  }
}
