public class StudentTicket extends Ticket {
    private double discountPercentage;

    public StudentTicket(String seatNumber, String passengerName, double discountPercentage) {
        super(seatNumber, passengerName);
        this.discountPercentage=discountPercentage;
    }

    public double getDiscount() {
        return discountPercentage;
    }

    @Override
    public double calculatePrice() {
        //Calculate ticket price for VIP ticket
        return 50.00*(1-(discountPercentage/100.00));
    }
}
