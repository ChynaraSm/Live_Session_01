package week10_liveSession;

public class UseBestBuy {
    public static void main(String[] args) {
        System.out.println("MAIN METHOD RUNNING");
       // System.out.println(BestBuy.ceo);
        System.out.println(new BestBuy("123213 Cook Drive",213, 40));

        BestBuy store1=new BestBuy("13213 Cook Drive", 213, 40);
        store1.reportProfit();
        System.out.println(BestBuy.revenue);






    }
}
