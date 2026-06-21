public class StrategyDemo {

    public static void main(String[] args) {

        PaymentService payment1 =
                new PaymentService(new UPIPayment());

        payment1.pay(499);

        PaymentService payment2 =
                new PaymentService(new DebitCardPayment());

        payment2.pay(1299);
    }
}
