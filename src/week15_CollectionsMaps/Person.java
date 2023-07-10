package week15_CollectionsMaps;


public class Person{
    /*
    - Create a class Person

        define these instance variables:
            name, age
     */
    public String name;
   public  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + " : " + age;
    }
}
