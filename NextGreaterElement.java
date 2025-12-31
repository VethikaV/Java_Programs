import java.util.*;

class NextGreaterElement{
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int arr [] = new int [n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     System.out.print(nextLargerElement(arr)) ;

    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> result= new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // right to left vaaliya traverse pananum
        int n= arr.length;
     for(int i=n-1; i>=0; i--){
         while(!stack.isEmpty() && stack.peek()<= arr[i]){
            stack.pop();
         }
         if(stack.isEmpty()){
            result.add(-1);
         }
         else{
            result.add(stack.peek());
         }
         stack.push(arr[i]);
     }
     Collections.reverse(result);
     return result;
    }
}