import java.util.ArrayList;

public class StudentEntry {
    private String name;
    private char grade;
    private ArrayList courses;

    public StudentEntry(String name, char grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String addCourses(String course){
        courses.add(course);
        return "Course added";
    }

    public ArrayList getCourses(){
        return courses;
    }

    public void removeCourses(String course){
        courses.remove(course);
    }

}
