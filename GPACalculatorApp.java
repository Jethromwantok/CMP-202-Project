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
