package Basics;

//Import Scanner
import java.util.Scanner;

public class InputScanners {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //My Example (String and Int)
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", You're " + age + " years of age.");

        //YouTube Example
        String typeAnything = sc.next();
        System.out.println(typeAnything);

        sc.close();
    }
}
