package week10_liveSession.earthPackage;

import java.util.Arrays;

public class UseEarthJava {
    public static void main(String[] args) {
        //Earth.northAmerica->how to access the ArrayList
        Earth.northAmerica.add(new Person("James", 30));
        Earth.northAmerica.addAll(Arrays.asList(
                new Person("Anna", 20),
                new Person("Jane", 24)
        ));


    }
}
