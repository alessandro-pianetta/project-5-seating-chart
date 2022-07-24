package SeatingChart;

public class Student {

    // Instance Variables

    public String firstName;
    public String lastName;

    public Student(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    // Setters

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    // Getters

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


}
