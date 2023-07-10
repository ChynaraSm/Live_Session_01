package week8_liveSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondBiggest {
    /*
   [IQ] Second Biggest Number [ArrayList, loop, conditional]

   Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
   Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
   Input:
       [4,3,1,4,5,2,4,8,4,8]
   Output:
    */
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));
        System.out.println(list);

        int max=Collections.max(list);
        System.out.println(max);
        System.out.println(Collections.max(list));
        list.removeAll(Arrays.asList(max));
        System.out.println(list);

        System.out.println("Second max: "+ Collections.max(list));


    }
}
