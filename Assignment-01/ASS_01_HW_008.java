// ASS_01_HW_08
import java.util.Arrays;
import java.util.Scanner;
public class ASS_01_HW_008{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("row:");
    int row=sc.nextInt();
    System.out.println("Column:");
     int col=sc.nextInt();
    int TwoD_arr[][]=new int [row][col];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        TwoD_arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("2D Array: ");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        System.out.print(TwoD_arr[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println("\n1D Array: ");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        System.out.print(TwoD_arr[i][j]+ " ");
      }
    }
        
      
  }
}