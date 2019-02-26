package employee;

public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String eMail;

    public EmployeeDB(String id, String firstName, String lastName, String eMail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
    }


    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEMail() {
        return this.eMail;
    }
}
