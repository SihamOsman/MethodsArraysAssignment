public class Main{
    static String[] students = {"Siham", "Bob", "Fred"};
    static double[] grades = {3.4, 3.2, 4.0, 3.9};

    public static void getStudentGrades(int index) {
        if (index >= 0 && index <= students.length) {
            System.out.println("Student:" + students[index] + ",Grade:" + grades[index]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        getStudentGrades(2);
        getStudentGrades(1);
        getStudentGrades(5);
    }
}
