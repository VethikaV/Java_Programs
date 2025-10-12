/*

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Improved approach: Focus on pair patterns

Since the array is sorted and every element appears twice, we can observe:

nums = [3,3,7,7,10,11,11]
index:  0 1 2 3  4  5  6
        ↑   ↑    ↑
     pair pair  single
Key insight: Normal pairs should appear at (even index, odd index) positions!

This means if we check pairs starting from indices 0, 2, 4, 6, ...:

nums[0] == nums[1] → normal pair
nums[2] == nums[3] → normal pair
nums[4] == nums[5] → different! So nums[4] is our answer
*/
import java.util.*;
class SingleElement{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(single(arr));
    }
    public static int single(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i=i+2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[n-1];
    }
}