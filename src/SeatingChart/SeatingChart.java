package SeatingChart;

public class SeatingChart {
    Student[][] seatingChart = new Student[4][5];

    public void addStudent(String first, String last, int row, int seat) {
        seatingChart[row][seat] = new Student(first, last);
    }

    public void switchStudents(String first, String last, int targetRow, int targetSeat) {
        // TODO: Check to make sure that this ref v doesn't change
        Student studentToSwitch = seatingChart[targetRow][targetSeat];
        Student newStudent;

        for (Student[] row:this.seatingChart) {
            for (Student seat:row) {
                if (seat.firstName.equals(first) && seat.lastName.equals(last)) {
                    newStudent = new Student(first, last);
                    seatingChart[targetRow][targetSeat] = newStudent;
                    seat = studentToSwitch;
                    return;
                }
            }
        }
    }
}


