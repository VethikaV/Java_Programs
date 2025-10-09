import java.util.*;

class RowWiseSum{
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
        int m =sc.nextInt();
        int  n =sc.nextInt();

        int matrix[][] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rowsum(matrix,m,n);
    }
    public static void rowsum(int [][] matrix, int m, int n){
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=matrix[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}