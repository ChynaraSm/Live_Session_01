package week13_FinKeyword_Abstraction.exercise;

public class Gym {
/*
create a clas Gyn to test objects and methods
 */
    public static void main(String[] args) {

//        Exercise obj=new Exercise() {} //do not instantiate abstract classes
        Running running =new Running ();
        running.perform();
        System.out.println(running.getCaloriesBurned(60)+" calories burned");

        Bench bench=new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(15)+" calories burned");


    }
}
