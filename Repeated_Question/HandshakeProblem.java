import java.util.*;
class HandshakeProblem{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int person=sc.nextInt();
        int answer=person*(person-1)/2;
        System.out.println(answer); 
    }
}