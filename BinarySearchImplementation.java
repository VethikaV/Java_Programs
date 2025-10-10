import java.util.*;

class BinarySearchImplementation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.print("target is found in "+ location(array, target));
    }
    public static int location(int [] array, int target){
        int left=0;
        int right =array.length-1;
        int n=array.length;
        Arrays.sort(array);
       while(left<=right){
        int mid =left +(right-left)/2;
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]<target){
          left=mid+1;
        }
        else{
            right=mid-1;
        }
       }
       return -1;
    }
}