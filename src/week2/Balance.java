package week2;

public class Balance {
    public static void main(String[] args) {
        int balance=1000,
                withdrawAmount=1300,
                overdraftPercent=20;
        balance -=withdrawAmount;//same as line balance=balance-withdrawAmount


        if (balance<0){
            System.out.println("Withdrew more than you have in the account. Overdraft applied");
            balance-=(balance*0.2);
        }
        System.out.println("Total balance = " + balance);
    }
}
