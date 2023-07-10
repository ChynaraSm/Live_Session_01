package week6;

public class Palindrome {
    /*
    [IQ] Palindrome [method, String, loop]

    create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
    A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, it can be thought as the reverse of a word being the same as the original word

        Ex:
            racecar
            true

            anna
            true

            abc
            false

            abcba
            true
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    //begin =0-->1 ->2->3
    //end =6->5->4  in example racecar
    public static boolean isPalindrome(String str){
        for (int begin=0, end =str.length()-1; begin<str.length()/2;begin++, end--){
            str.charAt(begin);
            str.charAt(end);
            if (str.charAt(begin) !=str.charAt(end)){
                return false;
            }
        }
        return true;

    }

}
