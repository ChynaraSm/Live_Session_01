package week6;

public class Variables {

    int z;

    public void m(int z){///this z is local variable

    }

    public static void main(String[] args) {
        Variables obj=new Variables();
        obj.z=10;
        obj.m(5);
        int z=19;//this is a local variable in the main method
    }
}
