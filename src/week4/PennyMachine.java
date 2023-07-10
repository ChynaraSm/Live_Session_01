package week4;

import java.util.Scanner;

public class PennyMachine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, enter your number of pennies:");
        int cents= input.nextInt(); //246

        if (cents>0 && cents<=1200) {
            int dollars, quarters, nickels, dimes;
            String msg = cents + " was converted to ";

            dollars = cents / 100; // -->/100=2 dollars
            cents %= 100;//246%100=46
            //if (dollars>0){
            //    msg+=dollars+" dollars, ";
            //}
            msg+=dollars>0? dollars+" dollars, ": "";

            quarters = cents / 25; // -->  46/25=1 quarter
            cents %= 25; //--> 46%25=21
            msg+=quarters>0? quarters +" quarters, ": "";

            dimes = cents / 10; //-->21/10=2 dimes
            cents %= 10; ///21%20=1
            msg+=dimes>0? dimes +" dimes, ": "";

            nickels = cents / 5; //--> 1/5=0 nickels
            cents %= 5; // -->1%5=1 cents
           msg+=nickels>0? nickels+" nickels ": "";
            msg+=cents>0? cents+" pennies, ": "";


            System.out.println(msg);
        } else{
            System.out.println("We cannot process your request");
        }
        System.out.println("-----------------");










            input.close();
    }
}
/*
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, enter your number of pennies:");
        int cents= input.nextInt(); //246
        if (cents>0 && cents<=1200) {
            int dollars, quarters, nickels, dimes;
            String msg = cents + " was converted to ";
            dollars = cents / 100; // -->/100=2 dollars
            cents %= 100;//246%100=46
            quarters = cents / 25; // -->  46/25=1 quarter
            cents %= 25; //--> 46%25=21
            dimes = cents / 10; //-->21/10=2 dimes
            cents %= 10; ///21%20=1
            nickels = cents / 5; //--> 1/5=0 nickels
            cents %= 5; // -->1%5=1 cents
            msg += dollars + " dollars, " + quarters + " dimes, " + dimes + " nickels, " + nickels + " pennies, " + cents;
            System.out.println(msg);
        } else{
            System.out.println("We cannot process your request");
        }
        System.out.println("-----------------");










            input.close();
    }



PennyMachine [scanner, if, operators]

	Create a program that will ask the user to enter the number of pennies they have. Use the number of cents they give and convert them to dollars, quarters, dimes, nickles, and left over pennies. This machine can only handle from 1-1200 cents at a type

	-> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

	-> if the cents are valid print the result in the following format:
		$initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

	Extra challenge: If there is 0 of a specific type do not include it in the final output

 */