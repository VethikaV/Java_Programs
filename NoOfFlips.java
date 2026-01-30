import java.util.*;

class NoOfFlips{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(flips(arr, n));
    }
    public static int flips(int arr [] , int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        if(arr[n-1]==1){
            count++;
        }
        return count;
    }
}