import java.util.*;

class happy_sad{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double happy =n;
        double sad=0;

        for(int i=0;i<4;i++){
            double newhappy= 0.5*sad + 0.3*happy;
            double newsad= 0.7*happy + 0.5*sad;

            happy = newhappy;
            sad= newsad;
        }
        System.out.printf("%.2f %.2f",happy, sad);
    }

}