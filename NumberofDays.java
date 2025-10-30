// User function Template for Java

class Solution {
    
    static int []  daysinmonth ={31,28,31,30,31,30,31,31,30,31,30,31};
    
    public static boolean isleap(int year){
        if(year%4 ==0 && year %100 !=0 || year%400 ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int dayscalculation(int day, int month, int year){
        int days=0;
        for(int i=0;i<year;i++){
            if(isleap(i)){
                days=days+366;
            }
            else{
                days=days+365;
            }
        }
        // month calculation
        
        for(int i=0;i<month-1;i++){
            days=days+daysinmonth[i];
            if(i==1 && isleap(year)){
                days=days+1;
            }
            
        }
        
        days=days+day;
        
        return days;
    }
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        int value1=dayscalculation(d1,m1,y1);
        int value2=dayscalculation(d2,m2,y2);
        
       return Math.abs(value1-value2);
        
    }
};