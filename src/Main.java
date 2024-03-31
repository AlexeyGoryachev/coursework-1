public class Main {
    public static
    Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("John Owl", 1, 100000);
        employees[1] = new Employee("Frank Monkey", 1, 90000);
        employees[2] = new Employee("Jimmy Lion", 2, 80000);
        employees[3] = new Employee("Lindsey Cobra", 2, 70000);
        employees[4] = new Employee("Samuel Tiger", 3, 60000);
        employees[5] = new Employee("Helen Cat", 3, 55000);
        employees[6] = new Employee("Ronald Dog", 4, 50000);
        employees[7] = new Employee("Harry Sheep", 4, 45000);
        employees[8] = new Employee("Henry Wolf", 5, 40000);
        employees[9] = new Employee("Elsa Hamster", 5, 35000);

        printEmployeesList();
        System.out.println("Сумма зарплат всех сотрудников = " + getSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата = " + getAverageSalary());
        printEmployeesFullNames();
    }

    private static void printEmployeesList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double getAverageSalary() {
        return (double) getSalarySum() / employees.length;
    }

    public static void printEmployeesFullNames() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника: " + employee.getFullName());
        }
    }
}