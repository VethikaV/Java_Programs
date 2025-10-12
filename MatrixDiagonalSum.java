/*1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on
 the secondary diagonal that are not part of the primary diagonal.

D:\Java_Problems>java MatrixDiagonalSum
4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
20

D:\Java_Problems>java MatrixDiagonalSum
5
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
27
*/
import java.util.*;

class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
                 sum=sum+mat[i][i];
                 sum=sum+mat[i][n-i-1]; 
        }
        if(n%2!=0)
         sum=sum-mat[n/2][n/2];
    
           return sum;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int row=sc.nextInt();
     // it is a square matrix

     int matrix[][] = new int [row][row];
     for(int i=0;i<row;i++){
        for(int j=0;j<row;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
     System.out.println(diagonalSum(matrix));
    }
}
 