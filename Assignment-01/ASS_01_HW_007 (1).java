// ASS_01_HW_07


import java.util.Arrays;
import java.util.Scanner;
public class ASS_01_HW_007{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N=");
    int n=sc.nextInt();
    double arr[]= new double[n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextDouble();
    }
    int count=0;
    for(int i=0; i<arr.length-1; i++){     //ran this loop for counting duplicate elmnts.
      if(arr[i]==arr[i+1]){
        count++;
      }
    }
    for(int i=1; i<arr.length; i++){
      if(i>1){
        if(arr[i]==arr[i-1] || (arr[i]==arr[i-1] && arr[i]==arr[i-2])){
          arr[i]=0;
        }
      }
      else{
        if(arr[i]==arr[i-1]){
          arr[i]=0;
        }
      }
    }
    double arr1[]=new double [n-count];
    int index=0;
    
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=0 && index<arr1.length){
        arr1[index]=arr[i];
        index++;
      }
    }
    System.out.print("New Array: ");
    for(int i=0; i<arr1.length; i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println("\nRemoved Elements: "+count);
  }
}
