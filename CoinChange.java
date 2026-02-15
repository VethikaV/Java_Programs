import java.util.*;
/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

*/

class CoinChange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(coin(arr,target)); 
    }
    public static int coin(int arr[], int target){

    int dp [] = new int [target+1];
    Arrays.fill(dp,target+1);
    dp[0]=0;
    for(int coin: arr){
        for(int i=coin;i<=target;i++){
            dp[i]=Math.min(dp[i], dp[i-coin]+1);
        }
    }
    if(dp[target]==target+1){
        return -1;
    }
    return dp[target];
    }

}