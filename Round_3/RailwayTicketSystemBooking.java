class RailwayTicketSystemBooking{
    class passenger{
        String name;
        int age;
        String gender;
        String berthprefered;
        String allocatedberth;
        String ticketId;

        public passenger(String name, int age, String gender, String berthprefered, String allocatedberth, String ticketId){
            this.name =name;
            this.age=age;
            this.gender=gender;
            this.berthprefered=berthprefered;
            this.allocatedberth=allocatedberth;
            this.ticketId=ticketId;
        }

        @override
        public String toString(){
            return "TicketId"+ ticketId +", Name"+ name +", Age"+ age +", Berth"+ allocatedberth ;
        }
    }
}