package employeerepo;

import employee.Employee;
import employee.EmployeeLDAP;

public class EmployeeLDAPAdapter implements Employee {
    EmployeeLDAP employee;
    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employee = employeeLDAP;
    }


    @Override
    public String getID() {
        return String.valueOf(this.employee.getID());
    }

    @Override
    public String getFirstName() {
        return this.employee.getGivenName();
    }

    @Override
    public String getLastName() {
        return this.employee.getSurName();
    }

    @Override
    public String getEMail() {
        return this.employee.getEmailAddress();
    }
}
