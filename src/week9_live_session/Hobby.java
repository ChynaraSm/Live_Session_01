package week9_live_session;

public class Hobby {
    /*
    Hobby [classes, constructors, ArrayList]
    create a class called Hobby
    	instance variables:
    		name, annual cost, is outdoors (boolean), requires others (boolean)
     */

    public String name;
    public double annualCost;
    public boolean isOutdoors;
    public boolean requiresOthers;

    /*
      constructors
			- create a constructor that creates a Hobby object with the name
			- create a constructor that creates a Hobby object with the name and annual cost
			- create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
     */

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    /*
            - methods:
            - doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 1000, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside
            - toString()
                print all the Hobby information
     */

    public void doIt(){
        System.out.println("Doing " + name + (isOutdoors ? " outside" : " inside"));
    }

    public String toString() {
        return "\nHobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
