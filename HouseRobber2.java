/*
first and last element ah both ah consider pana kudathu


*/
import java.util.*;
public class HouseRobber2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(robber(arr,n));
    }
    public static int  robber(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        int case1 = calculation(arr,0,n-2);
        int case3= calculation(arr,1,n-1);

        return Math.max(case1,case3);
    }
    public static int calculation(int arr[], int start,int end){
        int dp[] = new int [end+1];
        int len= end-start+1;
        dp[0]=arr[start];
        dp[1]=Math.max(arr[start],arr[start+1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],arr[start+i]+dp[i-2]);
        }
        return dp[len-1];
    }

}