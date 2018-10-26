package com.company;

public class Classroom {
    static Student[] students;
    Student [][] seatingChart = new Student[6][6];
    Teacher teacher;
    public Classroom(Student[] student, Teacher teacher){
        this.students = student;
        this.teacher= teacher;
        fillSeats();
    }

    public Student[][] fillSeats() {
        for(int i = 0; i < seatingChart.length; i++){
            if(i < 6){
                seatingChart[0][i] = Classroom.students[i];
            } else {
                seatingChart[1][i] = Classroom.students[i];
            }
        }
        return seatingChart;
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
        //oofff
    }
}
