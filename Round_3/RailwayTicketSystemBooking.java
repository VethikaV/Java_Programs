import java.util.*;

    class Passenger{
        String name;
        int age;
        String gender;
        String berthprefered;
        String allocatedberth;
        String ticketId;

        public Passenger(String name, int age, String gender, String berthprefered, String allocatedberth, String ticketId){
            this.name =name;
            this.age=age;
            this.gender=gender;
            this.berthprefered=berthprefered;
            this.allocatedberth=allocatedberth;
            this.ticketId=ticketId;
        }

        @Override
        public String toString(){
            return "TicketId"+ ticketId +", Name"+ name +", Age"+ age +", Berth"+ allocatedberth;
        }
    }
    class TicketSystem{
        private final List<String> availableBerths= new ArrayList<>(Arrays.asList("L","U","M"));
        private final Queue<Passenger> racQueue= new LinkedList<>();
        private final Queue<Passenger> waitingListQueue= new LinkedList<>();
        private final List<Passenger> confirmedList= new ArrayList<>();

        private int ticketcounter=1;
        public void bookticket(String name,  int age, String gender,String berthprefered){
            String ticketId="T"+ticketcounter++;
            Passenger passenger;
            // if the tickets in the availabe berth is not fill  then we go with this
            if(!availableBerths.isEmpty()){
                String allocatedBerth = allocatedBerth(age, gender, berthprefered);
                passenger= new Passenger(name, age, gender, berthprefered, allocatedBerth,ticketId);
                confirmedList.add(passenger);
                availableBerths.remove(allocatedBerth);
                System.out.println("Ticket confirmed"+ passenger);
            }
            // available fill agairuchuna we go to the rac section we have one ticket in rac, if rac is empty it ges to this else if statment
            else if(racQueue.size()<1){
                passenger = new Passenger( name, age, gender, berthprefered,"rac",ticketId);
                racQueue.add(passenger);
                System.out.println("Ticket booked in Rac"+ passenger);
            }
            /// next else if condition la after filling rac we go to waiting list
            else if(waitingListQueue.size()<1){
                passenger = new Passenger (name, age, gender, berthprefered, "waitinglist", ticketId);
                waitingListQueue.add(passenger);
                System.out.println("Ticket in waiting list"+ passenger);
            }
            // ellame fill available ticket, rac,  waiting list so epo eventally we need to print no ticket if none satisfies
            else{
                System.out.println("No tickets available");
            }
        }
        private String allocatedBerth(int age, String gender, String berthprefered){
            if((age>60 || gender.equalsIgnoreCase("female")) && availableBerths.contains("L")){
                return "L";
            }
            if(availableBerths.contains(berthprefered)){
                return berthprefered;
            }
            return availableBerths.get(0);
        }
    
         public void cancelTicket(String ticketId){
         Optional<Passenger> passengerOpt = confirmedList.stream().filter(p -> p.ticketId.equals(ticketId)).findFirst();

    // if the ticketid is present
    if(passengerOpt.isPresent()){

     Passenger passenger = passengerOpt.get();
     confirmedList.remove(passenger);
     availableBerths.add(passenger.allocatedberth);

     // rac la ticket irutha aada confirmed tickets la shift paniranum
     if(!racQueue.isEmpty()){
        Passenger racPassenger = racQueue.poll();
        String allocatedBerth = allocatedBerth(racPassenger.age , racPassenger.gender, racPassenger.berthprefered);
        racPassenger.allocatedberth = allocatedBerth;
        confirmedList.add(racPassenger);
        availableBerths.remove(allocatedBerth);
        System.out.println("RAC ticket moved to confirmed "+ racPassenger);
     }

     // waiting list la irukura tickets ellame nama rac la kondu vaaranum
     if(!waitingListQueue.isEmpty()){
        Passenger waitingPassenger = waitingListQueue.poll();
        racQueue.offer(waitingPassenger);
        waitingPassenger.allocatedberth="RAC";
        System.out.println("Waiting list ticket mved to Rac" + waitingPassenger);
     }
     System.out.println("Ticket cancelled successfully for Id" + ticketId);
    }
    else{
        System.out.println("No ticket is found with ID" + ticketId);
    }
   }
 // printing the booked tickets
   public void printBookedTickets(){
    if(confirmedList.isEmpty()){
        System.out.println(" No confirmed tickets");
    }
    else{
        System.out.println(" Confirmed tickets");
        for(Passenger passenger : confirmedList){
            System.out.println(passenger);
        }
    }
   }
    
   // checking the avaiable ticket 

   public void printAvailableTickets(){
    System.out.println("Available berths"+ availableBerths.size());
    System.out.println("Available RAC berths"+ (1-racQueue.size()));
    System.out.println("Available waiting list tickets"+ (1-waitingListQueue.size()));
   }

   // view rac tickets

   public void  viewRacTickets(){
    if(racQueue.isEmpty()){
        System.out.println("NO Rac tickets");
    }else{
        System.out.println("RAC Tickets");
        for(Passenger passenger : racQueue){
            System.out.println(passenger);
        }
    }
   }

   //view waiting  ticket list
   public void viewWaitingListTickets(){
    if(waitingListQueue.isEmpty()){
        System.out.println("No tickets found");
    }else{
        System.out.println("Waiting List Tickets");
        for(Passenger passenger : waitingListQueue){
            System.out.println(passenger);
        }
    }
   }
    }
// edan main class
   public class RailwayTicketSystemBooking{
   public static void main(String [] args){
     TicketSystem ticketsystem = new TicketSystem();// object create panuro
     Scanner sc= new Scanner(System.in);
     while(true){// infinite ah run aagum
       System.out.println("\n Railway ticket booking system");
       System.out.println("1. Book ticket");
       System.out.println("2. Cancel ticket");
       System.out.println("3. View Confirmed Ticket");
       System.out.println("4. View Available Ticket");
       System.out.println("5. View RAC Ticket");
       System.out.println("6. View Waiting List Ticket");
       System.out.println("7. Exit");
       System.out.println("Enter your choice");
       int choice = Integer.parseInt(sc.nextLine());
       switch(choice){
        case 1:
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter age: " );
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter gender (Male/Female)");
            String gender = sc.nextLine();
            System.out.println("Enter berth preference(U/L/M)");
            String berthprefered = sc.nextLine();
            // call the function
            ticketsystem.bookticket(name,age,gender,berthprefered);
            break;
        case 2:
            System.out.println("Enter TicketID to cancel");
            String ticketId=sc.nextLine();
            ticketsystem.cancelTicket(ticketId);
            break;
        case 3:
            ticketsystem.printBookedTickets();
            break;
        case 4:
            ticketsystem.printAvailableTickets();
            break;
        case 5:
            ticketsystem.viewRacTickets();
            break;
        case 6:
            ticketsystem.viewWaitingListTickets();
            break;
        case 7:
            System.out.println("Exiting..");
            System.exit(0);
        default:
            System.out.println("Invalid choice. Try again");
       }
     }
   }
   }
