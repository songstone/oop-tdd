package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double multipliedCreditAndGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndGrade += course.getCredit() * course.getGradeToNumber();
        }

        int totalCredit = courses.stream()
            .mapToInt(Course::getCredit)
            .sum();

        return multipliedCreditAndGrade / totalCredit;
    }
}
