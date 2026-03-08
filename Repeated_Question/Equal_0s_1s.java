import java.util.*;

class Equal_0s_1s{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(largest(n,arr));
    }
    public static int largest(int n, int arr[]){
        int maxine=0;
        for (int i=0;i<n;i++){
            int count0=0;
            int count1=0;
            for (int j=i;j<n;j++){
            if(arr[j]==0){
                count0++;
            }else{
                count1++;
            }
            if(count1==count0){
                int length=(j-i)+1;
                maxine=Math.max(length,maxine);
            }
            }
        }
        return maxine;
    }
}