public abstract class Ticket {
    private String seatNumber;
    private String passengerName;

    public Ticket(String seatNumber, String passengerName) {
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    //Abstract method to calculate ticket price
    public abstract double calculatePrice();   
}
