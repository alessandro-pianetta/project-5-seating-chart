package SeatingChart;

public class Student {
    // Instance Variables
    public String firstName;
    public String lastName;

    // Constructors
    public Student() {
        this.firstName = this.lastName = "";
    }

    public Student(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    // Overrides
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    // Setters
    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean isEmpty() {
        return this.firstName.isEmpty() && this.lastName.isEmpty();
    }

}
