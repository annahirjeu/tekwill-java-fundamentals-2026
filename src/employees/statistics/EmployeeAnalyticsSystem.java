//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package employees.statistics;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class EmployeeAnalyticsSystem {

    public static void main(String[] args) {
        List<Employee> employees = generateEmployees(150);
        System.out.println("Total number of employees: " + employees.size());
        employees.forEach(employee -> System.out.println(employee));

        List<Employee> activeEmployees = employees.stream()
                .filter(employee -> employee.isActive())
                .toList();

        List<Employee> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .toList();

        List<Employee> highRatingEmployees = employees.stream()
                .filter(employee -> employee.getPerformanceRating() >= 4.0)
                .toList();

        List<Employee> oldEmployees = employees.stream().filter(employee -> employee.getYearsOfExperience() > 5).toList();

        System.out.println("Total number of active employees: " + activeEmployees.size());
        System.out.println("Total number of employees with salary more than 5000: " + highSalaryEmployees.size());
        System.out.println("Total number of employees with rating more than 4.0: " + highRatingEmployees.size());
        System.out.println("Total number of employees with more than 5 years of experience: " + oldEmployees.size());

        employees.stream()
                .map(employee -> employee.getName())
                .forEach(name -> System.out.println(name));

        List<Employee> sortedEmployeesBySalary = employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .toList();
        sortedEmployeesBySalary.forEach(employee -> System.out.println(employee));

        List<Employee> activeEMployeeWithHightSalary = employees.stream()
                .filter(employee -> employee.isActive())
                .filter(employee -> employee.getSalary() > 5000)
                .toList();

        System.out.println("Total number of active employees with salary more than 5000: " + activeEMployeeWithHightSalary.size());

        double minSalary = employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .min()
                .orElse(0.0);
        double maxSalary = employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .max()
                .orElse(0.0);

        double averageSalary = employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .sum() / employees.size();
/*                .average()
                .orElse(0.0);*/

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        employeesByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println("Employees in department " + department + ":");
            employeesInDepartment.forEach(employee -> System.out.println(employee));
        });

/*        for(Map.Entry<String, List<Employee>> entry : employeesByDepartment.entrySet()){
            System.out.println("Employees in department " + entry.getKey() + ":");
            entry.getValue().forEach(employee -> System.out.println(employee));
        }*/

        employees.stream()
                .filter(employee -> employee.isActive())
                .filter(employee -> employee.getSalary() > 5000)
                .sorted(Comparator.comparing((Employee employee) -> employee.getPerformanceRating())
                        .reversed())
                .toList();

    }

    static List<Employee> generateEmployees(int numberOfEmployees) {
        String[] departments = {"HR", "Engineering", "Sales", "Marketing", "IT"};

        Random random = new Random();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= numberOfEmployees; i++) {
            Employee employee = new Employee(
                    i,
                    "Employee: " + i,
                    departments[random.nextInt(departments.length)],
                    3000 + random.nextInt(9000),
                    1 + random.nextInt(5),
                    1 + random.nextInt(15),
                    random.nextBoolean()
            );
            employees.add(employee);
        }
        return employees;

    }
}