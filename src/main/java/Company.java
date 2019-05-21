import java.util.Arrays;

public class Company {

    private String name;
    private String address;
    private String phone;
    public Employee[] employees;

    public Company(String name, String addess, String phone, Employee[] employees) {
        this.name = name;
        this.address = addess;
        this.phone = phone;
        this.employees = employees;
    }

    public void printMaxSalaryEmployeeName() {

        long max = 0;
        String employeeMaxSalaryName = "";

        for (Employee employee : employees) {
            if (employee.getSalary() == max) {
                employeeMaxSalaryName += "," + employee.getName();
            }

            if (employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalaryName = employee.getName();
            }

        }
        System.out.println(employeeMaxSalaryName);
    }

    public void hireEmployee(String name, String phone, long salary) {
        long minSalary = 1000;

        if (salary < minSalary) {
            System.out.println("Employee salary should be higher than 1000");
            return;
        }
        Employee newEmployee = new Employee(name, phone, salary);

        int n = employees.length;
        Employee[] moreEmployees = Arrays.copyOf(employees,(n+1));
        moreEmployees[n] = newEmployee;
        this.employees = moreEmployees;
    }

    public void fireEmployee(String name) {

        int indexOfFiredEmployee = 0;
        Employee[] lessEmployees = new Employee[employees.length - 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                indexOfFiredEmployee = i;
            }
        }

        System.arraycopy(employees,0,lessEmployees,0,indexOfFiredEmployee);
        System.arraycopy(employees,indexOfFiredEmployee + 1,lessEmployees,indexOfFiredEmployee,employees.length - 1 - indexOfFiredEmployee);

        this.employees = lessEmployees;
    }

    public void printSalaryExpenses() {
        long salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }
        System.out.println(salaries);
    }

    public void printAverageSalary() {
        long salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }
        System.out.println(salaries / employees.length);
    }

}



