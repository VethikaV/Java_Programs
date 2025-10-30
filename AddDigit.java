/*

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.*/

import java.util.*;
class AddDigit {
    public static int addDigits(int num) {
        int rem=0;
        int sum=0;
        while(num>0){
           rem=num%10;
           sum+=rem;
           num=num/10;

           if(num==0 && sum>=10){
            num=sum;
            sum=0;
           } 
        }
        return sum;
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(addDigits(n));
    }
}