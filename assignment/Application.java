import java.util.ArrayList;
import java.util.List;

public class Application {

    ArrayList<Company> listCompany;
    ArrayList<User> listUsers;


    public Application() {
        this.listCompany = new ArrayList();
        this.listUsers = new ArrayList();
    }

    public Application(ArrayList<Company> listCompany, ArrayList<User> listUsers) {
        this.listCompany = listCompany;
        this.listUsers = listUsers;
    }

    public ArrayList<Company> getCompanies(){
        return this.listCompany;
    }

    public Company getCompany(String name){
        for (int i = 0; i < listCompany.size(); i++) {
            if (this.listCompany.get(i).name.equals(name)) {
                return this.listCompany.get(i);
            }
        }
        return null;
    }

    public void add(Company company){
        this.listCompany.add(company);
    }

    public void add(User user){
        this.listUsers.add(user);
    }

    public boolean remove(Company company){
        if (this.listCompany.contains(company)) {
            this.listCompany.remove(company);
            return true;
        }
        return false;
    }

    public boolean remove(User user){
        if (this.listUsers.contains(user)) {
            this.listUsers.remove(user);
            return true;
        }
        return false;
    }

    public ArrayList<Job> getJobs(List<String> companies){
        ArrayList<Job> listJob = new ArrayList<Job>();

//        parcurg cu 3 for-uri pana ajung la joburi
//        verific daca joburile sunt libere
//        daca ele sunt libere, le includ in lista
//        ce va fi returnata

        for (int i = 0; i < companies.size(); i++) {
            Company comp = getCompany(companies.get(i));
            for (int j = 0; j < comp.listDepartment.size(); j++) {
                Department dep = comp.listDepartment.get(j);
                for (int k = 0; k < dep.listJobs.size(); k++) {
                    if (dep.listJobs.get(k).open) {
                        listJob.add(dep.listJobs.get(k));
                    }
                }
            }
        }
        return listJob;
    }



}