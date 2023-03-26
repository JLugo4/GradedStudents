package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given
// When
// Then
public class StudentTest {
    @Test
    public void testConstructor(){
        // Given
        String firstName = "Trung";
        String lastName = "Tran";
        List<Double> testScores = new ArrayList<Double>(
                Arrays.asList(100.00, 115.00, 125.00, 135.00));
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
        Student student = new Student("Trung", null, null);
        // When
        String actualFirstName = student.getFirstName();
        // Then
        Assert.assertEquals(actualFirstName, student.getFirstName());
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
        Student student = new Student(null, null, null);
        // When
        String actualLastname = student.getLastName();
        // Then
        Assert.assertEquals(actualLastname, student.getLastName());
    }

    @Test
    public void setLastName() {
        // Given
        Student student = new Student(null,"Tran", null);
        // When
        String lastname = "Tran";
        student.setLastName(lastname);
        // Then
        Assert.assertEquals(lastname, student.getLastName());
    }

    @Test
    public void getNumberOfTestsTaken() {
        // Given
        Student student = new Student(null,null,null);
        int expectedTestTaken= 3;
        for(int i = 0; i < expectedTestTaken; i++){
            student.getNumberOfTestsTaken();
        }
        // When
        int actualTestsTaken = student.getNumberOfTestsTaken();
        // Then
        Assert.assertEquals(expectedTestTaken, actualTestsTaken);
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
