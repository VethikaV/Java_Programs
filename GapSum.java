import java.util.*;
class GapSum{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr [] ={1,2,3,4,5,6,7,8,9};
        int gap=sc.nextInt();
        gapsum(arr,gap);
    
        
    }
    public static void gapsum(int arr[],int gap){
        int n=arr.length;
        for(int i=0;i<gap;i++){
            int sum=0;
            for(int j=i;j<n;j=j+gap){
                sum=sum+arr[j];  
                
            }
            System.out.print(sum +" ");
             
           
        }
    }
}