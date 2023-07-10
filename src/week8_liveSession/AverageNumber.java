package week8_liveSession;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        /*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.3
            average of: [10, 40, 25] is 25.0
            average of all is 10.6
 */
        int [][] nums={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };
        System.out.println(Arrays.deepToString(nums));

        double sumOfAll=0;
        int totalNumberOfElements=0;

        DecimalFormat df =new DecimalFormat(); // if you want to format the number you would declare this object and use the format method when  printing the average on lines

        for(int[]eachArr:nums) {//eachArr is the 1D array elements
            double sumEach=0;//this should reset each time the outer loop runs

            for (int eachNumber: eachArr) {
                sumEach+=eachNumber;
            }
            double average = sumEach / eachArr.length; // average = sum of number / amount of numbers
            //System.out.println(sumEach + " / " + eachArr.length + " = " + average);
            System.out.println("average of " + Arrays.toString(eachArr) + " is " + average);

            sumOfAll += sumEach; // adding the sum of each inner array to the total sum
            totalNumberOfElements += eachArr.length;

        }

        System.out.println("Total average " + (sumOfAll/totalNumberOfElements));
        System.out.println("Total average "+df.format(sumOfAll/totalNumberOfElements));




    }
}
