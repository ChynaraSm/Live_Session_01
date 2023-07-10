package week8_liveSession;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {
    /*
   CountChar [ArrayList, String, loop]

   Create a program that defines an ArrayList of Strings and a char letter. Find how many times the given char letter is found in the words defined in the ArrayList

       Ex:
       Input:
           "java", "html", "css", "java", "javascript", "selenium"
           letter: ‘a’
       Output:
           6
    */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        System.out.println(countCharInList(list,'a'));
        System.out.println(countCharInList(list,'s'));
        System.out.println(countCharInList(list,'j'));

    }

    public static int countCharInList(ArrayList<String> list, char letter){
        int count=0;//this is outside of the loop because we need to keep track of of the one character not the most frequent character

        for(String eachWord : list){
            for(char eachLetter : eachWord.toCharArray()){
                if(eachLetter==letter){
                    count++;
                }
            }
        }
        return count;
    }
}
