/*

Missing in Array

You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n 
(inclusive). This array represents a permutation of the integers from 1 to n with one element missing. 
Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

*/
import java.util.*;

import java.util.*;

class MissingNumber {

    long missingNum(long nums[]) {
        long n = nums.length;  // actual array size = n - 1
        long total = (n + 1) * (n + 2) / 2;  // expected sum of 1 to n+1
        long sum = 0;

        for (long i = 0; i < n; i++) {
            sum += nums[(int)i];
        }

        return total - sum;  // the missing number
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        long n = sc.nextLong(); // actual n (range up to n)
        
        long[] arr = new long[(int)(n - 1)];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextLong();
        }

        MissingNumber obj = new MissingNumber();
        System.out.println("Missing number: " + obj.missingNum(arr));
    }
}
