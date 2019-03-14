package consultant;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryTest {
    @Test
    public void showConsultantDetails() {
        Developer dev1 = new Developer(100, "nitin", "Pro Developer");
        Developer dev2 = new Developer(101, "ravi", "Developer");
        Developer dev3 = new Developer(101, "abhinav", "Developer");
        CompanyDirectory conDevDir = new CompanyDirectory();
        conDevDir.addConsultant(dev1);
        conDevDir.addConsultant(dev2);
        conDevDir.addConsultant(dev3);

        Tester qa1 = new Tester(200, "JMJ", "Pro Tester");
        CompanyDirectory conQADir = new CompanyDirectory();
        conQADir.addConsultant(qa1);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addConsultant(conDevDir);
        directory.addConsultant(conQADir);

        directory.showConsultantDetails();
    }
}
