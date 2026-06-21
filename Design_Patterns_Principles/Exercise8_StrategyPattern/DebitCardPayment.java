public class DebitCardPayment implements PaymentMethod {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " completed using Debit Card.");
    }
}
