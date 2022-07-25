import SeatingChart.SeatingChart;
import SeatingChart.Student;

/**
 * @author Alessandro Pianetta
 */
public class Main {
    public static void main(String[] args) {
        SeatingChart chart = new SeatingChart();

        // Adds students
        chart.addStudent("Hello", "Goodbye", 0, 0);
        chart.addStudent("Ciao", "Arrivederci", 0, 1);
        System.out.println("**** INITIAL VALUES ****");
        System.out.println("STUDENT 1: " + chart.students[0][0]);
        System.out.println("STUDENT 2: " + chart.students[0][1]);

        // Switches students
        chart.swapStudents("Ciao", "Arrivederci", 0, 0);
        System.out.println("**** UPDATED VALUES ****");
        System.out.println("STUDENT 1: " + chart.students[0][0]);
        System.out.println("STUDENT 2: " + chart.students[0][1]);

        // Getters
        Student student = chart.students[0][0];
        System.out.println("**** INITIAL STUDENT VALUES ****");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());

        // Setters
        student.setFirstName("Bonjour");
        student.setLastName("Au Revoir");
        System.out.println("**** UPDATED STUDENT VALUES ****");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}
