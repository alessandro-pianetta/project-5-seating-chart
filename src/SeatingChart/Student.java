package SeatingChart;

public class Student {

    // Instance Variables

    public String firstName;
    public String lastName;
    public int row;
    public int seat;

    // Constructors

    public Student() {
        firstName = lastName = "undefined";
    }

    public Student(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    @Override
    public String toString() {
        return this.lastName + this.firstName + " : Row " + this.row + " Seat " + this.seat;
    }

    // Setters

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    // Getters

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSeat() {
        return this.seat;
    }

    public int getRow() {
        return this.row;
    }


}
