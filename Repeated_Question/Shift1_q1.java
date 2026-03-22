import java.util.*;
class Shift1_q1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int membership= sc.nextInt();
        int cost=0;
        if (membership==1){
         System.out.println("2000");
        }
        else if(membership==3){
            System.out.println("5000");
        }
        else if(membership==6){
            System.out.println("9000");
        }
        else if(membership==9){
            System.out.println("12000");
        }
        else if(membership==12){
            System.out.println("15000");
        }
        else{
            System.out.println("Error message");
        }
    }
}