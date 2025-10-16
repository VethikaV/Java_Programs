import java.util.*;
class IsSquare {

    public static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4,
                           int y4) {
        String result = "";
        
          int [] arr = new int [6];
          
           arr[0]=distance(x1,x2,y1,y2);
           arr[1]=distance(x1,x3,y1,y3);
           arr[2]=distance(x1,x4,y1,y4);
           arr[3]=distance(x2,x3,y2,y3);
           arr[4]=distance(x2,x4,y2,y4);
           arr[5]=distance(x3,x4,y3,y4);
          
          Arrays.sort(arr);
          
          if(arr[0]==0){
              result="No";
              return result;
          }
         
         if(arr[0]== arr[1] && arr[1]== arr[2] && arr[2]==arr[3] && arr[4]==arr[5] && (2*arr[0])==arr[4])
         {
             result ="Yes";
         }
         else{
             result ="No";
         }
         return result;
         
                           }
    public static int distance(int x1, int x2, int y1, int y2){
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter eight points");
         System.out.println("x1");
         int x1= sc.nextInt();
          System.out.println("y1");
         int y1= sc.nextInt();
          System.out.println("x2");
         int x2= sc.nextInt();
          System.out.println("y2");
         int y2= sc.nextInt();
          System.out.println("x3");
         int x3= sc.nextInt();
          System.out.println("y3");
         int y3= sc.nextInt();
          System.out.println("x4");
         int x4= sc.nextInt();
          System.out.println("y4");
         int y4= sc.nextInt();

         System.out.println(isSquare(x1,y1,x2,y2,x3,y3,x4,y4));

    }
}
