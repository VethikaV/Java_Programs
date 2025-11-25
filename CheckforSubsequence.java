import java.util.*;

class CheckforSubsequence{
    
    public static boolean isSubSequence(String A, String B) {
        int i = 0, j = 0;
        int l1 = A.length();
        int l2 = B.length();

        while (i < l1 && j < l2) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;   // move pointer in A
            }
            j++;       // always move pointer in B
        }

        return i == l1;  // if all characters of A are matched
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine();
        String str2 =sc.nextLine();
        System.out.println(isSubSequence(str1,str2));
    }

}