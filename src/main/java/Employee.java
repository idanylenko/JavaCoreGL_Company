public class Employee {
    private String name;
    private String phone;
    private long salary;

    Employee(String name, String phone, long salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    long getSalary() {
        return salary;
    }
}
