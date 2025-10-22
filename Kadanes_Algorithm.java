/*
You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.*/
import java.util.*;
class Kadanes_Algorithm{
    public static int maxSubarraySum(int[] arr) {
        int n=arr.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(maxsum<sum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
            
        }
        return maxsum;
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubarraySum(arr));
    }
}
