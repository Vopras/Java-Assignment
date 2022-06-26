import java.util.Date;

public class Education implements Comparable{

    Date begining;
    Date end;
    String institutionName;
    String educationLevel;
    Float media;

    Education() {
        this.begining = new Date();
        this.end = new Date();
        this.institutionName = "Institution without name";
        this.educationLevel = "No education level specified";
        this.media = Float.valueOf(0);
    }

    Education(Date begining, Date end, String institutionName, String educationLevel,  Float media)
            throws InvalidDatesException {

        if (begining.compareTo(end) == -1) {
            throw new InvalidDatesException("Error, invalid dates");
        }


        this.begining = begining;
        this.end = end;
        this.institutionName = institutionName;
        this.educationLevel = educationLevel;
        this.media = media;

    }

    void notFinishedEducation() {
        this.end = null;

    }


    @Override
    public int compareTo(Object o) {
       Education edu2 = (Education) o;

        if (this.end.equals(null)) {
            return this.begining.compareTo(edu2.begining);
        }

        if (this.end.after(edu2.end))
            return -1;
        else if (this.end.before(edu2.end))
            return  1;
        else
            if (this.media.compareTo(edu2.media) == 1)
                return -1;
            else
                return 1;
    }
}
