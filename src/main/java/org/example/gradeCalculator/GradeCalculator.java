package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double multipliedCreditAndGradeSum = courses.multiplyCreditAndCourseGrade();
        int totalCredit = courses.sumCreditTotal();

        return multipliedCreditAndGradeSum / totalCredit;
    }
}
