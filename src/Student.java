import java.util.ArrayList;

public class Student {

    private String name;
    private int regno;
    private String nativeTown;

    public Student(String nativeTown, int regno, String name) {
        this.nativeTown = nativeTown;
        this.regno = regno;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getNativeTown() {
        return nativeTown;
    }

    public void setNativeTown(String nativeTown) {
        this.nativeTown = nativeTown;
    }

}
