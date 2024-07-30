GPA Calculator Application

Description

This application allows users to input course details and calculate their GPA based on a 5.0 scale. The application uses Java Swing for the graphical user interface (GUI) and handles data through object-oriented programming principles. Results are saved to a text file for record-keeping.

Features

- Add Course: Enter course code, course unit, and grade percentage. The application converts the percentage to GPA points and adds  the course to the list.
- Calculate GPA: Computes the GPA based on the entered courses and displays it.
- Save Results: Writes course details and the calculated GPA to `gpa.txt`.

Components

- Course Class: Encapsulates course details (code, units, grade%).
- Student Class: Manages a list of courses.
- GradeConverter Class: Converts percentage grades to GPA points.
- GPACalculator Class: Calculates GPA from a list of courses.

GUI

- Input Panel: Contains fields for course code, course unit, and grade percentage, and a button to add courses.
- Display Panel: Shows added courses and allows for scrolling.
- Result Area: Displays the calculated GPA.

Exception Handling

- Input Validation: Ensures course unit and grade are valid numbers.
- Grade Validation: Checks if the grade percentage is between 0 and 100.
- File Writing: Handles errors during file writing with appropriate messages.

Algorithm

1. Initialization: Set up GUI components and event listeners.
2. Add Course:
   - Validate and convert inputs.
   - Add course to the student's list and
