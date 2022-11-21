public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;


    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился(родилась) в "
                + getYearOfBirth() + " году. Я работаю на должности " + getJobTitle() + ". Будем знакомы!";
    }
}

