package week9_live_session;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {
    public static void main(String[] args) {

        Hobby golf = new Hobby("Golf", 1000, true, false);
        Hobby puzzle = new Hobby("Puzzles", 100, false, false);
        Hobby soccer = new Hobby("Soccer", 200, true, true);
        Hobby chess = new Hobby("Chess", 50, false, true);
        Hobby tennis = new Hobby("Tennis", 300, true, true);
        Hobby bowling = new Hobby("Bowling", 400, false, true);
        Hobby dancing = new Hobby("Dancing", 500, false, true);
        Hobby java = new Hobby("java");

        /*
            Create a separate class to create and test the Hobby objects
        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
         */

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf, puzzle, soccer, chess, tennis, bowling, dancing, java));
        hobbies.addAll(Arrays.asList(
                new Hobby("Ping ping", 200, false, true),
                new Hobby("Volleyball", 100, false, true),
                new Hobby("Swimming", 150)
        ));
        hobbies.add(new Hobby("Drawing"));

        // you can add both ways. create object first and add, or create the object while adding

        System.out.println(hobbies);

        System.out.println("--------------------------");

        for(Hobby each : hobbies){
            each.doIt();
        }

        System.out.println("--------------------------");

        ArrayList<Hobby> outdoors = new ArrayList<>(hobbies);
        ArrayList<Hobby> requireOthers = new ArrayList<>(hobbies);
        ArrayList<Hobby> highCost = new ArrayList<>(hobbies);

        // use p for the lambda variable
        outdoors.removeIf(p -> p.isOutdoors);
//        outdoors.removeIf(p -> !p.isOutdoors); // this removes the indoors ones
        requireOthers.removeIf(hobby -> hobby.requiresOthers);
        highCost.removeIf(obj -> obj.annualCost > 500);
        System.out.println(outdoors);
        System.out.println(requireOthers);
        System.out.println(highCost);

        ArrayList<Hobby> lessThan200Indoors = new ArrayList<>(hobbies);
        lessThan200Indoors.removeIf(p -> p.annualCost > 200 && p.isOutdoors);

        ArrayList<Hobby> outRequire = new ArrayList<>(hobbies);
        outRequire.removeIf(p -> p.requiresOthers && p.isOutdoors);
        System.out.println(outRequire);


    }

}
