package week11_oopInheritance.discord;

public class Student extends DiscordUser {
/*
        - Student class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Student, name, id)

        - overload the sendMessage(String name) to accept a String for the chat name
            print Sending message to $name
     */
    int loveForJava;

    public Student(String name, int id, int loveForJava){
        super("Student", name, id);
        this.loveForJava=loveForJava;
    }
    public void sendMessage(String name){
        System.out.println("Sending message to "+name);
    }
/*
    @Override
    public void sendMessage() {
        System.out.println("asjhjj");
    }*/

    public static void launch(){
       System.out.println("Student is opening");
    }


}
