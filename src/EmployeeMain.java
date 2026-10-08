public class EmployeeMain {
    static void main() {

        Employee e= new Employee("Mr.R.Murugan","Senior Software Developer",100000);
        Employee e1 = new Employee("Mr.S.Santhosh Kumar","Senior Civil Engineer",2000000);

        System.out.println("Before salary hike for Employee e");
        e.printEmployeedeatils();
        System.out.println("Before salary hike for Employee e1");
        e1.printEmployeedeatils();
        Employee.raiseSalary(8);
        Employee.raiseSalary(12);
        System.out.println("After salary hike for Employee e");
        e.printEmployeedeatils();

        System.out.println("After salary hike for Employee e1");
        e1.printEmployeedeatils();
    }
}
