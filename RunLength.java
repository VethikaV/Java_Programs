/*Given a string s, Your task is to complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.*/

import java.util.*;


class RunLength{
    
    public static String encode(String s) {
        // code here
        int n=s.length();
        char [] arr = s.toCharArray();
        StringBuilder result= new StringBuilder();
        for(int i=0, j=0;i<n;j++){
            if(j==n || arr[j]!=arr[i]){
                result.append(arr[i]);
                result.append(j-i);
                i=j;// count ah 0 va change pana;
            }
            
        
    }
    return result.toString();
    }
public static void main(String [] args){
    String str ="aaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccceeeeeeeeeeeeeeeeeeeeekkkkkkkssssssssssiiii";
    System.out.println(encode(str));
}
}