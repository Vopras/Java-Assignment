import java.util.Date;

public class Information {

    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private Date birth;
    private String sex;
    private Language lang;

    private Information(Builder builder) {
        this.nume = builder.nume;
        this.prenume = builder.prenume;
        this.email = builder.email;
        this.telefon = builder.telefon;
        this.birth = builder.birth;
        this.sex = builder.sex;
        this.lang = builder.lang;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    class Language {
        String name;
        String level;

        Language() {
            this.name = "pascal";
            this.level = "Experienced";
        }
    }

    static class Builder {
        String nume;
        String prenume;
        String email;
        String telefon;
        Date birth;
        String sex;
        Language lang;

        public Builder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public Builder setPrenume(String prenume) {
            this.prenume = prenume;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setTelefon(String telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder setBirth(Date birth) {
            this.birth = birth;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setLang(Language lang) {
            this.lang = lang;
            return this;
        }

        public Information infBuilder() {
            return new Information(this);
        }
    }
}
