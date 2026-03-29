import java.util.*;
class comma_separated{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String array[] = str.split(",");
        ArrayList <Integer> list = new ArrayList<>();
        for (String num: array){
            list.add(Integer.parseInt(num));
        }
        int n=list.size();
        int product=1;
        for(int i=0;i<n;i++){
            int value=list.get(i);
            if(value!=0){
              product*=value;
            }
        }
        System.out.println(product);
    }
}