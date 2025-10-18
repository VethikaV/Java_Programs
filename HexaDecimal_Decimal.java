import java.util.*;

class HexaDecimal_Decimal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String hexadecimal = sc.nextLine();
        
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);
    }
}