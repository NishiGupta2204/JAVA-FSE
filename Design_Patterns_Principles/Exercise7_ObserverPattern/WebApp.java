public class WebApp implements Subscriber {

    @Override
    public void update(String stockName, double price) {
        System.out.println("Web Dashboard : " + stockName +
                           " is now ₹" + price);
    }
}
