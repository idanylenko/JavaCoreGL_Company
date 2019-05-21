
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan", "1234", 1200);
        Employee employee2 = new Employee("Dmytro", "1234", 1500);
        Employee employee3 = new Employee("Ihor", "1234", 1500);
        //total salary is 4200

        Company company = new Company("GlobalLogic", "Hrinchenka 1/2", "12345", new Employee[]{employee1, employee2, employee3});

        company.printSalaryExpenses();
        company.hireEmployee("Julia","123",2000);
        company.printSalaryExpenses();
        company.fireEmployee("Ivan");
        company.printSalaryExpenses();
    }
}
