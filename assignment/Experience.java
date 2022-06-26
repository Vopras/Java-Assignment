import java.util.Date;

public class Experience implements Comparable{

    Date start;
    Date end;
    String position;
    Company company;

    @Override
    public int compareTo(Object o) {
        Experience xp = (Experience) o;

        if ((this.end.equals(null) && xp.end.equals(null)) || (this.end.equals(xp.end)) ) {
            return this.company.name.compareTo(xp.company.name);
        }

        if (this.end.compareTo(xp.end) == 1)
            return -1;
        else
            return 1;
    }

    public void stillWorking() {
        this.end = null;
    }

    Experience() {
        this.start = new Date();
        this.end = new Date();
        this.position = "fara pozitie";
        this.company = new Company();
    }

    public Experience(Date start, Date end, String position, Company company)
            throws InvalidDatesException {

        if (start.compareTo(end) == -1) {
            throw new InvalidDatesException("Error, invalid dates");
        }

        this.start = start;
        this.end = end;
        this.position = position;
        this.company = company;
    }
}
