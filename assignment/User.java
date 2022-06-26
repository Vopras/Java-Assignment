import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class User extends Consumer{
    ArrayList<String> listCompanies;

    User() {
        super();
        this.listCompanies = new ArrayList<>();
    }

    User(ArrayList<String> listCompanies, Resume resume, ArrayList<Consumer> listConsumer) {
        super(resume, listConsumer);
        this.listCompanies = listCompanies;
    }

    public Employee convert(Company company, int wage) {
        Employee emp = new Employee(this.resume, listConsumer, company, wage);
        return emp;
    }

    public double getTotalScore() {
        double score = 0;
        int ani = 0;


        Iterator<Education> i = this.resume.education.iterator();

        long dif = this.resume.education.first().end.getTime() -
                this.resume.education.first().begining.getTime();

        Date d = new Date(dif);
        if (d.getMonth() > 3)
            ani++;

        for (int j = 0; j <this.resume.education.size() - 1; j++) {

            Education current = i.next();

            dif = current.end.getTime() - current.begining.getTime();
            d = new Date(dif);

            if (d.getMonth()> 3)
                ani++;
        }

        score = ani * 1.5 + this.meanGPA();

        return score;
    }
}
