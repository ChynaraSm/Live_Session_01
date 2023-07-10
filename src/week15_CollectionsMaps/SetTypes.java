package week15_CollectionsMaps;

import java.util.*;

public class SetTypes {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("zebra");
        set1.add("Java");
        set1.add("8");
        set1.add("!hello");
        set1.add(null);
        set1.add("Java");
        set1.add("!hi");
        System.out.println(set1);

        Set<String> set2=new LinkedHashSet<>();
        set2.add("zebra");
        set2.add("Java");
        set2.add("8");
        set2.add("!hello");
        set2.add(null);
        set2.add("Java");
        set2.add("!hi");
        System.out.println(set2);

        //removes duplicate characters from the String

        Set<String> set3 = new TreeSet<>();
        set3.add("zebra");
        set3.add("Java");
        set3.add("8");
        set3.add("!hello");
        //set3.add(null); //null is not allowed tree set
        set3.add("Java");
        set3.add("!hi");
        System.out.println(set3);

        String str="AAABBBBCCCDDDEEEFF";
        //removes duplicate characters from the String

        System.out.println(Arrays.asList(str.split("")));

        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace(", ", "").replace("[","").replace("]",""));

        System.out.println("-----------------");

        Set<String> tabs=new HashSet<>();
        tabs.add("INU01");
        tabs.add("UBNUWB1");
        tabs.add("NIEJ3");

        //you are on tab INU01 and you need to switch to UBNUWB1,, how do you do it

        for(String each : tabs){
            if (each.equals("UBNUWB1")){
                //switch to that tab
            }
        }

    }
}
