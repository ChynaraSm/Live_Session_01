package week7_liveSession;

import java.util.Scanner;

public class Memory {
    public static void main(String[] args) {

        Scanner front=new Scanner(System.in);
        //reference: Scanner input
        //object: new Scanner (System.in0
        Scanner back;//just refernce , no object
        back=front;// the back refernce also has access to the same object from line8

        front=null;//the front reference no longer has access to the object from line 8
        //Q: is the object on line 8 eligible for GC?
        back=null;// i removed the other reference of the object so now it is eligible for GC


        int[] a={1, 2, 3};
    a =new int[] {1, 2, 34,4, 5};// creates  anew array, we reassigned reference a but we didnt change size of original  array


        //now orginal -->int[] a={1, 2, 3}; is eleigible for garabage collection because there is norefernce to it
    }
}
