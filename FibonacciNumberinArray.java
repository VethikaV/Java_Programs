import java.util.*;

class FibonacciNumberinArray{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    ArrayList<Integer> result = new ArrayList<>();
    for(int i : arr){
        if(isfibo(i)){
            result.add(i);
        }
    }
    System.out.println(result);
    }
    public static boolean isfibo(int n){
        int a=0;
        int b=1;
        while(b<=n){

            if(b==n){
                return true;
            }
            int next=a+b;
            a=b;
            b=next;
        
        }
        return false;
    }
}