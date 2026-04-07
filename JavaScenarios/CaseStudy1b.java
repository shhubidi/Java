class Employee {
    public String name;
    public double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary + (0.05 * baseSalary);
    }
}

class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary += 2000;
        return salary;
    }
}

class Executive extends Manager {

    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary += 0.10 * baseSalary;
        return salary;
    }
}

public class CaseStudy2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 10000);
        Employee e2 = new Manager("Bob", 10000);
        Employee e3 = new Executive("Charlie", 10000);

        System.out.printf("TC1 Output: %.2f\n", e1.calculateSalary());
        System.out.printf("TC2 Output: %.2f\n", e2.calculateSalary());
        System.out.printf("TC3 Output: %.2f\n", e3.calculateSalary());
    }
}