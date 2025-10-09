import java.util.*;

class ColumnWiseSum{
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
        columnsum(matrix,m,n);

    }
    public static void columnsum(int [][]matrix, int m, int n){
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j];

            }
            System.out.print(sum+" ");
        }
    }
}