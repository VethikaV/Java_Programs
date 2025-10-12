/*Index of an Extra Element
Difficulty: EasyAccuracy: 41.77%Submissions: 168K+Points: 2Average Time: 20m
You have given two sorted arrays arr1[] & arr2[] of distinct elements. The first array has one element extra added in between. Return the index of the extra element.

Note: 0-based indexing is followed.

*/

class IndexOfExtraElement {
    public static int findExtra(int a[], int b[]) {
     int n=a.length;
     int m=b.length;
     for(int i=0;i<m;i++){
        
             if(a[i]!=b[i]){
                 
                 return i;
                 
             }
     }
     return n-1;
    }
    public static void main(String [] args){
        int a[] ={1,2,3,4,5,6,7,8};
        int b[] ={1,2,3,5,6,7,8};

        System.out.println(findExtra(a,b));
    }
}