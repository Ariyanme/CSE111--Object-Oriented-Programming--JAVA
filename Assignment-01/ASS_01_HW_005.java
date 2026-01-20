// ASS_01_HW_05

import java.util.Scanner;
public class ASS_01_HW_005{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    int p1=0, p2=arr.length-1;
    for(int i=0; i<arr.length/2; i++){   //Traversing the loop half the size of arr. does the job for both even & odd
      if(p1!=p2){
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
        p1++;
        p2--;
      }
    }
    System.out.println("Reversed Array:");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}

    
      