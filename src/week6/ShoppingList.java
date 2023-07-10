package week6;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String add="";
        String list="";
        int attempts=3;
        do{
            System.out.println("What item do you want to add to the list?");
            list+="\n\t* "+input.nextLine();
            System.out.println("Do you want to add more items?");
            add=input.nextLine();
            //this loop this bellow is for invalid responses, allows for trying to ask
            while(attempts > 0 && (!add.equalsIgnoreCase("yes") && !add.equalsIgnoreCase("no"))){
                System.out.println("Sorry did you want to add more items, yes or no");
                add=input.nextLine();
                attempts--;
            }

        } while (add.equalsIgnoreCase("yes"));
        System.out.println(list);

input.close();

    }
}
