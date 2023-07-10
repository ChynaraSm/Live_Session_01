package week5_withSaim;

public class OverloadingExample {


    public static int add(int a, int b){
        return a+b;
    }
    //this is valid
    public static double add(double a, double b){
        return a+b;
    }

    //public static float add(int c, int d) {//this is invalid

    //}
    public static float add(String s){
        //return value has to match return method but parameter and return method doesn't have to match
        return 0.0f;
    }
    //public static String m(int a){

   // }
    //public static char m2(float f){

    //}
}
