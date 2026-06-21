public class UPIPayment implements PaymentMethod {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " completed using UPI.");
    }
}
