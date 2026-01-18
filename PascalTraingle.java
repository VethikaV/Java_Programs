import java.util.*;

class PascalTraingle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pascal(n));
    }
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    row.add(1);
                }
                else{
                    List<Integer> previous = result.get(i-1);
                    row.add(previous.get(j)+ previous.get(j-1));

                }
               
            }
             result.add(row);

        }
        return result;

    }
}