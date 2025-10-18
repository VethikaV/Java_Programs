/*
LOGIC
String Arrays for Number Words:
ones → Stores words for 1 to 9.
teens → Stores words for 10 to 19.
tens → Stores words for 20, 30, ..., 90.

Logic to Convert Numbers to Words:
If the number is O, return "Zero".
If the number is 100 or more, extract the hundreds place, convert it to words, and add "Hundred".
If the number is between 10-19, use the teens[] array.
If the number is 20 or more, take the tens place value from tens and the ones place value from ones[].

*/
public static final String [] teens{
    "Ten","Eleven","twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
}
public static final String [] ones{
    "one", "Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine"
}
public static final String[] tens{
    " ", " ","Twenty", "Thirty","Forty"," Fifty", "Sixty","Seventy","Eighty","Ninety"
}