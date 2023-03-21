package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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
        Double examScore1 = 100.00;
        Double examScore2 = 105.00;
        Double examScore3 = 110.00;
        Double[] examScores = new Double[]{examScore1, examScore2, examScore3};
        Student student = new Student(null, null, Arrays.asList(examScores));
        String predictedScores = "Exam Score \n" +
                "\t Exam01->100.0\n" +
                "\t Exam11->105.0\n" +
                "\t Exam21->110.0\n";
        // When
        String actualExamScores = student.getExamScores();
        // Then
        Assert.assertEquals(predictedScores, actualExamScores);
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
   // public void convertsExamScoresToAListOfStrings() {
