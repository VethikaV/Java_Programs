/*
Given an array arr the task is to sort all even-placed numbers in increasing and odd-place numbers in decreasing order. The modified array should contain all sorted even-placed numbers followed by reverse sorted odd-placed numbers.
Note: that the first element is considered as even because of its index 0.

Examples:

Input: arr[] = [0, 1, 2, 3, 4, 5, 6, 7]
Output: [0, 2, 4, 6, 7, 5, 3, 1]
Explanation: Even-place elements : 0, 2, 4, 6 Odd-place elements : 1, 3, 5, 7 Even-place elements in increasing order : 0, 2, 4, 6 Odd-Place elements in decreasing order : 7, 5, 3, 1*/

 import java.util.*;

class BitonicSort{

    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> odd = new ArrayList<>();
         ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
               even.add(arr[i]); 
            }
            else {
                odd.add(arr[i]);
            }
            Collections.sort(even);
            Collections.sort(odd, Collections.reverseOrder());
            
            even.addAll(odd);
        }
        return even;
    }
    public static void main(String [] args){
        int arr =

    }


}