import java.util.*;

class max_laptop{
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      int charge=sc.nextInt();
      sc.nextLine();
    String str =sc.nextLine();
    String  array[] = str.split(" ");
    ArrayList <Integer> list = new ArrayList<>();
    for (String value : array){
        list.add(Integer.parseInt(value));
    }
    int n=list.size();
    int count=0;
    for ( int i=0;i<n;i++){
        int com=list.get(i);
      if(com>=charge){
        count++;
      }
    }
      System.out.println(count);
    }
}