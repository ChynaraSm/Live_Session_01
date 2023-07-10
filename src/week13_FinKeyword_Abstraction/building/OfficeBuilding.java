package week13_FinKeyword_Abstraction.building;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying the lease");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Going to floor "+numberOfFloors);
    }

    @Override
    public String toString() {
        return super.toString() + ", number of floorsResidents " +numberOfFloors;
    }
}
