import java.text.DecimalFormat;
import java.util.*;

public class EmployeeBook {
    //Операции по определенному сотруднику осуществляются по фамилии и имени
    private final Map<String, Employee> employees = new HashMap<>();

    public void add(Employee item) {
        employees.put(item.getMiddleName() + " " + item.getFirstName(), item);

    }

    public void remove(String s) {
        if (!employees.containsKey(s)) {
            throw new NotFoundException("Сотрудник не найден или некоректно введены фамилия или имя");
        }
        employees.remove(s);
    }

    public void findUser(String s) {
        if (!employees.containsKey(s)) {
            throw new NotFoundException("Сотрудник не найден или некоректно введены фамилия или имя");
        }
        System.out.println(employees.get(s));
    }

    public void printAll() {
        for (Map.Entry<String, Employee> element : employees.entrySet()) {
            System.out.println(element.getValue());
        }
    }

    private void printAllInOffice(int office) {
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                System.out.println(item.getValue());
            }
        }
    }

    public void allSalary() {
        int sum = 0;
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            sum += item.getValue().getSalary();
        }
        System.out.println("Ежемесячные расходы на зарплату сотрудников предприятия составляет " + sum + " RUB");
    }

    public void minSalary() {
        Set<Integer> salary = new TreeSet<>();
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            salary.add(item.getValue().getSalary());
        }
        List<Integer> min = new ArrayList<>(salary);
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() == min.get(0)) {
                System.out.println("Минимальная зарплата по организации: " + min.get(0) + "\n" + item.getValue() + " RUB");
            }
        }
    }

    public void maxSalary() {
        Set<Integer> salary = new TreeSet<>();
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            salary.add(item.getValue().getSalary());
        }
        List<Integer> max = new ArrayList<>(salary);
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() == max.get(max.size() - 1)) {
                System.out.println("Максимальная зарплата по организации: " + (max.get(max.size() - 1)) + "\n" + item.getValue() + " RUB");
            }
        }
    }

    public void averageSalary() {
        int sum = 0;
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            sum += item.getValue().getSalary();
        }
        double average = (double) sum / employees.size();
        System.out.println("Среднее занчение зарплат равно " + new DecimalFormat("###,###.##").format(average) + " RUB");
    }

    public void allName() {
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            System.out.println(item.getValue().getMiddleName() + " " + item.getValue().getFirstName() + " " + item.getValue().getLastName());
        }
    }

    public void indexSalary(int percent) {
        System.out.println("Повышение зарплаты на " + percent + " %");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            item.getValue().setSalary(item.getValue().getSalary() + (item.getValue().getSalary() * percent) / 100);
        }
    }

    public void getMinimalSalaryInOffice(int office) {
        Set<Integer> salaryOffice = new TreeSet<>();
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                salaryOffice.add(item.getValue().getSalary());
            }
        }
        List<Integer> min = new ArrayList<>(salaryOffice);
        System.out.println("Минимальная зарплата в " + office + " отделе: " + min.get(0) + " RUB");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() == min.get(0)) {
                System.out.println(item.getValue());
            }
        }
    }

    public void getMaximalSalaryInOffice(int office) {
        Set<Integer> salaryOffice = new TreeSet<>();
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                salaryOffice.add(item.getValue().getSalary());
            }
        }
        List<Integer> max = new ArrayList<>(salaryOffice);
        System.out.println("Максимальная зарплата в " + office + " отделе: " + max.get(max.size() - 1) + " RUB");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() == max.get(max.size() - 1)) {
                System.out.println(item.getValue());
            }
        }
    }

    public void getAllSalaryOffice(int office) {
        int sum = 0;
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                sum += item.getValue().getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу № " + office + " составляет " + sum + " RUB");
    }

    public void getAverageSalaryOffice(int office) {
        int sum = 0;
        int k = 0;
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                sum += item.getValue().getSalary();
                ++k;
            }
        }
        double averageSalaryOffice = (double) sum / k;
        System.out.println("Средняя зарплата по отделу № " + office + " составляет " + new DecimalFormat("###,###.##").format(averageSalaryOffice) + " RUB");
    }

    public void getIndexSalaryOffice(int office, int percent) {
        System.out.println("Зарплата сотрудников " + office + " отдела, после индексации на " + percent + " %");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getOffice() == office) {
                item.getValue().setSalary(item.getValue().getSalary() + (item.getValue().getSalary() * percent) / 100);
            }
        }
        printAllInOffice(office);
    }

    public void getAllEmployeeOffice(int office) {
        System.out.println("Сотрудники " + office + " отдела:");
        printAllInOffice(office);
    }

    public void sourceSalaryOfEmployeeLow(int salary) {
        System.out.println("Сотрудники, чья зарплата меньше " + salary + " рублей");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() < salary) {
                System.out.println(item.getValue());
            }
        }
    }

    public void sourceSalaryOfEmployeeHigh(int salary) {
        System.out.println("Сотрудники, чья зарплата больше " + salary + " рублей");
        for (Map.Entry<String, Employee> item : employees.entrySet()) {
            if (item.getValue().getSalary() > salary) {
                System.out.println(item.getValue());
            }
        }
    }

    public void changeSalary(String mName, int salary) {
        if (!employees.containsKey(mName)) {
            throw new NotFoundException("Сотрудник не найден или некоректно введены фамилия или имя");
        }
        employees.get(mName).setSalary(salary);
    }

    public void changeOffice(String mName, int office) {
        if (!employees.containsKey(mName)) {
            throw new NotFoundException("Сотрудник не найден или некоректно введены фамилия или имя");
        }
        employees.get(mName).setOffice(office);
    }

    public void printEmployeeWithOffice() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Список сотрудников " + i + " отдела: ");
            for (Map.Entry<String, Employee> item : employees.entrySet()) {
                if (item.getValue().getOffice() == i) {
                    System.out.println(item.getValue().getMiddleName() + " " + item.getValue().getFirstName() + " " + item.getValue().getLastName());
                }
            }
        }
    }
}
