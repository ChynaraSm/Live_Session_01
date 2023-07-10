package week5_withSaim;

public class Multiplication {
    /*
    Multiplication Table [methods, loops]
	create a method that will accept a number. Print the multiplication table for the give number up until 10
	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8

     */
    // public static void multiplicationTable(int number){// string return will help to have concatenation
    //   for (int i = 1; i <=10; i++) {
    //     System.out.println(number +"x"+i+"="+(number*i));
    //}

    public static void multiplicationTable(int number) {
        multiplicationTable(number,10);

    }

    public static void multiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
    /*
Multiplication Table II [overloading]

	overload the previous multiplication table method to accept the number for the table and also the ending point for the multiplication(the default was before was 10)

		ex: inputs: 3, 20
			result would print the multiplication table of 3 up until 20
				3 x 1 = 3
				...
				3 x 20 = 60
 */


    }

