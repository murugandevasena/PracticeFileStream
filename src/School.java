import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;

    private List<Teachers> teachers;

    private  List<Classes> classes;

    public School(List<Student> students, List<Teachers> teachers, List<Classes> classes) {
        this.students = students;
        this.teachers = teachers;
        this.classes = classes;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public  void removeStudent(Student student){
        students.remove(student);
    }

    public void addTeachers(Teachers teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(Teachers teacher){
        teachers.remove(teacher);
    }

    public void addClasses(Classes cla){
        classes.add(cla);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}
