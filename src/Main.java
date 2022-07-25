import SeatingChart.SeatingChart;
import SeatingChart.Student;

/**
 * @author Alessandro Pianetta
 */
public class Main {
    public static void main(String[] args) {
        SeatingChart chart = new SeatingChart();

        // Adds students
        chart.addStudent("John", "Doe", 0, 0);
        chart.addStudent("Jane", "Smith", 0, 1);
        System.out.println("**** INITIAL VALUES ****");
        System.out.println("STUDENT 1: " + chart.students[0][0]);
        System.out.println("STUDENT 2: " + chart.students[0][1]);

        // Switches students
        chart.swapStudents("Jane", "Smith", 0, 0);
        System.out.println("**** UPDATED VALUES ****");
        System.out.println("STUDENT 1: " + chart.students[0][0]);
        System.out.println("STUDENT 2: " + chart.students[0][1]);

        // Getters
        Student student = chart.students[0][1];
        System.out.println("**** INITIAL STUDENT VALUES ****");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());

        // Setters
        student.setFirstName("Jonathan");
        student.setLastName("Johnson");
        System.out.println("**** UPDATED STUDENT VALUES ****");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}
