public class IT extends Department {


    @Override
    public double getTotalSalaryBudget() {
        double total = 0;

//        parcurgem lista de angajati si calculam totalul salariilor
        for (int i = 0; i < this.listEmployees.size(); i++) {
            total = total + this.listEmployees.get(i).wage;
        }
        return total;
    }
}
