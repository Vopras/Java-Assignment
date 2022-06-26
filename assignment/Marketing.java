public class Marketing extends Department {


    @Override
    public double getTotalSalaryBudget() {
        double total = 0;

        for (int i = 0; i < this.listEmployees.size(); i++) {
            double wage = this.listEmployees.get(i).wage;

            if (wage > 5000) {
                total = total + wage * 0.9; //daca salariul e peste 5000
                                            //impozitul este de 10%

            } else
                if (wage < 3000) {
                    total = total + wage; //daca salariul este mai mic de 3000
                                            // persoana e scutita de taxe
                } else
                    total = total + wage * 0.84; //in restul cazurilor
                                                    //impozitul e de 16%
        }
        return total;
    }
}
