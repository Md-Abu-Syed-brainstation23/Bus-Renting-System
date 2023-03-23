class RegularTicket extends Ticket {

    public RegularTicket(String seatNumber, String passengerName, String source, String destination) {
        super(seatNumber, passengerName);
    }
    @Override
    public double calculatePrice() {
        //Calculate ticket price for regular ticket
        return 50.00;
    }
}