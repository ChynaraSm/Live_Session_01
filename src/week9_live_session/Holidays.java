package week9_live_session;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {

    public static ArrayList<LocalDate> getHolidays(){
        ArrayList<LocalDate> holidays=new ArrayList<>(Arrays.asList(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 16),
                LocalDate.of(2023, 2, 20),
                LocalDate.of(2023, 4, 9),
                LocalDate.of(2023, 4, 16),
                LocalDate.of(2023, 5, 29),
                LocalDate.of(2023, 6, 19),
                LocalDate.of(2023, 7, 4),
                LocalDate.of(2023, 9, 4),
                LocalDate.of(2023, 10, 9),
                LocalDate.of(2023, 11, 10),
                LocalDate.of(2023, 11, 23),
                LocalDate.of(2023, 12, 25)
        ));
        return holidays;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What month do you want to check the dates for? (num)");
        int inputMonth=input.nextInt();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM - d, y");

        for(LocalDate eachDate : getHolidays()){ // iterates through all the LocalDate objects
            if(eachDate.getMonthValue() == inputMonth){
                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MMMM d, yy")));
//                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MMM d, yyyy")));
//                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MM/d/yy")));
            }
        }


    }


}
/*
Holidays [LocalDate, ArrayList, methods]

	Create a method that will return an ArrayList made of LocalDate that represent federal holidays from the current year. Use the following sample data:

        1/1/2023
        1/16/2023
        2/20/2023
        4/9/2023
        4/16/2023
        5/29/2023
        6/19/2023
        7/4/2023
        9/4/2023
        10//9/2023
        11/10/2023
        11/23/2023
        12/25/2023

	Note: if you are not comfortable making it a method then create it in the main method

	Bonus: Create separate ArrayLists of the dates based on the season they are a part of
		- format all the dates with your own pattern
 */