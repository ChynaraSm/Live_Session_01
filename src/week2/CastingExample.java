package week2;

public class CastingExample {
    public static void main(String[] args) {
        int i=30;
        long l=(long)i; //it is grey because it is not necessary

        long l2=100;// long l2=100l==> l is redunt because we going from small to bigger
        byte b2=(byte)l2;//we added (byte) because we are going from big datatype to smaller datatype

        double d3=15.99;
        int i3=(int)d3;
        System.out.println(i3);//printed 15 because we changed into int

        int i4=1_000_000;
        byte b4=(byte)i4;//byte can't hold this number, there is data loss therefore printed 64 instead of 1_000_000
        System.out.println(b4);
        System.out.println("-------");

        //float f5=10.23; //trying to store double into a float
        float f5=10.23F;
        int i5=(int)f5;
        System.out.println((double)i5);//adding decimal10.0 but we lost 0.23

        char letter='A';
        System.out.println((int)letter);

        char letter2=66;
        System.out.println(letter2);//printed letter"B"

    }
}
