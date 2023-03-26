package io.zipcoder;

import java.util.*;

public class Classroom {
    private Collection<Student> students;

    public Classroom(int maxNumberOfStudents) {
        students = new ArrayList<>(Collections.nCopies(maxNumberOfStudents, null));
    }

    public Classroom(Student[] students){
        this.students = new ArrayList<>(Arrays.asList(students));
    }
    // Setting size of arrayList
    public Classroom(){
        this(30);
    }
    //Getter
    public Collection<Student>getStudents(){
        return students;
    }
    public double getAverageExamScore(){
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            sum += student.getAverageExam();
            count++;
        }
        return sum / count;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(String firstName,String lastName){
        for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();){
            Student student = iterator.next();
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                iterator.remove();
                students.add(null);
                break;
            }
        }
    }

}
