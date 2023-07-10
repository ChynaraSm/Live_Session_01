package week8_liveSession;

public class CommonElements {
    public static void main(String[] args) {
            /*
    CommonElements [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and find which elements can be found in all of the inner arrays

    Ex:
           int[][] arr {
                  {4, 1, 24, 5},
                  {24, 1, 5, 2},
                  {4, 1, 5, 1}
           }

           common elements are: 1, 5

           -> 4 is missing from the 2nd array & 24 is missing from the 3rd array so those aren't common elements

     */
        int[][] arr= {
            {4, 1, 24, 5},
            {24, 1, 5, 2},
            {4, 1, 5, 1}
        };

        for (int i = 0; i <arr[0].length; i++) {//purpose of this loop is to iterate through the first inner array
            //System.out.println(arr[0][i]);

            int isCommon=1;//3

            for (int j = 1; j < arr.length; j++) {//purpose of this loop is to go through the rest of 2d array

                for (int each:arr[j]){
                    if (each==arr[0][i]) {
                        isCommon++;
                        break;
                    }
                }
            }

            if (isCommon==arr.length){
                System.out.println(arr[0][i]);
            }

        }



    }
}
