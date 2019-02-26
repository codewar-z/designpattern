package employee;

public class EmployeeLDAP {
    private int id;
    private String givenName;
    private String surName;
    private String emailAddress;

    public EmployeeLDAP(int id, String giventName, String surName, String emailAddress) {
        this.id = id;
        this.givenName = giventName;
        this.surName = surName;
        this.emailAddress = emailAddress;
    }

    public int getID() {
        return this.id;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
