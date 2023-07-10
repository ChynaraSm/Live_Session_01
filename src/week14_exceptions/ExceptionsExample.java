package week14_exceptions;

public class ExceptionsExample {
    public static void main(String[] args) throws InterruptedException{

        try{
            String s=null;
            System.out.println(s.length());
        } catch(NullPointerException e) {

            System.out.println("String cannot be null");
            System.out.println("do these steps");
        }
        System.out.println("End");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");


    }
}
