import java.util.ArrayList;

public abstract class Department {
    ArrayList<Employee> listEmployees;
    ArrayList<Job> listJobs;

    public Department() {
        this.listEmployees = new ArrayList<Employee>();
        this.listJobs = new ArrayList<Job>();
    }

    public Department(ArrayList<Employee> listEmployees, ArrayList<Job> listJobs) {
        this.listEmployees = listEmployees;
        this.listJobs = listJobs;
    }

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        return this.listJobs;
    }

    public void add(Employee employee) {
        this.listEmployees.add(employee);
    }

    public void remove(Employee employee) {
        this.listEmployees.remove(employee);
    }

    public void add(Job job) {
        this.listJobs.add(job);
    }

    public ArrayList<Employee> getEmployees() {
        return this.listEmployees;
    }



}
