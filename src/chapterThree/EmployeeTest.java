package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Doe", 6000);

        System.out.printf("Employee %s %s's yearly salary is $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getMonthlySalary());
        System.out.printf("Employee %s %s's yearly salary is $%.2f%n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getMonthlySalary());

        // Get yearly salary

        System.out.printf("Employee %s %s's yearly salary is $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("Employee %s %s's yearly salary is $%.2f%n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.printf("Employee %s %s's yearly salary after a 10%% raise is $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("Employee %s %s's yearly salary after a 10%% raise is $%.2f%n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getYearlySalary());
    }
}
