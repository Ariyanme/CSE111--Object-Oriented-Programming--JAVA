// ASS_01_ungraded_Task_04

import java.util.Scanner;
public class ASS_01_HW_ungraded_004{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [][] A = {{4, 5, 7},
                  {0, 3, -2},
                  {4, 1, -4},
                  {5, 10, 1}};
//    int [ ] [ ] A = {{1, 2, 4},
//                     {5, 7, 2}};

    int k=sc.nextInt();
    for(int i=0; i<A.length; i++){
      for(int j=0; j<A[0].length; j++){
        A[i][j]=k*A[i][j];
      }
    }
    for(int i=0; i<A.length; i++){
      for(int j=0; j<A[0].length; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
  }
}

