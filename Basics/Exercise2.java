package Basics;
import java.util.Scanner;
public class Exercise2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //Ask the user
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("What's your age?");
        String ageText = input.nextLine();
        int age = Integer.parseInt(ageText);

        //Validate each score
        if (age>=18){
            System.out.println("What's your total number of subjects?");
            String subText = input.nextLine();
            int sub = Integer.parseInt(subText);
            System.out.println("Enter your score for each subject:");
            int[] scoreArray = new int [sub];
            System.out.println("English Score: ");
            scoreArray[0] = input.nextInt();
            System.out.println("Math Score: ");
            scoreArray[1] = input.nextInt();
            System.out.println("Science Score: ");
            scoreArray[2] = input.nextInt();
            System.out.println("Social Studies Score: ");
            scoreArray[3] = input.nextInt();
            System.out.println("Etiquette Score: ");
            scoreArray[4] = input.nextInt();
              if (scoreArray[0] <0 || scoreArray[0]>100){
                System.out.println("Invalid Score Detected !");
                System.exit(0);
              }else if (scoreArray[1] <0 || scoreArray[1]>100){
                System.out.println("Invalid Score Detected !");
                System.exit(0);
              }else if (scoreArray[2] <0 || scoreArray[2]>100){
                System.out.println("Invalid Score Detected !");
                System.exit(0);
              }else if (scoreArray[3] <0 || scoreArray[3]>100){
                System.out.println("Invalid Score Detected !");
                System.exit(0);
              }else if (scoreArray[4] <0 || scoreArray[4]>100){
                System.out.println("Invalid Score Detected !");
                System.exit(0);
              }
                
            //Calculate Total
            int totalScore = scoreArray[0] + scoreArray[1] + scoreArray[2] + scoreArray[3] + scoreArray[4];
            //Calculate Average
            int average = totalScore /5;
            //Decide Status
            boolean passed = average >=50;
            
            //Assign grade 
            String grade ="";
            if (average>=80 && average<=100){
                grade = "A";
            }else if (average>=70 && average<=79){
                grade = "B";
            }else if (average>=60 && average<=69){
                grade = "C";
            }else if (average>=50 && average<=59){
                grade = "D";
            }else if (average <50){
                grade = "F";
            }

            //Print Summary
        System.out.println("\n===========RESULT============");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);
        System.out.println("Status: " + (passed ? "Passed" : "Failed"));
        System.out.println("Grade: " + grade);
        
        } else{
            System.out.println("Sorry, you are underage !");
            System.exit(0);
        }
        
        input.close();
    }
}