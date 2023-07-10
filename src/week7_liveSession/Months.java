package week7_liveSession;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hello, enter the month number 1~12");

        int month=input.nextInt();
        input.close();

        if (month>=1 && month<=12){
            String[] data={"January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December" };
            System.out.println(data[month-1]);
        }else{
            System.out.println("Sorry "+month+ " is not a valid month number");
        }




    }
}
