package employeerepo;

import employee.EmployeeDB;
import employee.EmployeeLDAP;
import employee.EmployeeLDAPAdapter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeRepoTest {

    @Test
    public void getEmployeesWhenEmployeeFromDB() {
        EmployeeRepo emp = new EmployeeRepo();
        emp.addEmployee(new EmployeeDB("1", "nitin", "kumar", "nitin@kumar.com"));

        String empList = emp.getEmployees();
        assertEquals("Invalid employee list","Employee(1, nitin, kumar, nitin@kumar.com)\n", empList);
    }

    @Test
    public void getEmployeesWhenEmployeeFromLDAP() {
        EmployeeRepo emp = new EmployeeRepo();
        EmployeeLDAP employeeLDAP = new EmployeeLDAP(1, "nitin", "kumar", "nitin@kumar.com");
        emp.addEmployee(new EmployeeLDAPAdapter(employeeLDAP));

        String empList = emp.getEmployees();
        assertEquals("Invalid employee list","Employee(1, nitin, kumar, nitin@kumar.com)\n", empList);
    }

    @Test
    public void getEmployeesList() {
        EmployeeRepo emp = new EmployeeRepo();
        EmployeeDB employeeLDB = new EmployeeDB("1", "nitinDB", "kumar", "nitin@kumar.com");
        EmployeeLDAP employeeLDAP = new EmployeeLDAP(2, "nitinLDAP", "kumar", "nitin@kumar.com");

        //add employees to the list
        emp.addEmployee(employeeLDB);
        emp.addEmployee(new EmployeeLDAPAdapter(employeeLDAP));

        String empList = emp.getEmployees();
        assertEquals("Invalid employee list","Employee(1, nitinDB, kumar, nitin@kumar.com)" +
                "\nEmployee(2, nitinLDAP, kumar, nitin@kumar.com)\n", empList);
    }
}
