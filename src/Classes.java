public class Classes {
    private String className;
    private char section;
    private String facultyIncharge;

    public Classes(String className, char section, String facultyIncharge) {
        this.className = className;
        this.section = section;
        this.facultyIncharge = facultyIncharge;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getFacultyIncharge() {
        return facultyIncharge;
    }

    public void setFacultyIncharge(String facultyIncharge) {
        this.facultyIncharge = facultyIncharge;
    }
}
