import java.util.*;

class AnagramChecker{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine();
        String str2=sc.nextLine();

        System.out.println(anagram(str1,str2));
    }
    public static boolean anagram(String str1, String str2){

        int n=str1.length();
        int m=str2.length();

        if(m!=n){
            return false;
        }
        int charcount[] = new int [256];

        for(int i=0;i<n;i++){
            charcount[str1.charAt(i)]++;
        }
        for(int j=0;j<m;j++){
            charcount[str2.charAt(j)]--;
        }

        for(int count: charcount){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}