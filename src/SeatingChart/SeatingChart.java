package SeatingChart;

public class SeatingChart {
    public Student[][] students = new Student[4][5];

    public SeatingChart() {
        for (int row = 0; row < this.students.length; row++) {
            for (int seat = 0; seat < this.students[row].length; seat++) {
                this.students[row][seat] = new Student();
            }
        }
    }

    public void addStudent(String first, String last, int row, int seat) {
        if (students[row][seat].isEmpty()) {
            students[row][seat] = new Student(first, last);
        }
    }

    public void switchStudents(String first, String last, int targetRow, int targetSeat) {
        Student oldStudent = students[targetRow][targetSeat];

        for (int row = 0; row < this.students.length; row++) {
            for (int seat = 0; seat < this.students[row].length; seat++) {
                Student newStudent = students[row][seat];

                if (newStudent.firstName.equals(first) && newStudent.lastName.equals(last)) {
                    students[targetRow][targetSeat] = newStudent;
                    students[row][seat] = oldStudent;
                }
            }
        }
    }
}


