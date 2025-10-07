import java.util.*;

class SpiralMatrix{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
    
        int matrix[][] ={
           { 1 ,2, 3},
           { 4, 5, 6},
            {7 ,8, 9}
        };
        spiralcalculation(matrix);
    }

    public static void spiralcalculation(int [][]matrix){
        if(matrix ==null || matrix.length==0){
            return;
        }
        int top=0;
        int bottom=matrix.length-1;
        int left =0;
        int right =matrix[0].length-1;

        while(left<=right && top<= bottom){

            // top row iteration ku
            for(int i=left ;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            // right to top porathu

            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }

    }
}