package org.example.gradeCalculator;

public class Course {

    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double numberGrade = 0;
        switch (grade) {
            case "A+":
                numberGrade = 4.5;
                break;
            case "A":
                numberGrade = 4;
                break;
            case "B+":
                numberGrade = 3.5;
                break;
            case "B":
                numberGrade = 3;
                break;
            case "C+":
                numberGrade = 2.5;
                break;
            case "C":
                numberGrade = 2;
                break;
            case "D+":
                numberGrade = 1.5;
                break;
            case "D":
                numberGrade = 1;
                break;
        }
        return numberGrade;
    }
}
