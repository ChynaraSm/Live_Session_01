package week2;

public class BestBuy {
    public static void main(String[] args) {

        int tvs=50;
        System.out.println("tvs = " + tvs);
        System.out.println("someone comes in and buy a tv");
        //tvs-=1
        // tvs=tvs-1
        //tvs--;

        --tvs;// didn't declare datatype i guess it is for post pre increment/decrement
        System.out.println("number of tvs is now: "+tvs);//49

        System.out.println("person 2 came in and bought a tv; ");
        System.out.println("number of tvs is now; "+ --tvs);// print 48

        System.out.println("how many tvs are still in the store: "+tvs--);
        System.out.println("they left, how many left in the store: "+tvs);

        System.out.println("---");
        System.out.println("the store gets a shipment");
        tvs+=10;//tvs=tvs+10 --> adding 10
        System.out.println(tvs);
    }
}
