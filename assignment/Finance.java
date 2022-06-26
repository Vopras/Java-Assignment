import java.util.Date;

public class Finance extends Department {


    @Override
    public double getTotalSalaryBudget() {
        double total = 0;

        for (int i = 0; i < this.listEmployees.size(); i++) {
            double wage = this.listEmployees.get(i).wage;

//          dif este diferent in milisecunde dintre sfarsitul si inceputul angajarii
            long dif = this.listEmployees.get(i).resume.experience.last().end.getTime() -
                    this.listEmployees.get(i).resume.experience.last().start.getTime();

//            d este un obiect de tip Date ce este egal cu dif milisecunde
            Date d = new Date(dif);

            if (d.getYear() < 1) {
                total = total + wage * 0.9;
            }
            else
                total = total + wage * 0.84;
        }
        return total;
    }
}
