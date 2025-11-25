/*
D:\Java_Problems>java MatrixDiagonally 
3
4
1 2 3 4
5 6 7 8
9 10 11 12
1 5 2 9 6 3 10 7 4 11 8 12 
D:\Java_Problems>*/



import java.util.*;

class MatrixDiagonally{

    public static void diagonal(int matrix[] [], int row, int col){
        // edu row la first row vechi start panurathu
        for(int i=0;i<=row-1;i++){
            int r=i;
            int c=0;
            while(r >= 0){
                System.out.print(matrix[r][c]+ " ");
                r=r-1;
                c=c+1;
            }
        }
        //epo column vechi start panurathu
        //first element eduka vendam

        for(int i=1;i<=col-1;i++){
            int c=i;
            int r=row-1;
            while ( c < col) {
                System.out.print(matrix[r][c]+ " ");
                r=r-1;
                c=c+1;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int matrix[] [] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        diagonal(matrix, m, n);
    }

}