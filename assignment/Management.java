public class Management extends Department {

    @Override
    public double getTotalSalaryBudget() {
        double total = 0;

        for (int i = 0; i < this.listEmployees.size(); i++) {
            total = total + this.listEmployees.get(i).wage * 0.84;
        }
        return total;
    }
}
