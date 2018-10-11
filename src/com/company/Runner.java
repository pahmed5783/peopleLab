package com.company;

public class Runner{
    static String teacher = "Mr.Folwell";
    static String firstName[] = {"Christina", "Bob", "Parker", "James", "Lily"};
    static String familyName[] = {"Chau", "Gates", "Ahmed", "Lui", "Huang"};
    static double gpa[] = {90, 87, 95, 89, 79};
    static String color[]= {"blue", "purple", "black", "red", "green"};
    static String subject[] = {"Physics", "Chemistry","Calculus", "Algebra", "Economics"};

    public static void main(String[] args){
            int num = (int)(Math.random()*6);
            String student = firstName[num] +" "+ familyName[num]+ " has GPA of "+ gpa[num]+", like the color " + color[num] + ", and has " + subject[num] + " with " + teacher;
    }
}
