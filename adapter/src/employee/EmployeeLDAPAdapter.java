package employee;

public class EmployeeLDAPAdapter implements Employee {
    private EmployeeLDAP employee;

    public EmployeeLDAPAdapter(EmployeeLDAP emp) {
        this.employee = emp;
    }
    @Override
    public String getID() {
        return this.employee.getID() + "";
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
