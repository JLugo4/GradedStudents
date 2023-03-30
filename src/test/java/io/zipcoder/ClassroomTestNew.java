package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class ClassroomTestNew {



    @Test
    public void addStudent() {
        //Given
        Classroom classroom = new Classroom();
        Student student = new Student("Trung", "Tran", new ArrayList<>(Arrays.asList(100.00, 105.00, 110.00)));
        //When
        classroom.addStudent(student);

        //Then
        assertTrue(classroom.getStudents().contains(student));
    }
    @Test
    public void getStudents() {
        //Given
        Classroom classroom = new Classroom();
        Collection<Student> expected = new ArrayList<>(Collections.nCopies(30,null));
        //When
        Collection<Student> actual = classroom.getStudents();
        //Then
        assertEquals(expected.size(), actual.size());

    }

    @Test
    public void getAverageExamScore() {
        //Given
        Student student1 = new Student("Trung", "Tran", new ArrayList<>(Arrays.asList(100.00, 105.00, 110.00)));
        Student student2 = new Student("Nina", "McNair", new ArrayList<>(Arrays.asList(100.00, 105.00, 110.00)));
        Classroom classroom = new Classroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        double expected = 102.5;
        //When
        double actual = classroom.getAverageExamScore();
        //Then
        Assert.assertEquals(expected, actual, -1);
    }
//    @Test
//    public void removeStudent() {
//        //Given
//
//        Classroom classroom = new Classroom();
//        classroom.removeStudent("student", "guy");
//        int expected = 0;
//        //When
//        int actual = classroom.getStudents().size();
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
}