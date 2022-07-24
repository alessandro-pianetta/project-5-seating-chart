import SeatingChart.SeatingChart;

public class Main {
    public static void main(String[] args) {
        SeatingChart chart = new SeatingChart();
        chart.addStudent("hello", "goodbye", 0, 0);
        chart.addStudent("ciao", "arrivederci", 0, 1);
        System.out.println("**** INITIAL VALUES ****");
        System.out.println(chart.students[0][0]);
        System.out.println(chart.students[0][1]);

        chart.switchStudents("ciao", "arrivederci", 0, 0);
        System.out.println("**^* FINAL VALUES ****");
        System.out.println(chart.students[0][0]);
        System.out.println(chart.students[0][1]);
    }
}
