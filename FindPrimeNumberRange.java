import java.util.*;

class FindPrimeNumberRange{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        System.out.println(Arrays.toString(findprimerange(m,n)));
    }
    public static int [] findprimerange(int m , int n){
         List <Integer> result = new ArrayList<>();
        
        int count=0;
        for(int i=m; i<=n;i++){
            if(isprime(i)){
                result.add(i);
        
            }
        }
        int answer[] = new int [result.size()];
        int index=0;
        for(int i : result){
            answer[index++]=i;

        }
        return answer;
       
    }
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}