//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package employees.statistics;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private double performanceRating;
    private int yearsOfExperience;
    private boolean active;

    public Employee(int id, String name, String department, double salary, double performanceRating, int yearsOfExperience, boolean active) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.performanceRating = performanceRating;
        this.yearsOfExperience = yearsOfExperience;
        this.active = active;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", performanceRating=" + performanceRating + ", yearsOfExperience=" + yearsOfExperience + ", active=" + active + '}';
    }
}