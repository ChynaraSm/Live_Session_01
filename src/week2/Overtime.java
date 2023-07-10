package week2;

public class Overtime {
    public static void main(String[] args) {
        double hourlyRate$ = 50.0,
                hoursWorked = 48;
        double netPay = hourlyRate$ * hoursWorked;

        String message;


        if (hoursWorked >40) {
            double overtimeHours=hoursWorked-40;
            netPay=hourlyRate$*40;//your normal pay from 40 hours
            netPay+=hourlyRate$*1.5*overtimeHours;// for overtime ypu get paid 1.5 times your rate
            message="Wow you worked "+hoursWorked+" so you get "+overtimeHours+ " hours of overtime. Your net pay is $"+netPay;


        } else {//worked less than or equal to 40 hours

            netPay=hourlyRate$*hoursWorked;
            message ="You worked "+hoursWorked+ " hours, so your total net pay is: $"+ netPay;

        }
        System.out.println(message);
    }
}
