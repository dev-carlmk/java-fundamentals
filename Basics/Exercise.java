package Basics;
import java.util.Scanner;
public class Exercise{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Ask the user questions
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("What's your age?");
        int age = sc.nextInt();
        System.out.println("Enter your score:");
        int score = sc.nextInt();

        //Validate the score
        if(score<0 || score >100){
            System.out.println("Invalid score entered. Exiting......");
            System.exit(0);
        }

        //Pass/Fail
        boolean passed = score >= 50;

         //Assign a grade
        String grade = "";
        if (score>=80 && score<=100){
            grade = "A";
        }else if(score>=70 && score<=79){
            grade = "B";
        }else if(score>=60 && score<=69){
            grade = "C";
        }else if(score>=50 && score<=59){
            grade = "D";
        }else if (score<50){
            grade = "F";
        }

        //Check eligibility
        boolean eligible = age>=18 && score >=50;
        
        //Final Output
        System.out.println("\n===========RESULT============");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Status: " + (passed ? "Passed" : "Failed"));
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Eligibility: " + (eligible ? "Eligible For University" : "Not Eligible"));
        
        sc.close();
    }
}