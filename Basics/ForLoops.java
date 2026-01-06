package Basics;
import java.util.Scanner;
public class ForLoops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Times Table Example
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        //For Loops with Arrays
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i]){
                System.out.println("Found a number in the array at Index: " + i);
            }
        }

        //For Each
        int count = 0;
        for(int element: arr){
            System.out.println(element + " " + count);
            count++;
        }

        //For and ForEach
        String[] array = new String[5];
        for(int i = 0; i < array.length; i++){
            System.out.print("Fill the array: ");
            String text = input.nextLine();
            array[i] = text;
        }
        for(String newArray : array){
            System.out.println(newArray);
            //Use of Breaks
            if(newArray.equals("Carl")){
                break;
            }
        }

        input.close();
    }
}