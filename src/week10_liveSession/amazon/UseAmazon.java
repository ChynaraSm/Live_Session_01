package week10_liveSession.amazon;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account1=new AmazonAccount("javaiscool", "jav4lyfe@gmail.com", false);

        //account.email-.canot acces because it is private
        System.out.println((account1.getEmail()));

account1.setEmail("javausedtobecool@gmail.com");
        System.out.println((account1.getEmail()));




    }
}
