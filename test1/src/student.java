public class student {
    String name;
    String lastname;
    String grade;
    String city;

    public student(String name, String lastname, String grade, String city) {
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
        this.city = city;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGrade() {
        return grade;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

