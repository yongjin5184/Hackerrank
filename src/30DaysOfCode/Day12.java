/**
 * Created by yongjin on 2017-08-22.
 * Day 12: Inheritance
 */

import java.util.*;

class Person1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person1(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person1 {
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = scores;
    }


    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int index = this.testScores.length;
        int sum = 0;
        double average = sum / index;
        char grade;

        for (int i = 0; i < index; i++) {
            sum += this.testScores[i];
        }


        if (average <= 100 && average >= 90) {
            grade = 'O';
        } else if (average < 90 && average >= 80) {
            grade = 'E';
        } else if (average < 80 && average >= 70) {
            grade = 'A';
        } else if (average < 70 && average >= 55) {
            grade = 'P';
        } else if (average < 55 && average >= 40) {
            grade = 'D';
        } else {
            grade = 'T';
        }

        return grade;
    }
}

public class Day10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}


