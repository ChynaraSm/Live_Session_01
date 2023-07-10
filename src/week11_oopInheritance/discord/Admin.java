package week11_oopInheritance.discord;

public class Admin extends DiscordUser {
 /*
            - Admin class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Admin, name, id)

        - create method:
            createChannel()
                Example output: prints Creating new discord channel

        - override the sendMessage() to print: "Sending announcement"

     */

    public Admin(String name, int id){
        super("Admin",name,id);
    }



    public void createChannel(){
    System.out.println("Creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }
    public void sendMessage(String channel){ //overloading method
        System.out.println("Sending message to "+ channel);
    }
}
