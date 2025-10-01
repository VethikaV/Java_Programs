import java.util.*;
import java.util.Stack;
/*
D:\Java_Problems>java Anagram_finder      
[tea, eat]
*/


class Anagram_finder{
    public static void main (String args[]){
        String array [] = {"catch", "got", "tiger", "mat", "cat","pat", "tap","tea","eat"};
        String word = "ate";

        System.out.println(anagramfinder( array, word));
    }

    public static  ArrayList<String> anagramfinder (String [] array, String word){
        ArrayList<String>  result = new ArrayList<>();
        for(String str : array){
            if(isanagram(str, word)){
                result.add(str);
            }
        }
        return result;

    }
    public static boolean isanagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        int [] charcount = new int [256];
        for(int i=0;i<str1.length();i++){
            charcount[str1.charAt(i)]++;
        }
        for(int j=0;j<str2.length();j++){
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