import java.util.ArrayList;

public class Job {
    String name;
    String company;
    boolean open;
    Constraint absolvire;
    Constraint aniExp;
    Constraint media;
    ArrayList<User> listCandidates;
    int needed;
    int wage;

    public Job(String name, String company, boolean open, Constraint absolvire, Constraint aniExp,
               Constraint media, ArrayList<User> listCandidates, int needed, int wage) {
        this.name = name;
        this.company = company;
        this.open = open;
        this.absolvire = absolvire;
        this.aniExp = aniExp;
        this.media = media;
        this.listCandidates = listCandidates;
        this.needed = needed;
        this.wage = wage;
    }

    public void apply(User user) {

    }

    public boolean meetsRequirements(User user) {

        double e1 = ((double) user.resume.education.last().end.getTime());
        return true;
    }


}