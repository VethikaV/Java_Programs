/*

It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
Its length is at least 8.
It contains at least one digit.

Given a string, find its strength. Let a strong password is one that satisfies all above conditions
. A moderate password is one that satisfies first three conditions and has length at least 6. Otherwise password is weak

*/

import java.util.*;
class PasswordStrength{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        strength(str);
    }
    public static void strength(String str){
        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit=false;
        boolean hasspec=false;

        Set<Character> set = new HashSet<Character>(
            Arrays.asList('!','@','#','$','%','^','&','*','(',')','-','+')
        );
        for(char ch: str.toCharArray()){
            if(Character.isLowerCase(ch)){
                haslower =true;
            }
            if(Character.isUpperCase(ch)){
                hasupper =true;
            }
            if(set.contains(ch)){
                hasspec=true;
            }
            if(Character.isDigit(ch)){
                hasdigit=true;
            }
        }
        if(hasupper == true && haslower==true && hasdigit==true && hasspec==true && str.length()>=8){
            System.out.println("Strong");
        }
        else if (hasupper == true && haslower==true && hasspec==true && str.length()>=6){
            System.out.println("Medium");
        }
        else{
            System.out.println("Weak");
        }

    }
}