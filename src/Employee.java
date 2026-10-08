public class Employee {

    private String name;
    private String job_title;
    private static double salary;

    public Employee(String name, String job_title, double salary) {
        this.name = name;
        this.job_title = job_title;
        Employee.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        Employee.salary = salary;
    }

    public static void raiseSalary(int i){
        salary=salary+salary*i/100;
    }

    public void printEmployeedeatils(){
        System.out.println("Employee name:"+name);
        System.out.println("Employee Title:"+job_title);
        System.out.println("Employee salary:"+salary);
    }
}
