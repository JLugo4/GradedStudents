package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;

    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public ArrayList<Double> getNumberOfTestsTaken () {
            return getNumberOfTestsTaken();
        }
        public String getExamScores () {
        StringBuilder sb = new StringBuilder();
            sb.append("Exam Score \n");
            for (int i = 0; i < examScores.size(); i++) {
                sb.append("\t Exam" + i+1 + "->" + examScores.get(i) + '\n');
            }

            return sb.toString();
        }

        public ArrayList<Double> addExamScore () {
            examScores.add(Double.valueOf(""));
            return examScores;
        }

        public void setExamScore ( int examNumber, double setScore){
            examScores.set(examNumber, setScore);
        }

        public double getAverageExam (){
            double sum = 0;
                for(Double score : examScores){
                sum += score;
            }
            return sum / examScores.size();
        }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + '\n' +
                "Average Score: " + getAverageExam() + '\n' +
                getExamScores();
    }

    //String listExamScores = new String(String.valueOf(examScores));

}
