import java.util.*;

class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        char [][] matrix= new char [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0 || i==0 || j==m-1 || i==n-1){
                    matrix[i][j]='X';
                }
                else{
                    matrix[i][j]='O';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
}