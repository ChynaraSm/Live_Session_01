package week4;

import java.util.Scanner;

public class MiddleCharacters {
    /*
    MiddleCharacters [indexes, cases, length]
	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase
	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)
	Ex:
		input:
			apple
		output:
			apPle
		input:
			JavA
		output:
			jAVa
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.nextLine();//input.next().toLowerCase();
        input.close();
        int wordLength=word.length();
        word=word.toLowerCase();
        int middleIndex=word.length()/2;
        String firstPart, middlePart, lastPart;
        if (wordLength%2==0){
            firstPart=word.substring(0,middleIndex-1);
            middlePart=word.substring(middleIndex-1,middleIndex+1);
            middlePart=middlePart.toUpperCase();
            lastPart=word.substring(middleIndex+1);

        } else{
            firstPart=word.substring(0,middleIndex);
            middlePart=""+word.charAt(middleIndex);//word.substring(middleIndex+1)
            middlePart=middlePart.toUpperCase();
           lastPart=word.substring(middleIndex+1);

        }
        System.out.println(firstPart+middlePart+lastPart);
    }
}
