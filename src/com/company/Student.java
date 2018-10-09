package com.company;

public class Student extends Person{
    private double GPA;
    private String gender;
    private String subject;

    public Student(double GPA, String color, String subject){
        super("studentFirst", "studentLast");
        this.GPA = GPA;
        this.gender = gender;
        this.subject = subject;
    }

    public double getGPA(){
        return this.GPA;
    }
    public String getGender(){
        return this.gender;
    }
    public String getSubject() {
        return this.subject;
    }
    //public void getGPA(double GPA){return this.GPA;}

}
