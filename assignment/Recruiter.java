public class Recruiter extends  Employee{
    double rating;

    public int evaluate(Job job, User user) {

        double score = this.rating * user.getTotalScore();
        Request r = new Request(job, user, this, score);

        return 1;
    }
}
