import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println();
        System.out.println("1. Show employee with highest salary");
        System.out.println("2. Hire new employee");
        System.out.println("3. Fire employee");
        System.out.println("4. Print total salary expences");
        System.out.println("5. Print average salary");
        System.out.println("6. Exit");
        System.out.println("Please enter a command number");
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan", "1234", 1200);
        Employee employee2 = new Employee("Dmytro", "1234", 1500);
        Employee employee3 = new Employee("Ihor", "1234", 1500);
        //total salary is 4200

        Company company = new Company("GlobalLogic", "Hrinchenka 1/2", "12345", new Employee[]{employee1, employee2, employee3});

        printMenu();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 6) {
            if (n == 0) {
                printMenu();
                n = in.nextInt();
            }
            switch (n) {
                case 1: {
                    company.printMaxSalaryEmployeeName();
                    n = 0;
                    break;
                }
                case 2: {
                    System.out.println("Enter employee name:");
                    String employeeName = in.next();

                    System.out.println("Enter employee phone:");
                    String employeePhone = in.next();

                    System.out.println("Enter employee salary:");
                    long employeeSalary = in.nextLong();

                    company.hireEmployee(employeeName, employeePhone, employeeSalary);
                    n = 0;
                    break;
                }
                case 3: {
                    System.out.println("Enter employee name:");
                    String name = in.next();
                    company.fireEmployee(name);
                    n = 0;
                    break;
                }
                case 4: {
                    company.printSalaryExpenses();
                    n = 0;
                    break;
                }
                case 5: {
                    company.printAverageSalary();
                    n = 0;
                    break;
                }
            }
        }
    }

}
