package OOP.ClassesExercise;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student studentInput = new Student(input.next(), input.nextInt(), input.next());
        studentInput.studentInfo();
        input.close();
    }
}