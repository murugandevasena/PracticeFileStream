import java.util.Date;

public class Teachers {

    private  String staffName;
    private int age;
    private Date joiningDate;
    private int experienceYears;

    public Teachers(String staffName, int age, Date joiningDate, int experienceYears) {
        this.staffName = staffName;
        this.age = age;
        this.joiningDate = joiningDate;
        this.experienceYears = experienceYears;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
