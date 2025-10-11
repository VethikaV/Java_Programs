import java.util.*;


class AddDigitToAllDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int digit=sc.nextInt();

        System.out.println(adddigit(n,digit));
    }
    public static String adddigit(int n, int digit){
      String result =" ";
      int copy=n;
      while(n!=0){
        int rem=n%10;
        int value=rem+digit;

        if(value>=10){
            result=(value%10)+result;
            result=(value/10)+result;
        }else{
            result=value+result;
        }
        n=n/10;
      }
      return result;
    }
}