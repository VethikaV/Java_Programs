/*D:\Java_Problems>java Replace0with5
2235523    
2235523

D:\Java_Problems>java Replace0with5
124000
124555*/
import java.util.*;
class Replace0with5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(replace(n));
    }
/*
    public static int replace(int n){
        String str = Integer.toString(n).replace('0','5');
        int result =Integer.parseInt(str);

        return result;
    }
    */
   public static int replace(int n){
      int result=0;
        int multiplier=1;
    while(n>0){
        if(n==0){
            return 5;
        }
      

        int digit =n%10;
        if(digit==0){
            digit=5;
        }
        result =result+digit *multiplier;
        multiplier*=10;
        n=n/10;

    }
    return result;
   }
   
}