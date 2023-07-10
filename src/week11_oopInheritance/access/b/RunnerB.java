package week11_oopInheritance.access.b;

public class RunnerB {
    public static void main(String[] args) {

        Mac obj=new Mac();
        System.out.println(obj.os);
      //  System.out.println(obj.memory);// protected is inherited in subclasses, but not accessed directly. see Mac class for inheritance part
        // System.out.println(obj.brand);// this was default, in a different package
        // System.out.println(obj.hasWifi); //this was private, only within class has access

    }
}
