import java.util.*;

class sum_of_digit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int temp = i;

            while(temp > 0){
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }
        }

        System.out.println(sum);
    }
}