package week14_exceptions.bank;
//this class it is user /person who would use this banl code
public class UseBank {

    public static void main(String[] args) {

        Bank bank=new Bank(1000, 13124124);
        bank.withdraw(400);

        System.out.println(bank.getBalance());
        bank.withdraw(300);//had unchecked exceptions would occur druting runtime

        Bank bank2=new Bank(0,0);
        try {
            bank2.setBalance(-100);
        } catch (CannotBeNegativeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("END");


    }
}
