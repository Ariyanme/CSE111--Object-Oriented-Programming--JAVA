
// ASS_01_ungraded_Task_01

import java.util.Scanner;
public class ASS_01_HW_ungraded_001{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N=");
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Input array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("\nRemove Element=");
    int element=sc.nextInt();
    int arr1[]=new int[n-1];
    boolean flag=false;
    int index=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=element && index<arr.length-1){      // if index>arr.length-1; then arr1[i]=goes out of bound!
        arr1[index]=arr[i];
        index++;
      }
      if(arr[i]==element){                        // if the element is found we have to flag it;
        flag=true;
      }
    }
    if(flag){
      System.out.println("New Array:");
      for(int i=0; i<arr1.length; i++){
        System.out.print(arr1[i]+" ");
      }
    }
    else{
      System.out.println("Elements not found");
    }
  }
}    