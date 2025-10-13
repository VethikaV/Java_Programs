import java.util.*;


class DistinctDigitInArray{
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(distinctdigits(arr)));
    }
    public static int [] distinctdigits(int [] arr){
        Set<Integer> distinct = new TreeSet<>();

        for(int n: arr){
            while(n>0){
                distinct.add(n%10);
                n=n/10;
            }

        }
        int [] result = new int [distinct.size()];
        int i=0;
        for(int d : distinct){
            result[i++]=d;
        }
        return result;
    }
}