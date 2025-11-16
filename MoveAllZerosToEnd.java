import java.util.*;


class MoveAllZerosToEnd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        move(arr,n);

        System.out.println(Arrays.toString(arr));
    }
    public static int [] move (int [] arr, int n){
        int start=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               arr[start]=arr[i];
               start++;
            }
        }
        while(start<n){
            arr[start]=0;
            start++;
        }

        return arr;
    }
}