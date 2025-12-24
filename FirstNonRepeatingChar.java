import java.util.*;

class FirstNonRepeatingChar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();

        System.out.println(nonrepeatingchar(str1));
    }
    public static char nonrepeatingchar(String str1){
        int n=str1.length();
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(i!=j && str1.charAt(i)==str1.charAt(j)){
                 found=true;
                 break;
                }
            }

        
        if(found==false){
            return str1.charAt(i);
        }
        }
        return  '$';
    }
}