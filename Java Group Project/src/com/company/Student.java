package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> grades = new ArrayList<Double>();

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade(){
        double total =0.0;
    for(Double studentGrades:  grades){
        total = total + studentGrades;
    }
    double avgGrade = total / grades.size();
    return avgGrade;
    }
}
