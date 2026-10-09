import java.time.LocalDate;
import java.time.LocalTime;

public class Aircraft {

    private String flightNumber;
    private LocalTime depatureTime;
    private String destination;
    private int delayTime;

    public Aircraft(String flightNumber, LocalTime depatureTime, String destination) {
        this.flightNumber = flightNumber;
        this.depatureTime = depatureTime;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalTime getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(LocalTime depatureTime) {
        this.depatureTime = depatureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    //DelayTime check
    public void delayTime(int delay){
        this.delayTime=delay;
        this.depatureTime=this.depatureTime.plusMinutes(delayTime);
    }

    public void checkStatus(){
        if(delayTime==0){
            System.out.println("Fight number "+flightNumber+" will arrive on time.");
        } else {
            System.out.println("Fight number "+flightNumber+" is delayed by " +delayTime + " minuts");
        }
    }
}
