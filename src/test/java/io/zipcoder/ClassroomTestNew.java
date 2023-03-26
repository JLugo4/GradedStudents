package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class ClassroomTestNew {
    Classroom classroom = new Classroom();
    Student student = new Student("Trung", "Tran", new ArrayList<>(Arrays.asList(100.00, 105.00, 110.00)));
    @Test
    public void addStudent() {
        //Given

        //When
        classroom.addStudent(student);

        //Then
        assertTrue(classroom.getStudents().contains(student));
    }
    @Test
    public void getStudents() {
        //Given
        Collection<Student> expected = new ArrayList<>(Collections.nCopies(30,null));
        //When
        Collection<Student> actual = classroom.getStudents();
        actual.size();
        //Then
        assertEquals(expected.size(), actual.size());

    }

    @Test
    public void getAverageExamScore() {
        //Given

        //When

        //Then
    }
    @Test
    public void removeStudent() {
        //Given

        //When

        //Then
    }
}