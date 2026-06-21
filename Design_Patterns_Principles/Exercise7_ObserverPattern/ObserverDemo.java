public class ObserverDemo {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Subscriber mobileUser = new MobileApp();
        Subscriber webUser = new WebApp();

        market.addSubscriber(mobileUser);
        market.addSubscriber(webUser);

        market.setStockPrice("TCS", 3550.75);

        System.out.println();

        market.setStockPrice("Infosys", 1625.50);
    }
}
