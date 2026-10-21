import java.time.LocalDate;
import java.util.*;

public class SchoolMain {
    static void main() {
        Student student =new Student("Ramsaran",1,"Jayankondam");
        Student student1 =new Student("DeepthiShree",2,"Kazhuvanthondi");
        Student student2 =new Student("Ragav",21,"Sendurai");

        List<Student> listStudent= new ArrayList<>();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);
        Date localDate = new Date(2024,8,19);
        Date localDate1 = new Date(2020,5,1);
        Date localDate2 = new Date(2025,6,5);
        Teachers teachers =new Teachers("Mrs.Mary",32,localDate,6);
        Teachers teachers1 =new Teachers("Mr.Sambath",41,localDate1,16);
        Teachers teachers3 =new Teachers("Mr.RajaRathinam",36,localDate2,10);
        List<Teachers> listTechers=new ArrayList<>();
        listTechers.add(teachers);
        listTechers.add(teachers1);
        //listTechers.add(teachers3);
        Classes cla= new Classes("Third",'A',"Mr.PremAnand");
        Classes cla1= new Classes("First",'B',"Mrs.Alli");
        Classes cla2= new Classes("Second",'C',"Mrs.Divya");
        List<Classes> listClasses= new ArrayList<>();
        listClasses.add(cla);
        listClasses.add(cla1);
        listClasses.add(cla2);
        School school=new School(listStudent,listTechers,listClasses);
        Student student3 =new Student("Ranjani",31,"Rayampettai");
        System.out.println("Before altering:"+school);

        school.addStudent(student3);
        school.removeStudent(student);
        school.addTeachers(teachers3);
        for(Student st:listStudent){
            System.out.println("List of students:"+st.getName()+"  "+st.getRegno()+" "+st.getNativeTown());
        }
    }
}
