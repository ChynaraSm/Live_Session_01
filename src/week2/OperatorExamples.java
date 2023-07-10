package week2;

public class OperatorExamples {
    public static void main(String[] args) {
        int age=10;
        age++;
        System.out.println(age);// print 11
        System.out.println(age++);//age is variable , we going to see 11 because current value is 11 and then updates it
        System.out.println(age);

        int num=5;
        System.out.println(++num);// it updates first and then print
        System.out.println(num++);//it first it will print and then add 1
        System.out.println(num);
        System.out.println("---------");
        int x=15;//it was updated into 16
        int y=x++;//15
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("---------");

        int z=90;
        int w=--z;//because this is a predecrement we subtract 1 right away
        System.out.println("z = " + z);//z=90-->89
        System.out.println("w = " + w);//w=89\

        System.out.println("---------");

        int a=3;
        int b=5;
        a++;
        int c=a+b;
        /*
        a++;
        int c=a+b
        is the same
        int c=++a+b
         */
        System.out.println("c = " + c);
    }
}
