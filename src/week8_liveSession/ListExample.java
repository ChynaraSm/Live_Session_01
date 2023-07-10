package week8_liveSession;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(5);

        System.out.println(list2);
        ArrayList<Integer>  list3=new ArrayList<>(list2);//this creates a new ArrayList with same elements as list2
        System.out.println(list3);
list3.add(0,100);
ArrayList<Integer> list4=list3;// this is anew reference that points to the same object as list 3
        System.out.println("---------------------");
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        ArrayList<Integer> list5=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list5);

    }


}
