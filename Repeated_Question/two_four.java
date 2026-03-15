import java.util.*;

class two_four{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vechicle = sc.nextInt();
        int wheel =sc.nextInt();
        if( wheel%2!=0 || wheel<2*vechicle || wheel>4*vechicle){
            System.out.println("-1");
            return;
        }
        int four= (wheel-2*vechicle)/2;
        int two= vechicle-four;
        System.out.println(two);
        System.out.println(four);
    }
   
}