package week13_FinKeyword_Abstraction.language;

public class ClassRoom {
    public static void main(String[] args) {

        //Language obj=new Language();
        //cannot instantiate an interface

        English english=new English();
        english.hello();
        english.bye();

        Spanish spanish=new Spanish();
        spanish.hello();
        spanish.bye();
        System.out.println(spanish.DEFAULT_ENCODING);
        System.out.println(Language.DEFAULT_ENCODING);
        //spanish.description();
        //static method is not inherited from interface class
        Language.description();
        english.translate(spanish,"Hello, how are you?");

    }
}
