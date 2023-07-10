package week15_CollectionsMaps;

import java.util.*;

public class MapTYpe {
    public static void main(String[] args) {

        Map<Integer, Person> residents=new LinkedHashMap<>();
        residents.put(1,new Person("Erik",21));
        residents.put(2,new Person("Elleie",30));
        residents.put(3,new Person("Helen",25));
        residents.put(2,new Person("Jane",31)); //keys are unique

        System.out.println(residents);

        for (int key : residents.keySet()){//keySet returns a set of keys
            // unbox
            System.out.println("In apartment "+key+" "+residents.get(key).name+" lives there");

        }

        System.out.println("_______________________________________");

        //key: String -continent, value: List of Strings-Countries
        Map <String, List<String>> continent=new HashMap<>();

        continent.put("North America", new ArrayList<>(Arrays.asList("US", "Canada", "Mexico")));
        continent.put("Europe", new ArrayList<>(Arrays.asList("Spain", "France", "Germany", "Monaco", "Kosovo")));
        continent.put("Asia", new ArrayList<>(Arrays.asList("China", "Korea", "Japan", "Pakistan")));

        for(Map.Entry<String, List<String>> each:continent.entrySet()){
            System.out.println("Continent: "+each.getKey());
            System.out.println("\tCountries: "+each.getValue());
        }

        //mini task: print the first and last letter of each country

        for (List<String> each : continent.values()){// the value are list String
            for (String eachCountry :each ){//iteration through the List<String>
                System.out.println(eachCountry.substring(0,1)+eachCountry.toUpperCase(Locale.ROOT).charAt(eachCountry.length()-1));
            }
        }

        continent.get("Europe").add("UK");//gets the List of Europe and adds the UK element into that List //updating array list
        System.out.println(continent);

    }
}
