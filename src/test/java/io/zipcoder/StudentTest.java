package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

// Given
// When
// Then
public class StudentTest {
    @Test
    public void testConstructor(){
        // Given
        String firstName = "Trung";
        String lastName = "Tran";
        Double[] testScores = new Double[]{
                100.00, 115.00, 125.00, 135.00};
        // When
        Student student = new Student(firstName, lastName, testScores);
        // Then
        Assert.assertEquals(firstName,student.getFirstName());
        Assert.assertEquals(lastName, student.getLastName());
        //Assert.assertEquals(testScores, student.getExamScores().toString());
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getNumberOfTestsTaken() {
    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExam() {
    }

    @Test
    public void testToString() {
    }
}