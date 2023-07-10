package week13_FinKeyword_Abstraction.language;
/*
Language [interface, polymorphism, method]

	create an interface Language
	create a constant variable: DEFAULT_ENCODING = "UTF-8";
	create abstract methods: hello() & bye()
	create a static method: description()
		print a message about languages: "Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together"

	create a default method translate(Language l, String msg)
		return: void
		parameters: Language
		use this code: System.out.println("Translating " +  msg + " in " + getClass().getSimpleName() + " into " + l.getClass().getSimpleName());

	create a class English and implement Language
	create a class Spanish and implement Language
	add as many languages as you want
	test the description and translates methods

 */
public interface Language {
    String DEFAULT_ENCODING="UTF-8"; //it is public static final
    public abstract void hello();
    void bye();
   // void m(); // if i add {} then it will give compile error
static void description(){ //because it is static now we have have {} body
    System.out.println("Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together");

}
default void translate(Language lang, String msg){
    System.out.println("Translating " +  msg + " in " + getClass().getSimpleName() + " into " + lang.getClass().getSimpleName());
}


}
