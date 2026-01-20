// ASS_01_ungraded_Task_03

import java.util.Scanner;
public class ASS_01_HW_ungraded_003{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N=");
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
                             // First we need to sort the array in increasing;
    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    float median=0;
    if(arr.length%2!=0){
      median=arr[arr.length/2];
    }
    else{
      median=(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
    }
    System.out.println("The Median is "+median);
  }
}
    
    
    
    
    
    
    
    
    
    