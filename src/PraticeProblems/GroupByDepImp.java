package PraticeProblems;

import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByDepImp {
    static void main() {
        GroupByDeptEntity g1= new GroupByDeptEntity("Murugan",12345,120000,41,"R&D");
        GroupByDeptEntity g2= new GroupByDeptEntity("Alli",12344,500000,32, "R&D");
        GroupByDeptEntity g3= new GroupByDeptEntity("Ramasaran",12343,75000,32,"Accounting");
        GroupByDeptEntity g4= new GroupByDeptEntity("Hariharasudhan",12342,50000,39,"Network Division");
        GroupByDeptEntity g5= new GroupByDeptEntity("Rajan",12341,98000,52,"Fire and safety Check");
        GroupByDeptEntity g6= new GroupByDeptEntity("SriRangaRajan",12340,10000,55,"Fire and safety Check");

        List<GroupByDeptEntity> lsemp= Arrays.asList(g1,g2,g3,g4,g5,g6);

        //Group Employees by their department

        Map<String,List<GroupByDeptEntity>> lsOut = lsemp.stream().collect(Collectors.groupingBy(GroupByDeptEntity::getDepartment));
        System.out.println("Grouping by department: "+ lsOut.entrySet());

        //Find highest-paid employees

        GroupByDeptEntity gt1 = lsemp.stream().skip(1).max(Comparator.comparing(GroupByDeptEntity::getSalary)).get();
        System.out.println("Highest paid employee: "+gt1);

        //find the second highest salary
        GroupByDeptEntity gt2 = lsemp.stream().max(Comparator.comparing(GroupByDeptEntity::getSalary)).get();
        System.out.println("Highest paid employee: "+gt2);

        //Find the average salary of all employees

        double avgSalary = lsemp.stream().collect(Collectors.averagingDouble(GroupByDeptEntity::getSalary));
        System.out.println("average salary of all employees :"+String.format("%.2f",avgSalary));

        //find highest paid employee in each department

        Map<String, Optional<GroupByDeptEntity>> msHighest = lsemp.stream().collect(Collectors.groupingBy(GroupByDeptEntity::getDepartment ,Collectors.maxBy(Comparator.comparing(GroupByDeptEntity::getSalary))));
        System.out.println("Find highest paid employee: "+msHighest);
    }
}
