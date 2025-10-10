import java.util.*;

class LinearSearchImplementation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.print("target is found in "+ location(array, target));
    }
    public static int location(int [] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}