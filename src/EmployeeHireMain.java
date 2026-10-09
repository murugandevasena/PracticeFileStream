import java.time.LocalDate;

public class EmployeeHireMain {
    static void main() {
        LocalDate joingDate= LocalDate.of(2024,8,19);
        EmployeeHire employeeHire=new EmployeeHire("Murugan",40000,joingDate);
        employeeHire.calculateService(joingDate);
        System.out.println(employeeHire.calculateService(joingDate));
    }
}
