import java.util.*;
import java.util.Stack;


// input (abbbc))
// output(abbbc)

class Balanced_parenthesis{
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        System.out.println(validparenthesis(str));
    }
    public static String validparenthesis(String str){
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        Set <Integer> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
          if(ch=='('){
            stack.push(i);
          }
          else if(ch==')'){
            if(stack.isEmpty()){
                set.add(i);
            }
            else{
                stack.pop();
            }
          }
        }

        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        for(int i=0;i<str.length();i++){
            if(!set.contains(i)){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}