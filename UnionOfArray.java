/*
D:\Java_Problems>javac UnionOfArray.java

D:\Java_Problems>java UnionOfArray
Enter number of elements in first array
4
1 2 3 1
Enter number of elements in second array
3
3 2 5
[1, 2, 3, 5]

*/

import java.util.*;
class UnionOfArray{
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> result = new HashSet<>();
        int m =a.length;
        int n=b.length;
        int [] union = new int [m+n];
         System.arraycopy(a,0, union,0, m);
         System.arraycopy(b, 0,union, m,n );
         
         for(int i:union){
             result.add(i);
         }
        ArrayList<Integer> finaly = new ArrayList<>(result);
        
        return finaly;
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements in first array");
    int n=sc.nextInt();
    int [] a= new int [n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
    System.out.println("Enter number of elements in second array");
    int m=sc.nextInt();
    int [] b= new int [m];
    for(int i=0;i<m;i++){
       b[i]=sc.nextInt();
    }

    System.out.println(findUnion(a,b));
    }

}