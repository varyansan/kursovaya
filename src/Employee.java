import java.util.Objects;

public class Employee {
    private String fullName;
    private int district;
    private int salary;
    private int id;

    private static int counter = 1;

    public Employee(String fullName, int district, int salary) {
        this.fullName = fullName;
        this.district = district;
        this.salary = salary;
        this.id = counter++;

    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDistrict() {
        return this.district;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return district == employee.district && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, district, salary);
    }

    @Override
    public String toString() {
        return "Работник: " + getFullName() + ". Отдел: " + getDistrict() + ". Зарплата: " + getSalary();
    }
}
