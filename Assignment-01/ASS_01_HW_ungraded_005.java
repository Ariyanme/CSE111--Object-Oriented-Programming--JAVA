// ASS_01_ungraded_Task_05

import java.util.Scanner;
public class ASS_01_HW_ungraded_005{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("M=");
    int m=sc.nextInt();
    System.out.println("N=");
    int n=sc.nextInt();
    int matrix[][]=new int[m][n];
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    System.out.println("Matrix A");
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("\nTranspose A");        // In Transpose Matrix rows & columns are exchanged;
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(matrix[j][i]+" ");      //  rows & columns are exchanged;
      }
      System.out.println();
    }
  }
}
    
    
    
    
    
    