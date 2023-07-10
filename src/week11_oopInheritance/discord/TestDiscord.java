package week11_oopInheritance.discord;

public class TestDiscord {
    public static void main(String[] args) {
        Student obj=new Student("James",7, 100);
        obj.sendMessage();
        obj.sendMessage("Anna");
        DiscordUser.launch();
        Student.launch();
    }
}
