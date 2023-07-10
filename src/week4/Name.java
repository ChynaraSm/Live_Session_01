package week4;

import java.util.Scanner;

/*
Name [Scanner, String methods]

	Create a program that will ask the user to enter their name. The name should be accepted as (first name + space + last name). The program will not be able to handle any other format

	Take the name and do two things:
		1) Print the name in correct formatting meaning the first letter of the first name and last name would be uppercase and the rest will be lowercase

		2) Print the initials of the person
 */
public class Name {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first and last name:");
        String name=input.nextLine();// ex. james bond
        name=name.toLowerCase();
        int spaceIndex=name.indexOf(' ');// here is ind=5, ascii char of ' '-->32(ascii of space
        String firstName=name.substring(0,spaceIndex);
        String lastName=name.substring(spaceIndex+1);
        //String upperFirst=name.substring(0,1).toUpperCase(); // (""+nam.charAt(0))
        firstName=name.substring(0,1).toUpperCase()+firstName.substring(1);
        String lastNameChar=lastName.substring(0,1);
        lastNameChar=lastNameChar.toUpperCase();
        lastName=lastNameChar+lastName.substring(1);

        System.out.println(firstName+"\n"+lastName);
        System.out.println(firstName.substring(0,1)+lastName.substring(0,1));

    }
}
