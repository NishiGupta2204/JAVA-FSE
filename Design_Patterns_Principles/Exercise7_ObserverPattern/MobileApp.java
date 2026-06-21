public class MobileApp implements Subscriber {

    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile Alert : " + stockName +
                           " price updated to ₹" + price);
    }
}
