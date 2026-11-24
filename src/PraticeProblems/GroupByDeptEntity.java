package PraticeProblems;

public class GroupByDeptEntity {

    private String empName;
    private long empID;
    private double salary;
    private int age;
    private String department;

    public GroupByDeptEntity(String empName, long empID, double salary, int age, String department) {
        this.empName = empName;
        this.empID = empID;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "GroupByDeptEntity{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
