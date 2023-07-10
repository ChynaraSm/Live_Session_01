package week15_CollectionsMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBExample {
    /*
    FIRST_NAME
    LAST_NAME
    ADDRESS
     */

    public static void main(String[] args) {
        Map<String, String> person1=new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("address", "007 M16 Lane");

        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String, String>> allPeople=new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME", "perry", "LAST_NAME", "Brian", "Address", "Kale lane"));//to make a map quickly
        System.out.println(allPeople);
        //what is the element of the list?? Map of String , String
        //mini task: Last Name of everyone

        for ( Map<String, String> map: allPeople){
            System.out.println(map.get("LAST_NAME"));
        }






    }


}
