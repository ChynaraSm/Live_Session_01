package week13_FinKeyword_Abstraction.language;

public class Spanish implements Language {
    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
