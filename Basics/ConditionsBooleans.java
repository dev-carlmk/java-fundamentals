package Basics;
import java.util.Scanner;
public class ConditionsBooleans {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 6;
    int y = 7;
    int z = 10;

    //Comparison Operators (<,>,.equals(""),<=,=>,!=,&&,||) 
    // &&--FALSE   ||--TRUE
    boolean compare = x > z || z > x || y > x;
    System.out.println(compare);

    //IF/ELSE
    String name = sc.nextLine();
    if (name.equals("Carlos")){
        System.out.println("You typed Carlos");
    }else{
      System.out.println("Incorrect Name!");
    }

    //Nested Statement
    System.out.println("Enter your age:");
    String userText = sc.nextLine();
    int age = Integer.parseInt(userText); //Convert String to Integer
    //boolean hasID = true;

    if (age >= 18){
      System.out.println("Do you have a valid ID?");
      String ansID = sc.nextLine();
      if(ansID.equalsIgnoreCase("Yes")){
        System.out.println("You can enter!");
      }else{
        System.out.println("You need a valid ID!");
        System.exit(0);
      }
    }else{
      System.out.println("You are underage!");
      System.exit(0);
    }

    sc.close();
  
 }
}
