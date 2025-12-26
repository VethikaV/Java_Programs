import java.util.*;

class ZigZagArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        zigzag(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void zigzag(int [] arr){
        int n=arr.length;
        boolean flag=true;
        
            for(int i=0;i<n-1;i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    swap(arr,i, i+1);
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
                
            }
            flag=!flag;
            
        }
    }
   public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}