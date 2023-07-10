package week6;

public class Address {
   String street;
   String city;
   String state;
   int zipcode;
   String country;

   //setInfo(0 method to initialize
    // we don't want static


    public void setInfo(String street, String city, String state, int zipcode, String country) {
        this.street = street; //reference to current class objects
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String toString(){
        return street +"\n"+city+", "+ street+ "\n"+state+", " +zipcode + "\n"+ country;
    }

}
