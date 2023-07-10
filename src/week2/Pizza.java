package week2;

public class Pizza {
    public static void main(String[] args) {
        String type="Cheese";
        int slices=2,
                people=5;
        int num_slicesPerPerson=slices/people;
        int remainder=slices%people;
        String summary="We ordered a "+type + " pizza with "+ slices+" slices. "+ people +" people ate "+(slices/people)+ " slices each, there was "+(slices%people)+ " slices left";
        //System.out.println("We ordered a "+type+" pizza with "+slices+"slices. "+people+" people ate "+num_slicesPerPerson+" slices each, so there was "+remainder+" slices left");
        System.out.println(summary);
    }
}
