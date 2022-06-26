import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public abstract class Consumer {

    Resume resume;
    ArrayList<Consumer> listConsumer;


    public Consumer() {
        this.resume = new Resume();
        this.listConsumer = new ArrayList<Consumer>();
    }

    public Consumer(Resume resume, ArrayList<Consumer> listConsumer) {
        this.resume = resume;
        this.listConsumer = listConsumer;
    }



    public void add(Education education) {
        this.resume.education.add(education);
    }

    public void add(Experience experience) {
        this.resume.experience.add(experience);
    }

    public void add(Consumer consumer) {
        this.listConsumer.add(consumer);
    }

    public int getDegreeInFriendship(Consumer consumer) {

//        aceasta metoda returneaza pozitia, ea fiind
//        acest degreeInFriendship, cel putin asa am inteles eu

        for (int i = 0; i < this.listConsumer.size(); i++) {
            if (this.listConsumer.get(i).equals(consumer)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Consumer consumer) {
        this.listConsumer.remove(consumer);
    }

    public Integer getGraduationYear() {
        return this.resume.education.last().end.getYear();
    }

    public Double meanGPA() {
        int n = 1;
        double sum = this.resume.education.first().media;

        Iterator<Education> i = this.resume.education.iterator();

        while (i.hasNext()) {
            n++;
            sum = sum + i.next().media;
        }
        return sum/n;
        }
    }


    class Resume {
        Information inf;
        TreeSet<Education> education;
        TreeSet<Experience> experience;

        Resume() {
            this.inf = new Information.Builder()
                    .infBuilder();
            this.education = new TreeSet<Education>();
            this.experience = new TreeSet<Experience>();
        }

        Resume(Information inf, TreeSet<Education> education, TreeSet<Experience> experience) {
            this.inf = inf;
            this.education = education;
            this.experience = experience;
        }
    }




