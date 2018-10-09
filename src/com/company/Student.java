package com.company;

public class Student extends Person{
    private double GPA;
    private String color;
    private String subject;

    public Student(double GPA, String color, String subject){
        super("studentFirst", "studentLast");
        this.GPA = GPA;
        this.color = color;
        this.subject = subject;
    }

    public double getGPA(){
        return GPA;
    }
    public String getColor(){
        return color;
    }
    public String getSubject() {
        return subject;
    }
    //public void getGPA(double GPA){return this.GPA;}

}
