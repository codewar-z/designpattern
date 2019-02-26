package employeerepo;

import employee.EmployeeDB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeRepoTest {

    @Test
    public void getEmployees() {
        EmployeeRepo emp = new EmployeeRepo();
        emp.addEmployee(new EmployeeDB("1", "nitin", "kumar", "nitin@kumar.com"));

        String empList = emp.getEmployees();
        assertEquals("Employee(1, nitin, kumar, nitin@kumar.com)\n", empList);
    }
}
