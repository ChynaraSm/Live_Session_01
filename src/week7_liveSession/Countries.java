package week7_liveSession;

import java.util.Arrays;

public class Countries {

    /*
    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

    - Show the countries names in alphabetical order
     */
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States" };
        // find and print all the first and last characters
        for (String country: countries  ) {//country will be each element
            System.out.println(country.charAt(0)+" "+country.toUpperCase().charAt(country.length()-1));
        }
        // find the largest and smallest countries based on the length of their names

        String small=countries [0];
        String large=countries [0];

        for (String each: countries){
            if (each.length()<small.length()){
                small=each;
            }

            if(each.length()>large.length()){
                large=each;
            }
        }
        System.out.println("Shortest country name in the list of given countries: "+ small);
        System.out.println("Longest country name in the list of given countries: "+ large);

        // find country  name that starts with "C"
        String hasC="";
        for (int i = 0; i < countries.length; i++) {// this loop iterates the array
            if (countries[i].startsWith("C")){//if (countries[i].toLowerCase().startsWith("c")){}

                hasC+=countries[i]+ " ";


            }
        }
        System.out.println(hasC);
        String[] hasCArr=hasC.split(" ");
        System.out.println(Arrays.toString(hasCArr));

        String ends="";
        for (String each: countries) {
            if (each.endsWith("s")){//if (countries[i].toLowerCase().endsWith("s")){}
//in the for each loop we used each unlike in for i loop where we would put countries[i]
                ends+=each+ " ";


            }
        }
        System.out.println(ends);
        String[] endsArr=ends.split(" ");
        System.out.println(Arrays.toString(endsArr));

    }

}
