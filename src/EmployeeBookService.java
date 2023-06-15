public interface EmployeeBookService {
    void add(Employee item);
    void remove(String s);
    void findUser(String s);
    void printAll();
    void allSalary();
    void minSalary();
    void maxSalary();
    void averageSalary();
    void allName();
    void indexSalary(int percent);
    void getMinimalSalaryInOffice(int office);
    void getMaximalSalaryInOffice(int office);
    void getAllSalaryOffice(int office);
    void getAverageSalaryOffice(int office);
    void getIndexSalaryOffice(int office, int percent);
    void getAllEmployeeOffice(int office);
    void sourceSalaryOfEmployeeLow(int salary);
    void sourceSalaryOfEmployeeHigh(int salary);
    void changeSalary(String mName, int salary);
    void changeOffice(String mName, int office);
    void printEmployeeWithOffice();

}
