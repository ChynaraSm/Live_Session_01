package week6;

import java.util.Scanner;

public class Bot {
/*
/*
    Bot [while, Scanner, conditional]

    create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

    user says | >bot responds

    hello | > world
    what is your age | > I was programmed in March
    who created you | > I was created by Saim (use your name)
    what can we talk about | > print a menu of the options the bot can respond to

    off | > haha you cannot turn me off I am invincible
    shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)
     */
public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    boolean run=true;
    System.out.println("Hello. I am the Cydeo chat bot");
    while(run){

        System.out.println("> ");//arrow for to type
        String userInput=input.nextLine().toLowerCase().trim();

        switch(userInput){
            case "hola":
            case "privet":
            case "hello":
                System.out.println("world");
                break;
            case "what is your age":
            case "age":
                System.out.println("I was programmed in March");
                break;
            case "time":
            case "what time is it":
                System.out.println("look at the clock or check your wrist watch");
                break;
            case "who created you":
            case "how":
                System.out.println("I was created by Chynara");
                break;
            case "how old am I":
                System.out.println("if you are boy then 9 years old. if you girl you are 12 years old");
                break;
            case "what is your name":
                System.out.println("my name is mind reader, just kidding Cydeo chat bot");
                break;
            case "what we can talk about":
                System.out.println("I will respond to these:\n\t hello\n\t what time is it\n\t what is your age\n\t who created you\n\t off");
                break;
            case "off":
                System.out.println("haha you cannot turn me off. I am invincible");
                break;
            case "shutdown":
                System.out.println("SHUTTING DOWN");
                run=false;
                break;
            default:
                System.out.println("Sorry I cannot compute that");
        }

    }
    input.close();


}




}
