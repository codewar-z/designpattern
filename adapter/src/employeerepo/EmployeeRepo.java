package employeerepo;

import employee.Employee;
import java.util.List;

public class EmployeeRepo {
    private List<Employee> employees;

    public void addEmployee(Employee emp) {
        this.employees.add(emp);
    }

    public String getEmployees() {
        String empList = "";
        for (Employee e:this.employees) {
            empList += "Employee(" + e.getID() + ", " +
            e.getFirstName() + ", " +
            e.getLastName() + ", " +
            e.getEMail() +  ")\n";
        }
        return empList;
    }
}
