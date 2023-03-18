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
        // Given
        String firstName = "Trung";
        String lastName = "Tran";
        Double[] testScores = new Double[]{
                100.00, 115.00, 125.00, 135.00};
        // When
        Student student = new Student(firstName, lastName, testScores);
        // Then
        Assert.assertEquals(firstName, student.getFirstName());
    }

    @Test
    public void setFirstName() {
        // Given
        String firstName = "Trung";
        String lastName = "Tran";
        Double[] testScores = new Double[]{
                100.00, 115.00, 125.00, 135.00};
        // When

        // Then
        // Assert
    }

    @Test
    public void getLastName() {
        // Given
        String firstName = "Trung";
        String lastName = "Tran";
        Double[] testScores = new Double[]{
                100.00, 115.00, 125.00, 135.00};
        // When
        Student student = new Student(firstName, lastName, testScores);
        // Then
        Assert.assertEquals(lastName, student.getLastName());
    }

    @Test
    public void setLastName() {
        // Given

        // When

        // Then
    }

    @Test
    public void getNumberOfTestsTaken() {
        // Given

        // When

        // Then
    }

    @Test
    public void getExamScores() {
        // Given

        // When

        // Then
    }

    @Test
    public void addExamScore() {
        // Given

        // When

        // Then
    }

    @Test
    public void setExamScore() {
        // Given

        // When

        // Then
    }

    @Test
    public void getAverageExam() {
        // Given

        // When

        // Then
    }

    @Test
    public void testToString() {
        // Given

        // When

        // Then
    }
}