import java.util.*;

class GoodSubsequenceGCD{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        int col=sc.nextInt();
        int query[][]= new int [q][col];
        for(int i=0;i<q;i++){
           query[i][0]=sc.nextInt();
           query[i][1]=sc.nextInt();
        }
        System.out.println(goodsubsequence(n, arr,p,q,col,query));

    }

    public static int goodsubsequence(int n, int arr [], int p, int q, int col, int query[][]){
       int gcdcount=0;
       for(int i=0;i<q;i++){

        int index=query[i][0];
        int value=query[i][1];

        arr[index]=value;

        int g=0;
        int count=0;

        //check divisiblity

        for(int k=1;k<=n;k++){
            if(arr[k]%p==0){
                g=gcd(g, arr[k]);
                count++;
            }
        }

        if( count>0 && g==p && count<n){
            gcdcount++;
        }
        
       }
       return gcdcount;

        }

        // calculate gcd

        public static int gcd(int a, int b ){
            if(b==0)return a;
            return gcd(b,a%b);
        }
}