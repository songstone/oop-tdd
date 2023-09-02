package org.example.gradeCalculator;

import java.util.List;

/**
 *  1급 콜렉션 : 리스트 형태의 하나의 정보만 가진 클래스
 */
public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
            .mapToDouble(Course::multipliedCreditAndGrade)
            .sum();
    }

    public int sumCreditTotal() {
        return courses.stream()
            .mapToInt(Course::getCredit)
            .sum();
    }
}
