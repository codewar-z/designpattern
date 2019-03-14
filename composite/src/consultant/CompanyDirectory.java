package consultant;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Consultant {
    private List<Consultant> employeeList = new ArrayList<Consultant>();

    @Override
    public void showConsultantDetails() {
        for (Consultant emp : employeeList) {
            emp.showConsultantDetails();
        }
    }

    public void addConsultant(Consultant emp) {
        employeeList.add(emp);
    }

    public void removeConsultant(Consultant emp) {
        employeeList.remove(emp);
    }
}
