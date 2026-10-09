import java.time.LocalDate;
import java.time.Period;

public class EmployeeHire {

    private String name;
    private double salary;
    private LocalDate date;

    public EmployeeHire(String name, double salary, LocalDate endDate) {
        this.name = name;
        this.salary = salary;
        this.date = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //methods to calculate service
    public String calculateService(LocalDate date){
        LocalDate d= LocalDate.now();
        Period p= Period.between(d,date);
        return p.getYears()+" Years"+p.getMonths()+" months"+p.getDays()+" days";
    }
}
