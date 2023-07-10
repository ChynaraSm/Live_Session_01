package week3;

public class FINRA {
    public static void main(String[] args) {
        int num=15;
        boolean by3=num%3==0;
        boolean by5=num%5==0;

        String print="";
        if (by3 && by5){
            print="FINRA";
        }else if(by3){
            print="FIN";
        }else if(by5){
            print="RA";
        }else{
            print="not printable";
        }
        System.out.println(print);
    }
}
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3  output:  FIN
                number = 10 output:  RA
            	number = 15 output:  FINRA
 */
