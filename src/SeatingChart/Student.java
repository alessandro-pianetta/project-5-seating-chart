package SeatingChart;

/**
* @author Alessandro Pianetta
*/
public class Student {
    // Instance Variables
    public String firstName = "";
    public String lastName = "";

    // Overrides
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // Checks to see if Student instance has default data or not
    public boolean isEmpty() {
        return this.firstName.isEmpty() && this.lastName.isEmpty();
    }

    // Setters
    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }
}
