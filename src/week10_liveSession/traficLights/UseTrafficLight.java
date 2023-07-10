package week10_liveSession.traficLights;

public class UseTrafficLight {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight("red");
        System.out.println(trafficLight.getColor());
        trafficLight.setColor("brown");
        System.out.println(trafficLight.getColor());
        trafficLight.setColor("green");
        System.out.println(trafficLight.getColor());

        System.out.println("-----");

        System.out.println(new TrafficLight("hello").getColor());  // creating an object without a reference and accessing the colors getter

    }
}
