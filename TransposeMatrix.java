import java.util.*;

class TransposeMatrix{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();

     int matrix[][] = new int [row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
        int [][] result =transposematrixx(matrix,row,col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            } 
            System.out.print("\n");
        }
    

    }
    public static int [][] transposematrixx(int [][] matrix, int row, int col){
        int transpose[][] = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
}