import java.util.ArrayList;

public class Company {
    String name;
    Manager man;
    ArrayList<Department> listDepartment;
    ArrayList<Recruiter> listRec;

    public Company() {
        this.name = "Fara nume";
        this.man = new Manager();
        this.listDepartment = new ArrayList<Department>();
        this.listRec = new ArrayList<Recruiter>();
    }


    public Company(String name, Manager man, ArrayList<Department>
            listDepartment, ArrayList<Recruiter> listRec) {
        this.name = name;
        this.man = man;
        this.listDepartment = listDepartment;
        this.listRec = listRec;
    }

    public Department getDepartment(Department department) {
        for (int i = 0; i < this.listDepartment.size(); i++) {
            if (this.listDepartment.get(i).equals(department)) {
                return this.listDepartment.get(i);
            }
        }
        return null;
    }



    public void add(Department department) {
        this.listDepartment.add(department);
    }

    public void add(Recruiter recruiter) {
        this.listRec.add(recruiter);
    }

    public void add(Employee employee, Department department) {
        if (getDepartment(department) != null) {
            getDepartment(department).add(employee);
        }
    }


//    parcurgem fiecare departament in parte pentru a afla unde acel employee se afla,
//    in cazul in care el exista
    public void remove(Employee employee) {
        for (int i = 0; i < this.listDepartment.size(); i++) {
            Department dep = this.listDepartment.get(i);
            for (int j = 0; j < dep.listEmployees.size(); j++) {
                if (dep.listEmployees.get(j).equals(employee)) {
                    dep.listEmployees.remove(employee);
                }
            }
        }
    }

    public void remove(Department department) {
        for (int i = 0; i < this.listDepartment.size(); i++) {
            Department dep = this.listDepartment.get(i);
            for (int j = 0; j < dep.listEmployees.size(); j++) {
                dep.listEmployees.remove(j);
            }
            this.listDepartment.remove(i);
        }
    }

    public void remove(Recruiter recruiter) {
        for (int i = 0; i < this.listRec.size(); i++) {
            if (this.listRec.get(i).equals(recruiter)) {
                remove(recruiter);
            }
        }
    }

    public void move(Department source, Department destination) {
        for (int i = 0; i < source.listEmployees.size(); i++) {
            destination.add(source.listEmployees.get(i));
        }
        for (int j = 0; j < source.listJobs.size(); j++) {
            destination.add(source.listJobs.get(j));
        }
    }

    public void move(Employee employee, Department newDepartment) {
        newDepartment.add(employee);
    }

    public boolean contains(Department department) {
        for (int i = 0; i < this.listDepartment.size(); i++) {
            if (this.listDepartment.get(i).equals(department)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Employee employee) {
        for (int i = 0; i < this.listDepartment.size(); i++) {
            for (int j = 0; j < this.listDepartment.get(i).listEmployees.size(); i++) {
                if (this.listDepartment.get(i).listEmployees.get(j).equals(employee)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contains(Recruiter recruiter) {
        for (int i = 0; i < this.listRec.size(); i++) {
            if (this.listRec.get(i).equals(recruiter)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Job> getJobs() {
       ArrayList<Job> listJobs = new ArrayList<Job>();
        for (int i = 0; i < this.listDepartment.size(); i++) {
            Department dep = this.listDepartment.get(i);
            for (int j = 0; j < dep.listJobs.size(); j++) {
                if (dep.listJobs.get(j).open) {
                    listJobs.add(dep.listJobs.get(j));
                }
            }
        }
        return listJobs;
    }


}
