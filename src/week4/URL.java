package week4;

import java.util.Scanner;

public class URL {
    /*
    Url [Scanner, String methods, conditional]

	Create a program that will allow the user to enter a url. The program will verify if the given url is valid and if it is print the domain name

	A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

	If the url is valid print the domain name part: $url is a valid url for google

		ex: www.google.com
			www.google.com is a valid url for google

	If the url is not valid print the reason it is not valid:

		ex: amazon.com
		Sorry, amazon.com is not valid because it is missing these:
			www. in the beginning

		ex: youtube
		Sorry, youtube is not valid because it is missing these:
			www. in the beginning
			.com, .org, .edu, or .gov in the end

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your URL:");
        String url=input.next();

        boolean validStart=url.startsWith("www");
        boolean validEnd=url.endsWith(".com")||url.endsWith(".org")||url.endsWith(".edu")||url.endsWith(".gov");

        if (validStart && validEnd){
        System.out.println(url+" is valid url for "+url.substring(url.indexOf(".")+1, url.lastIndexOf(".com")));
  /*
                or broken into steps:
                int startIndexOf(".");
                String domain=url.substring(startIndex,endIndex);
                print(url+ "is valid url for "+domain;
                 */
        } else {
            System.out.println("Sorry, "+url+"+ is not valid it is missing these:");
            if(!validStart){
                System.out.println("www. in the beginning");
            }
            if (!validEnd){
                System.out.println("com, .org, .edu, or .gov in the end");
            }
        }
                input.close();
    }
}
