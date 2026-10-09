public class StudentEntryMain {
    static void main() {
        StudentEntry se = new StudentEntry("Murugan Ramalingam",'B');
        StudentEntry se1 = new StudentEntry("Ramalingam",'A');
        se.addCourses("English");
        se.addCourses("Tamil");
        se.addCourses("Maths");
        System.out.println(se.addCourses("Biology"));
        System.out.println(se.getName()+"    "+se.getGrade()+"  "+se.getCourses());

    }
}
