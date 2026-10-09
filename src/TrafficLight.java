public class TrafficLight {

    private String colour;
    private int duration;

    public TrafficLight(String colour, int duration) {
        this.colour = colour;
        this.duration = duration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //method to change the colour
    public void chnageColour(String newColour){
        colour=newColour;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "colour='" + colour + '\'' +
                ", duration=" + duration +
                '}';
    }
}
