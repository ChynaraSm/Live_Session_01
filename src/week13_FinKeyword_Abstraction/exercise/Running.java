package week13_FinKeyword_Abstraction.exercise;

import week13_FinKeyword_Abstraction.exercise.Exercise;

public final class Running extends Exercise {
    /*
    create a class Running inherit the Exercise and implement the abstract methods
    for calories return minutes *15
     */


    @Override
    public void perform() {
        System.out.println("running");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*15;
    }
}
