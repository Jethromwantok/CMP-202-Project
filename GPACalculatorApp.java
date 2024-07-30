package Project;

import java.util.ArrayList;

public class GPACalculatorApp {
    // Define inner class for Course
    static class Course {
        private String code;
        private int courseUnit;
        private double grade; // Grade in GPA points

        public Course(String code, int courseUnit, double grade) {
            this.code = code;
            this.courseUnit = courseUnit;
            this.grade = grade;
        }

        public String getCode() {
            return code;
        }

        public int getCourseUnit() {
            return courseUnit;
        }

        public double getGrade() {
            return grade;
        }
    }

    // Define inner class for Student
    static class Student {
        private ArrayList<Course> courses;

        public Student() {
            courses = new ArrayList<>();
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public ArrayList<Course> getCourses() {
            return courses;
        }
    }

}

    // Define method to convert percentage to GPA points
    static class GradeConverter {
        public static double convertPercentageToGPA(double percentage) {
            if (percentage >= 70.0) return 5.0;   // A
            if (percentage >= 60.0) return 4.0;   // B
            if (percentage >= 50.0) return 3.0;   // C
            if (percentage >= 45.0) return 2.0;   // D
            if (percentage >= 40.0) return 1.0;   // E
            return 0.0;                          // F
        }
    }

    // Define method to calculate GPA
    static class GPACalculator {
        public static double calculateGPA(ArrayList<Course> courses) {
            double totalPoints = 0;
            int totalCourseUnits = 0;

            for (Course course : courses) {
                totalPoints += course.getGrade() * course.getCourseUnit();
                totalCourseUnits += course.getCourseUnit();
            }

            return totalCourseUnits == 0 ? 0 : totalPoints / totalCourseUnits;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GPA Calculator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel for course input
        JPanel inputPanel = new JPanel(new GridLayout(2, 4));
        JLabel codeLabel = new JLabel("Course Code:");
        JLabel unitLabel = new JLabel("Course Unit:");
        JLabel gradeLabel = new JLabel("Grade (%):");
        JTextField courseCodeField = new JTextField();
        JTextField courseUnitField = new JTextField();
        JTextField gradeField = new JTextField();
        JButton addButton = new JButton("Add Course");

        inputPanel.add(codeLabel);
        inputPanel.add(unitLabel);
        inputPanel.add(gradeLabel);
        inputPanel.add(new JLabel("")); // Empty space
        inputPanel.add(courseCodeField);
        inputPanel.add(courseUnitField);
        inputPanel.add(gradeField);
        inputPanel.add(addButton);

        // Panel for displaying added courses
        JTextArea coursesArea = new JTextArea();
        coursesArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(coursesArea);

        // Button to calculate GPA
        JButton calculateButton = new JButton("Calculate GPA");
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Main panel to hold all components
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(calculateButton, BorderLayout.SOUTH);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(resultArea, BorderLayout.SOUTH);
