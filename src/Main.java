
public class Main {
    public static void main(String[] args) {
        getStudentGrades(2);
        getStudentGrades(1);
        getStudentGrades(5);

            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
        }

    }
    static String[] students = {"Siham", "Bob", "Fred"};
    static double[] grades = {3.4, 3.2, 4.0, 3.9};

    public static void getStudentGrades(int index) {
        if (index >= 0 && index <= students.length) {
            System.out.println("Student:" + students[index] + ",Grade:" + grades[index]);
        } else {
            System.out.println("Invalid index");
        }
    }
}


