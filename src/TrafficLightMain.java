public class TrafficLightMain {
    static void main() {

        TrafficLight trafficLight=new TrafficLight("RED",30);
        System.out.println(trafficLight.getColour()+" "+trafficLight.getDuration());
        //clour change method
        trafficLight.chnageColour("YELLOW");
        System.out.println(trafficLight.getColour()+" "+trafficLight.getDuration());
    }
}
