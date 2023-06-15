public class Main {
    public static void main(String[] args) {

        Employee employee11 = new Employee("Ефим", "Чаркин", "Имхотепович", 1, 35000);

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add(new Employee("Иван", "Иванов", "Сергеевич", 2, 19000));
        employeeBook.add(new Employee("Егор", "Петров", "Ильич", 1, 18000));
        employeeBook.add(new Employee("Илья", "Серов", "Александрович", 5, 13000));
        employeeBook.add(new Employee("Игнат", "Нилов", "Иванович", 3, 16000));
        employeeBook.add(new Employee("Игорь", "Валов", "Николаевич", 4, 20000));
        employeeBook.add(new Employee("Сергей", "Шинов", "Андреевич", 2, 15500));
        employeeBook.add(new Employee("Ольга", "Бузова", "Николаевна", 4, 19000));
        employeeBook.add(new Employee("Николай", "Цой", "Артемович", 5, 14000));
        employeeBook.add(new Employee("Тимофей", "Тян", "Дмитриевич", 3, 15200));
        employeeBook.add(new Employee("Владимир", "Вашин", "Сергеевич", 2, 18000));

//        employeeBook.printAll();
//        System.out.println("=============================================");
//        employeeBook.remove("Цой Николаc");
//        employeeBook.printAll();
//        System.out.println("==============================================");
//        employeeBook.findUser("Шинов Сергей");
//        employeeBook.allSalary();
//        System.out.println("==============================================");
//        employeeBook.minSalary();
//        System.out.println("==============================================");
//        employeeBook.maxSalary();
//        System.out.println("==============================================");
//        employeeBook.averageSalary();
//        System.out.println("==============================================");
//        employeeBook.allName();
//        System.out.println("==============================================");
//        employeeBook.indexSalary(20);
//        employeeBook.printAll();
//        System.out.println("==============================================");
//        employeeBook.getMinimalSalaryInOffice(3);
//        System.out.println("==============================================");
//        employeeBook.getMaximalSalaryInOffice(4);
//        System.out.println("==============================================");
//        employeeBook.getAllSalaryOffice(2);
//        System.out.println("==============================================");
//        employeeBook.getAverageSalaryOffice(2);
//        System.out.println("==============================================");
//        employeeBook.getIndexSalaryOffice(2, 20);
//        System.out.println("==============================================");
//        employeeBook.getAllEmployeeOffice(2);
//        System.out.println("==============================================");
//        employeeBook.sourceSalaryOfEmployeeLow(17000);
//        System.out.println("==============================================");
//        employeeBook.sourceSalaryOfEmployeeHigh(20000);
//        System.out.println("==============================================");
//        employeeBook.add(employee11);
//        employeeBook.findUser("Чаркин Ефим");
//        System.out.println("==============================================");
//        employeeBook.changeSalary("Чаркин Ефим", 18400);
//        employeeBook.changeOffice("Шинов Сергей", 5);
//        employeeBook.printEmployeeWithOffice();
    }
}