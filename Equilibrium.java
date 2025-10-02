import java.util.*;
import java.util.Stack;

class Equilibrium{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumequal(arr,n));
    }
    public static int sumequal(int [] arr, int n){
        int left=0;
        int right=0;
        int result =-1;
        int total=0;
        for(int i=0;i<n;i++){
           total=total+arr[i];
        }

        for(int i=0;i<n;i++){
            right =total-left-arr[i];
            if(right==left){
                return arr[i];
            }
            left+=arr[i];
        }
        return -1;
    }
}