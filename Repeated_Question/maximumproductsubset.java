import java.util.*;

public class maximumproductsubset{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String num [] = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (String value: num){
            list.add(Integer.parseInt(value));
        }
        
        int n=list.size();
        int max=1;
        int negative=0;
        int zero=0;
        int positive=0;
        int maxnegative = Integer.MIN_VALUE; 
        for ( int i=0;i<n;i++){
            if(list.get(i)==0){
                zero++;
            }
            if(list.get(i)<0){
                negative++;
                maxnegative=Math.max(maxnegative,list.get(i));
            }
            
             max*=list.get(i);
        }
         if(negative%2==1){
              max=max/maxnegative;
            }
        if(zero==n){
                System.out.println("0");
                return;
            }
    System.out.println(max);
    }
}