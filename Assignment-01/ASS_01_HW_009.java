
// ASS_01_HW_09
import java.util.Scanner;
public class ASS_01_HW_009{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [ ] [ ] A = {{1,  0,  0,  1},
                     {0,  1,  0,  0},
                     {1,  0,  1,  0},
                     {0,  1,  0,  1}};
//    int [ ] [ ] A = {{1, 0, 0},
//                     {0, 1, 0},
//                     {0, 0, 1}};

    int matrix_sum=0, Diagonal_sum=0;
    for(int i=0; i<A.length; i++){
      for(int j=0; j<A[0].length; j++){
        matrix_sum+=A[i][j];
        if(i==j && A[i][j]==1){
          Diagonal_sum+=A[i][i];
        }
      }
    }
    System.out.println(matrix_sum+"   "+Diagonal_sum);
    if(Diagonal_sum==A.length && Diagonal_sum==matrix_sum){
      System.out.println("Identity Matrix");
    }
    else{
      System.out.println("Not an identity matrix");
    }
  }
}

    