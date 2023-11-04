package day25_collecrions;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {
    public static void main(String[] args) {
        List<Integer> grade = new ArrayList<>();
        addGrade(grade, 90);
        addGrade(grade, 9);
        addGrade(grade, -9);
        System.out.println(grade);
    }

    // Create a method that adds grade to a grade list.
    public static void addGrade(List<Integer> list, int grade) {
        if (grade >= 0 && grade < 101) {
            list.add(grade);
        } else{
            throw new IllegalGradeException("Grade must be between 0 and 100...");
        }

    }

}
