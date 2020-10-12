package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {


    @Test
    public void getHighestAverageGrade() {

        List<Double> kofiMarks = new ArrayList<>((Arrays.asList(5.0,2.0,5.0)));
        Student kofi = new Student(kofiMarks);

        List<Double> JulietMarks = new ArrayList<>((Arrays.asList(75.0,82.0,95.0)));
        Student Juliet = new Student(JulietMarks);

        List<Double> AlfredMarks = new ArrayList<>((Arrays.asList(1.0,2.0,3.0)));
        Student Alfred = new Student(AlfredMarks);


        List<Student> students = new ArrayList<Student>();
        students.add(kofi);
        students.add(Juliet);
        students.add(Alfred);

   Lecture Science = new Lecture(students);

        assertEquals(84.0, Science.getHighestAverageGrade());

    }

}