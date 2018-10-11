package com.company;

public class Classroom {
    Student[] students;
    Teacher teacher;
    public Classroom (Student[] students, Teacher teacher){
        this.students = students;
        this.teacher = teacher;
    }
    public String getSubject(){
        return "Math";
    }
    public double classAverage(){
        double total = 0;
        double num = 0;
        for(int i = 0; i < this.students.length; i++){
            total += this.students[i].getGPA();
            num++;
        }
        double avg = total/num;
        return avg;
        //ooff
    }
}
