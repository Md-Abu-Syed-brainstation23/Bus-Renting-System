public class VipTicket extends Ticket{
    private boolean hasWiFi;
    private boolean hasTV;
    public VipTicket(String seatNumber, String passengerName,boolean hasWiFi,boolean hasTV)
       {
         super(seatNumber, passengerName);
         this.hasTV=hasTV;
         this.hasWiFi=hasWiFi;
       }
       public double calculatePrice()
       {
        return 75.00;
       }
      public boolean hasWiFi()
      {
        return hasWiFi;
      } 
      public boolean hasTV()
      {
        return hasTV;
      }
}
