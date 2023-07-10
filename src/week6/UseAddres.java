package week6;

public class UseAddres {
    public static void main(String[] args) {
        Address address1=new Address();
        System.out.println(address1);
        address1.setInfo("231441 Oak Drive", "Fairfax", "VA", 34022, "US");

        System.out.println(address1);

        Address address2=new Address();
        address2.setInfo("12313 Lane", "Fairfax", "VA", 1323, "US");
        System.out.println(address2);

//instance result by defaults is null
    }
}
