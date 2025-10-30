import java.util.*;

class TaxiBookingSystem{

    static List<Taxi> taxi = new ArrayList<>();

    static  Scanner sc = new Scanner(System.in);

    static customercount=1;

public static void main(String [] args){

    System.out.println("Enter the number of taxi");


   while(true){
    System.out.println("1.Book a taxi");
    System.out.pritnln("2.See History");
    System.out.println("3.Exit");
   }
   int choice =sc.nextInt();

   switch(choice):

   case 1:
    System.out.println("Booking taxi")
     booktaxi();
    break;

    case 2:

    System.out.println("Transaction log");
    displaytaxidetails();
    break;

    Case 3:
    System.out.println("Exiting the taxi booking system...");
    return;

    default:
        System.out.println("Invalid operation");



public static void initializetaxi(int n){
 for(int i=1;i<=n;i++){
    taxi.add(new Taxi[i])
 }
}

public static void booktaxi(){
    int customerid =customercount++;
    System.out.println("Enter the pickup location (A-F)");
    char pickup = new sc.next().toUpperCase().charAt(0);
     System.out.println("Enter the drop location (A-F)");
    char drop = new sc.next().toUpperCase().charAt(0);
    System.out.println("Enter the pickup time");
    int arrivaltime =sc.nextInt();

    Taxi selectedtaxi=null;

    for( Taxi taxi : taxi){
        if(taxi.isavailable(arrivaltime)){
            
        }
    }

}
}
}
class Booking{
    int bookingid, customerid, amount, arrivaltime, droptime;
    char pick;
    char drop;

    Booking(int bookingid, int customerid,char pick, char drop, int arrivaltime, int droptime, int amount){
        this.bookingid = bookingid;
        this.customerid=customerid;
        this.pick=pick;
        this.drop=drop;
        this.arrivaltime=arrivaltime;
        this.droptime =droptime;
        this.amount=amount;
    }

}
class Taxi{
    int id;
    char currentPosition='A';
    int totalamount=0;
    List<Booking> bookings = new ArrayList<>();

    id(int id){
    this.id =id;
     }

    public static void isavailable(int arrivaltime){
    if(bookings.isEmpty())
    return true;
    // check the last booking time
    Booking lastbooking = bookings.get(bookings.size()-1);
    return lastbooking.drop <= arrival time
    }
        

    public static int calculateamount (char pickup, char drop){
        int totaldistance = Math.abs(drop-pickup)*15;
        return 100+Math.max(0, (totaldistance-5) *10)
    }

    public static void  addbooking(Booking booking){
        booking.add(bookings);
        totalearning+=booking.amount;
        currentPosition =booking.drop;
    }
}