package com.company;

public class Teacher extends Person {
    private String subject;
    private String title;

    public Teacher(String Subject, String Title) {
        super("studentFirst", "studentLast");
        this.subject = subject;
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }
//hee
    public String toString() {
        return this.title + "." + " " + this.getFamilyName();
    }
}