public class Main {

    public static Employee createdEmployee(String fullName, int district, int salary) {
        Employee employee = new Employee(fullName, district, salary);
        return employee;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createdEmployee("Петров Александр Сергеевич", 4, 93410);
        employees[1] = createdEmployee("Алексеева Надежда Викторовна", 1, 84960);
        employees[2] = createdEmployee("Андреев Вадим Владимирович", 3, 79100);
        employees[3] = createdEmployee("Сухова Светлана Адамовна", 2, 97000);
        employees[4] = createdEmployee("Леонтьев Родион Викторович", 5, 69320);
        employees[5] = createdEmployee("Казанцева Лариса Александровна", 4, 85700);
        employees[6] = createdEmployee("Терентьев Иван Иванович", 3, 94640);
        employees[7] = createdEmployee("Шишкина Мария Борисовна", 5, 69500);
        employees[8] = createdEmployee("Воробьев Алексей Алексеевич", 2, 97450);
        employees[9] = createdEmployee("Рощина Людмила Петровна", 1, 81690);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("Общая сумма затрат на заработную плату: " + calculatedAmountOfSalaryCosts(employees));
        System.out.println("Минимальная заработная плата: " + calculatedMinSalary(employees));
        System.out.println("Максимальная заработная плата: " + calculatedMaxSalary(employees));
        System.out.println("Средняя заработная плата: " + calculatedAverageSalary(employees));
        System.out.println("Список сотрудников:");
        printFullNames(employees);
    }

    public static int calculatedAmountOfSalaryCosts(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static int calculatedAverageSalary(Employee[] employees) {
        int sum = calculatedAmountOfSalaryCosts(employees);
        int averageSum = sum / employees.length;
        return averageSum;
    }

    public static Employee calculatedMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee calculatedMaxSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static void printFullNames(Employee[] employees) {
        int id = 1;
        for (Employee employee : employees) {
            System.out.println(id + ". " + employee.getFullName());
            id++;


        }
    }
}

