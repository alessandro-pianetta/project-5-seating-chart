package SeatingChart;

/**
 * @author Alessandro Pianetta
 */
public class SeatingChart {
    // Declares public instance variable students
    public Student[][] students = new Student[4][5];

    // Constructor initializes seating chart
    public SeatingChart() {
        for (int row = 0; row < this.students.length; row++) {
            for (int seat = 0; seat < this.students[row].length; seat++) {
                this.students[row][seat] = new Student();
            }
        }
    }

    // Replaces default student with intended student data
    public void addStudent(String first, String last, int row, int seat) {
        Student potentialStudent = students[row][seat];
        // Checks to see if student is default or not
        if (potentialStudent.isEmpty()) {
            // If object had a default student, update the info with the new student's data
            potentialStudent.setFirstName(first);
            potentialStudent.setLastName(last);
        }
    }

    public void swapStudents(String first, String last, int targetRow, int targetSeat) {
        // Declare temp variable for data of current student in target seat
        Student oldStudent = students[targetRow][targetSeat];

        // Find student with whom you want to switch the oldStudent by iterating through each row
        // and seat until the student's name is found
        for (int row = 0; row < this.students.length; row++) {
            for (int seat = 0; seat < this.students[row].length; seat++) {
                // Declares and initializes newStudent variable for readability's sake
                Student newStudent = students[row][seat];

                // If the student's name values equal the ones passed in, puts found student in target
                // seat and moves the student in the temp variable to the found student's old seat
                if (newStudent.getFirstName().equals(first) && newStudent.getLastName().equals(last)) {
                    students[targetRow][targetSeat] = newStudent;
                    students[row][seat] = oldStudent;
                    return;
                }
            }
        }
    }
}


