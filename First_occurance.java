import java.util.*;
/*
D:\Java_Problems>java First_occurance      
zohocoorporation
port
ohocoorporat

vethika
ti
thi*/


class First_occurance{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2 =sc.nextLine();

        System.out.println(getsubstringinrange(str1,str2));
    }
    public static String getsubstringinrange(String str1, String str2){
        int minvalue= Integer.MAX_VALUE;
        int maxvalue= Integer.MIN_VALUE;
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            // min index and max index of str2 in str1 will be founds here
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j)==ch){
                    if(j<minvalue){
                       minvalue=j;
                    }
                    if(j>maxvalue){
                        maxvalue=j;
                    }
                    break;
                }
            }
        }
        if(minvalue== Integer.MAX_VALUE || maxvalue == Integer.MIN_VALUE){
            return " ";
        }
        StringBuilder result = new StringBuilder();
        for(int i=minvalue; i<=maxvalue;i++){
            result.append(str1.charAt(i));
        }
        return result.toString();
    }
}