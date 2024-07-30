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
