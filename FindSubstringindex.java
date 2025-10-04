import java.util.*;


/* 
D:\Java_Problems>java FindSubstringindex
test123
123
4

D:\Java_Problems>java FindSubstringindex
12312412
1235343874858'
-1
*/

class FindSubstringindex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 =  sc.nextLine();
        String str2=sc.nextLine();

        System.out.println(issubstring(str1,str2));
    }
    public static int issubstring(String str1, String str2){
        int length1=str1.length();
        int length2 = str2.length();

        if(length2>length1){
            return -1;
        }
        for(int i=0;i<=length1+length2;i++){
            int j;
            for(j=0;j<length2; j++){
                if(str1.charAt(i+j)!=str2.charAt(j))
                break;

              
            }
              if(j==str2.length()){
                    return i;
                }
        
        }
        return -1;
    }
}