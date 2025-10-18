import java.util.*;

class Decimal_HexaDecimal{
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int decimal = sc.nextInt();
     
     String hexadecimal = Integer.toHexString(decimal);
     System.out.println(hexadecimal);
    }
}