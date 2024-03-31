import java.util.Objects;

public class Employee {
    public static int counter;
    private final int id;
    private final String fullName;
    private int deportment;
    private int salary;

    public Employee(String fullName, int deportment, int salary) {
        this.id = ++counter;
        this.fullName = fullName;
        this.deportment = deportment;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getDeportment() {
        return this.deportment;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setDeportment(int deportment) {
        this.deportment = deportment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && deportment == employee.deportment && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, deportment, salary);
    }

    @Override
    public String toString() {
        return "Employee " +
                "id" + id +
                ", fullName:" + fullName +
                ", deportment - " + deportment +
                ", salary = " + salary;
    }
}
