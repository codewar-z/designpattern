package consultant;

public class Developer implements Consultant {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showConsultantDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
