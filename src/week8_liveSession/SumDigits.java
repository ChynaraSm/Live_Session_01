package week8_liveSession;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {
    public static void main(String[] args) {

 /*
    SumDigits [Wrapper class, ArrayList, loop]

    Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

        Ex:
            Input:
            ["123, "52", "513"]
            Output:
            [6, 7, 9]
     */

        ArrayList<String> digits=new ArrayList<>(Arrays.asList("123", "52", "513", "1842"));
        ArrayList<Integer> sums=new ArrayList<>();

        for (String each: digits) {
           // System.out.println(each);// to see if it is printing as string
            String[] eachArr=each.split("");
            //System.out.println(Arrays.toString(eachArr));
            /*
            [1, 2, 3]
[5, 2]
[5, 1, 3]
[1, 8, 4, 2]

             */

            int sum=0;

            for (String eachDigit: eachArr){ //datatype digits as a String
                //System.out.println(Integer.parseInt(eachDigit));//we get Integer datatype

                sum+=Integer.parseInt(eachDigit);
            }
            sums.add(sum);// autobox the int to Integer// adding to the Array list which was declared on the top
        }
        System.out.println(digits);
        System.out.println(sums);

    }
}
