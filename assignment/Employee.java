import java.util.ArrayList;

public class Employee extends Consumer {

    Company company;
    int wage;

    public Employee() {
        super();
        this.company = new Company();
        this.wage = 0;
    }

    public Employee(Resume resume, ArrayList<Consumer> listConsumer, Company company, int wage) {
        super(resume, listConsumer);
        this.company = company;
        this.wage = wage;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
