package Basics;
import java.util.Scanner;
public class WhileLoop{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Type a number here.....: ");
        int x = input.nextInt();

        //WHILE LOOP
        int count = 0;
        while (x != 10){
            System.out.println("\nPlease type 10 !");
            System.out.print("Type a number here.....: ");
            x = input.nextInt();
            count++;
        }
        System.out.println("\nYou tried " + count + " times.");


        //DO-WHILE LOOP
        int i;
        do {
            System.out.print("Type a number here.....: ");
            i = input.nextInt();
            count++;
        } while(i != 10);
        System.out.println("\nYou tried " + count + " times.");

        input.close();
    }
}