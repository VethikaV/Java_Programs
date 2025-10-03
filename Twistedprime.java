import java.util.*;

class Twistedprime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         if(reverse(n)==true){
            System.out.println("it is a twised prime");
         }
         else{
            System.out.println("IT is not a twised prime");
         }
    }

    
    public static boolean reverse(int n){
        int copy =n;
        int rem=0;
        int rev=0;
        while(n!=0){
            rem =n%10;
            rev=rev*10+rem;
            n=n/10;  
        }
        if(isprime(copy) && isprime(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}