import java.time.LocalTime;

public class AircraftMain {
    static void main() {
        Aircraft a = new Aircraft("1", LocalTime.of(10,30),"Sydney");
        Aircraft a1 = new Aircraft("2", LocalTime.of(2,15),"Chennai");
        a.delayTime(30);
        a.checkStatus();


    }
}
