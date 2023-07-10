package week8_liveSession;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggestMax2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,3,6,2,8,7,10));

        //System.out.println(list);
        int max=Integer.MIN_VALUE;// 5
        int secondMax=list.get(0);//4

        for (int each: list){
            if (each>max){
                secondMax=max; // first max we found
                max=each;//when find final max number, previous max is second biggest
            }


            if (each>secondMax && each<max){
                secondMax=each;
            }

        }
        System.out.println("max: "+max);
        System.out.println("secondMax: "+secondMax);




    }

}
