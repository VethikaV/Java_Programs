import java.util.*;


class Sortby_factorCount{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,n);
        for(int num: arr){
           System.out.print(num+" ");
        }
    }
    public static int [] sort(int [] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(countfactor(arr[j])<countfactor(arr[j+1])){
                    int temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int countfactor(int value){
        int count=0;
        for(int i=1;i<=value;i++){
            if(value%i==0){
                count++;
            }
        }
        return count;
    }
}